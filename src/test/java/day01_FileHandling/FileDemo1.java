package day01_FileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\software\\Test.txt");

		System.out.println(f.createNewFile());

		System.out.println("End of Program");

	}

}
