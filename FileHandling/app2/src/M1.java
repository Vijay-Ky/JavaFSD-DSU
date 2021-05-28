package io2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M1 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("test1.txt");
		FileWriter out = new FileWriter(f1);
		out.write("Hello");
		out.write("test");
		out.write("abc");
		out.write("xyz");
		out.write("end");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
