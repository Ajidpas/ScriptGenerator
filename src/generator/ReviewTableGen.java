package generator;

import java.util.EnumSet;

import generator.Generator.Library;

public class ReviewTableGen implements TableGen {
	
	/**
	 * 
	 * @param countForEachHeading quantity of news for each first level heading.
	 * It means that for all subheadings of the first-level heading (inclusive) 
	 * there will be this number of news. Here are 3 first-level headings, so 
	 * for all database it will be 30 news if we type number 10.
	 * @return
	 */
	@Override
	public String generat(int countForEachHeading) {
		StringBuilder script = new StringBuilder();
		script.append("INSERT INTO review ");
		script.append("(theme, publication_date, heading) ");
		script.append("VALUES ");
		for (Library lib : EnumSet.of(Library.POWER, Library.SPORT, Library.HEALTH)) {
			Generator gen = new Generator(lib);
			script.append(addItem(gen, countForEachHeading));
		}
		script.deleteCharAt(script.length() - 1);
		script.append(";");
		return script.toString();
	}
	
	private String addItem(Generator gen, int count) {
		StringBuilder items = new StringBuilder();
		for (int i = 0; i < 50; i++) {
			items.append("('");
			items.append(gen.getTitle());
			items.append("', '");
			items.append(gen.getCreatingDate());
			items.append("', ");
			items.append(gen.getHeadingId());
			items.append("),");
		}
		return items.toString();
	}

}
