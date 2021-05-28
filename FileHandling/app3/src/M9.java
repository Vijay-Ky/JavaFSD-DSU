package com.lara;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M9 {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		I obj1 = new I(10, 30.0, "xyz");
		FileOutputStream fout = new FileOutputStream("test8.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		obj1.writeExternal(out);
		out.flush();
		System.out.println("done");
		
		I obj2 = new I(0, 0.0, null);
		System.out.println(obj2);
		FileInputStream fin = new FileInputStream("test8.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		obj2.readExternal(in);
		
		System.out.println(obj2);
	}
}
