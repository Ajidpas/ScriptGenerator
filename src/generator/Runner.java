package generator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Runner {
	

//	private static final Random RAND = new Random();
	
	public static void main(String[] args) {
		TableGen newsGen = new NewsTableGen();
		TableGen reviewGen = new ReviewTableGen();
		TableGen tagsGen = new TagsTableGen();
		String newsScript = newsGen.generat(50);
		String reviewScript = reviewGen.generat(50);
		String tagsScript = tagsGen.generat(0);
//		System.out.println(gen.generat(10));
		try (FileWriter newsWriter = new FileWriter("NewsScriptFile.txt");
				FileWriter reviewWriter = new FileWriter("ReviewScriptFile.txt");
				FileWriter tagsWriter = new FileWriter("TagsScriptFile.txt")) {
			newsWriter.write(newsScript);
			reviewWriter.write(reviewScript);
			tagsWriter.write(tagsScript);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("done");
//		System.out.println(Integer.toString(RAND.nextInt(5) + 10));
	}

}
