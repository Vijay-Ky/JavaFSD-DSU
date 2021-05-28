package com.lara;

import java.io.Serializable;

class E  
{
	int i;
	E()
	{
		i = 1;
		System.out.println("E()");
	}
}
class F extends E
{
	int j;
	F()
	{
		j = 2;
		System.out.println("F()");
	}
}
public class G extends F implements Serializable{
	int k;
	G()
	{
		k = 3;
		System.out.println("G()");
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", " + k + ")";
	}
}




