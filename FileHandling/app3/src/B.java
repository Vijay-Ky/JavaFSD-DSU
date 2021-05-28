package com.lara;

import java.io.Serializable;

public class B implements Serializable{
	int i;
	transient int j;
	static int k;
	B(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", " + k + ")";
	}
}
