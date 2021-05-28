package com.lara;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class H implements Serializable
{
	int x;
	double y;
	String z;
	
	H(int x, double y, String z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public String toString() {
		return "(" + x + ", " + y + ", " + z + ")";
	}
	
	private void writeObject(ObjectOutputStream out) throws IOException 
	{
		System.out.println("i am from writeObject");
		out.defaultWriteObject();
		out.writeInt(5000);
	}
	
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException 
	{
		System.out.println("i am from readObject");
		in.defaultReadObject();
		int data = in.readInt();
		System.out.println(data);
	}
	
}









