package generator;

import java.util.List;
import java.util.Random;

public class Generator {
	
	private WordLibrary lib;
	
	private int[] range;
	
	private String creatingDate;
	
	private String updatingDate;
	
	private static final Random RAND = new Random();
	
	public Generator(Library libType) {
		switch (libType) {
			case POWER:
				lib = new PresidentLibrary();
				range = new int[]{1, 4, 5, 6, 7, 8, 9, 10, 11};
				break;
			case SPORT:
				lib = new SportLibrary();
				range = new int[]{2, 12, 13, 14, 15, 16, 17};
				break;
			case HEALTH:
				lib = new HealthLibrary();
				range = new int[]{3, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29};
				break;
		}
		creatData();
	}
	
	private void creatData() {
		String year = Integer.toString(RAND.nextInt(5) + 10);
		String month = Integer.toString(RAND.nextInt(11) + 1);
		String day = Integer.toString(RAND.nextInt(28));
		int i = Integer.parseInt(day);
		String dayUpdate = Integer.toString(i < 25 ? i + 3 : i); 
		creatingDate = year + ":" + month + ":" + day;
		updatingDate = year + ":" + month + ":" + dayUpdate;
	}

	public String getTitle() {
		StringBuilder stringBuilder = new StringBuilder();
		
		List<String> personList = lib.getPersons();
		int index = RAND.nextInt(personList.size());
		String person = personList.get(index);
		
		List<String> verbList = lib.getVerbs();
		index = RAND.nextInt(verbList.size());
		String verb = verbList.get(index);
		
		List<String> nounList = lib.getNouns();
		index = RAND.nextInt(nounList.size());
		String noun = nounList.get(index);
		
		stringBuilder.append(person);
		stringBuilder.append(" ");
		stringBuilder.append(verb);
		stringBuilder.append(" ");
		stringBuilder.append(noun);
		return stringBuilder.toString();
	}
	
	public int getHeadingId() {
		return range[RAND.nextInt(range.length)];
	}
	
	public String getCreatingDate() {
		String year = Integer.toString(RAND.nextInt(5) + 10);
		String month = Integer.toString(RAND.nextInt(11) + 1);
		String day = Integer.toString(RAND.nextInt(28));
		int i = Integer.parseInt(day);
		String dayUpdate = Integer.toString(i < 25 ? i + 3 : i); 
		creatingDate = year + ":" + month + ":" + day;
		updatingDate = year + ":" + month + ":" + dayUpdate;
		return creatingDate;
	}
	
	public String getUpdatingDate() {
		return updatingDate;
	}
	
	public enum Library {
		POWER, SPORT, HEALTH
	}

}
