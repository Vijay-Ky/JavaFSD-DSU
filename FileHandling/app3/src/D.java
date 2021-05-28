package com.lara;

import java.io.Serializable;

class C implements Serializable
{
	int i;
}
public class D extends C{
	int j;
	D(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
}
