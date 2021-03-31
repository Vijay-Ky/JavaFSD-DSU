package app4;

import java.util.EnumSet;

enum D
{
	abc, xyz, test;
}
enum E
{
	con1, con2, con3;
}
class F
{
	public static void main(String[] args)
	{
		EnumSet<D> set1 = EnumSet.of(D.abc, D.xyz);
		for(D en : set1)
		{
			System.out.println(en);
		}
		EnumSet<E> set2 = EnumSet.of(E.con2, E.con1);
		for(E en : set2)
		{
			System.out.println(en);
		}
		//we cant store constants of diff enums in one Enumset
	}
}
