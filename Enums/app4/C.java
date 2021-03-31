package app4;
//EnumSet is a part of java.util
import java.util.EnumSet;

enum B
{
	abc, xyz, test;
}
class C
{
	public static void main(String[] args)
	{
		//EnumSet is an abstract class
		//EnumSet used for making a group of few constants of an enum or all constants of an enum
		//EnumSet is introduced to store one enum constant or all enum constant
		EnumSet<B> set = EnumSet.of(B.abc, B.xyz, B.test);
		for(B b1 : set)
		{
			System.out.println(b1);
		}
	}
}
/*
EnumSet is used to group few or all constants of an enum
*/
