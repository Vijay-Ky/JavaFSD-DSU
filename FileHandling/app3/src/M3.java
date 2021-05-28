package com.lara;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class M3 {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("test2.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		A a1 = (A) in.readObject();
		System.out.println(a1);
		A a2 = (A) in.readObject();
		System.out.println(a2);
		A a3 = (A) in.readObject();
		System.out.println(a3);
		A a4 = (A) in.readObject();
		System.out.println(a4);		
	}
}
