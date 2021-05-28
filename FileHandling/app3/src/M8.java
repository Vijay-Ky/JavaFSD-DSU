package com.lara;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M8 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		H h1 = new H(10, 30.0, "xyz");
		FileOutputStream fout = new FileOutputStream("test7.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(h1);
		System.out.println("done");
		
		FileInputStream fin = new FileInputStream("test7.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		H h2 = (H) in.readObject();
		
		System.out.println(h1);
		System.out.println(h2);
	}
}
