package com.lara;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class M4 {
	public static void main(String[] args) throws Exception{
		B b1 = new B(10, 20, 40);
		FileOutputStream fout = new FileOutputStream("test3.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(b1);
		System.out.println("done");
	}
}
