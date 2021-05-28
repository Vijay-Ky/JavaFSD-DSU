package io2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M2 {
	public static void main(String[] args) throws IOException{
		File f1 = new File("test2.txt");
		FileWriter out = new FileWriter(f1);
		out.write("Hello");
		out.write("test");
		out.write("abc");
		out.write("\n");
		out.write("xyz");
		out.write("end");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
