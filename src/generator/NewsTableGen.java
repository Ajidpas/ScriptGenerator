package generator;

import java.util.EnumSet;

import generator.Generator.Library;

public class NewsTableGen {
	
	public NewsTableGen() {
	}
	
	public String generat(int countForEachHeading) {
		StringBuilder script = new StringBuilder();
		script.append("INSERT INTO news ");
		script.append("(title, creating_date, updating_date, heading) ");
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
			items.append("', '");
			items.append(gen.getUpdatingDate());
			items.append("', ");
			items.append(gen.getHeadingId());
			items.append("),");
		}
		return items.toString();
	}

}
