package com.lara;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class M7 {
	public static void main(String[] args) throws Exception{
		G g1 = new G();
		g1.i = 10;
		g1.j = 20;
		g1.k = 30;
		FileOutputStream fout = new FileOutputStream("test6.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(g1);
		System.out.println("done");
		
		FileInputStream fin = new FileInputStream("test6.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		G g2 = (G) in.readObject();
		System.out.println(g2);
		System.out.println(g1 == g2);		
	}
}
