package testscripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A_Sample {

	public static void main(String[] args) throws FileNotFoundException {
		
		// D:\FLM31stJulWS\HybridFrameWork\src\test\resources\properties\config.properties
//		C:\Users\sativ\eclipse-workspace\HybridFramework\src\test\resources\TestData\properties\config.properties
		
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\properties\\config.properties");
		
		FileInputStream fis1= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\TestData\\properties\\config.properties");

	}

}