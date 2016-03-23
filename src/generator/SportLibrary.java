package generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SportLibrary implements WordLibrary {

	@Override
	public List<String> getPersons() {
		return new ArrayList(Arrays.asList("Football", "Basketball", "Hokey", "Volleyball"));
	}
	
	@Override
	public List<String> getNouns() {
		return new ArrayList(Arrays.asList("performed", "played", "performed", "closed"));
	}

	@Override
	public List<String> getVerbs() {
		return new ArrayList(Arrays.asList("was", "will be", "maybe was", "probably will be", "will not be"));
	}
	
}
