package com.lara;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	@Override
	public String toString() {
		return "i = " + i;
	}
}
public class M2 {
	public static void main(String[] args) throws Exception {
		A a1 = new A(90);
		A a2 = new A(190);
		A a3 = new A(910);
		A a4 = new A(901);
		FileOutputStream fout = new FileOutputStream("test2.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(a1);
		out.writeObject(a2);
		out.writeObject(a3);
		out.writeObject(a4);
		System.out.println("done");
	}
}



