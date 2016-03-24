package generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HealthLibrary implements WordLibrary {
	
	@Override
	public List<String> getPersons() {
		return new ArrayList(Arrays.asList("Health of people", "Your Health", "Our health", "Children health", "Body"));
	}
	
	@Override
	public List<String> getNouns() {
		return new ArrayList(Arrays.asList("Good", "Bad", "Not So Well", "Very Bad"));
	}

	@Override
	public List<String> getVerbs() {
		return new ArrayList(Arrays.asList("is", "was", "will be", "probably will be"));
	}

}
