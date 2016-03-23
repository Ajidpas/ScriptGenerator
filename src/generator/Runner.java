package generator;

import java.io.FileWriter;
import java.io.IOException;

public class Runner {
	
	public static void main(String[] args) {
		NewsTableGen gen = new NewsTableGen();
		String script = gen.generat(10);
//		System.out.println(gen.generat(10));
		try (FileWriter fw = new FileWriter("ScriptFile.txt")) {
			fw.write(script);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("done");
	}

}
