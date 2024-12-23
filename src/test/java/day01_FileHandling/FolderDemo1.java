package day01_FileHandling;

import java.io.File;

public class FolderDemo1 {

	public static void main(String[] args) {
		
		File folder=new File("D:\\software\\TestFolder");
		
		System.out.println(folder.mkdir());
		
		System.out.println("End of Program..");
		

	}

}