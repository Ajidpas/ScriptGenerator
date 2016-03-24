package generator;

import java.util.List;

public class TagsTableGen implements TableGen {
	
	@Override
	public String generat(int dummyInt) {
		StringBuilder script = new StringBuilder();
		script.append("INSERT INTO tags ");
		script.append("(tag_word) ");
		script.append("VALUES ");
		WordLibrary[] libs = {new SportLibrary(), new PresidentLibrary(), new HealthLibrary()};
		for (WordLibrary lib : libs) {
			script.append(addItems(lib));
		}
		script.deleteCharAt(script.length() - 1);
		script.append(";");
		return script.toString();
	}
	
	private String addItems(WordLibrary lib) {
		List<String> words = lib.getNouns();
		words.addAll(lib.getPersons());
		words.addAll(lib.getVerbs());
		StringBuilder items = new StringBuilder();
		for (String word : words) {
			items.append("('");
			items.append(word);
			items.append("'),");
		}
		return items.toString();
	}

}
