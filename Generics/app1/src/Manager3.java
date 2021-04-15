class D <Z>
{
	String s1;
	Z s2;
}
class Manager3
{
	public static void main(String[] args)
	{
		D d1 = new D();
		d1.s2 = 100;
		d1.s1 = "abc";
	/*	D<String>d2=new D<String>();
		d1.s2 = "abc";
		d1.s1 = "abc";
		D <Double>d3=new D<Double>();
		d3.s2=9.989;
		d3.s1 = "abc";
		System.out.println("done");*/
		System.out.println(d1.s2 + ":" + d1.s1);
	}
}