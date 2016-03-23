package generator;

public class Runner {
	
	public static void main(String[] args) {
		NewsTableGen gen = new NewsTableGen();
		System.out.println(gen.generat(10));
	}

}
