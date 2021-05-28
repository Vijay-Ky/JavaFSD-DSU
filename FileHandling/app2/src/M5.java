package io2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M5 {
	public static void main(String[] args) {
		File f1 = new File("test5.txt");
		try (FileWriter out = new FileWriter(f1))  //JDK1.7
		{
			out.write("hello");
			out.write("test");
			out.write("end");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
