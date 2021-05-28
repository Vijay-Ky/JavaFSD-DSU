package com.lara;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class M5 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		FileInputStream fin = new FileInputStream("test3.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		B b1 = (B) in.readObject();
		System.out.println(b1);
	}
}
