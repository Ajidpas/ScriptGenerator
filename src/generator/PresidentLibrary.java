package generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PresidentLibrary implements WordLibrary {

	@Override
	public List<String> getPersons() {
		return new ArrayList(Arrays.asList("President", "Poroshenko", "Obama", "Ministr"));
	}
	
	@Override
	public List<String> getNouns() {
		return new ArrayList(Arrays.asList("meeting", "letter", "law", "designation"));
	}

	@Override
	public List<String> getVerbs() {
		return new ArrayList(Arrays.asList("created", "added", "brought", "performed"));
	}

}
