package com.lara;

import java.io.PrintStream;

public class M13 {
	public static void main(String[] args) throws Exception{
		PrintStream p1 = new PrintStream("test9.log");
		PrintStream p2 = System.out;
		p1.println(1); // f
		p2.println(2); // c
		System.out.println(3); // c 
		System.setOut(p1); 
		p1.println(4); //f 
		p2.println(5);  // c
		System.out.println(6); //f
		System.setOut(p2);
		p1.println(7); //f 
		p2.println(8);  //c
		System.out.println(9); //c 
		System.out.println("end");
	}
}
