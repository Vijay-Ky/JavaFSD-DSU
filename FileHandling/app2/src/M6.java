package io2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M6 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("test3.txt");
		char[] chars = new char[50];
		FileReader fin = new FileReader(f1);
		fin.read(chars);
		fin.close();
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
