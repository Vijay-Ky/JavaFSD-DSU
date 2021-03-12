class Z
{
	static
	{
		System.out.println("SIB begin");
		Z z1 = new Z();
		System.out.println("SIB: z1" + z1);
		System.out.println("SIB end");
	}
	Z()
	{
		System.out.println("Z()");
	}
	public static void main(String[]args)
	{
		System.out.println("-----");
		Z z1 = new Z();
		Z z2 = z1;
		System.out.println("main: z1" + z1);
		System.out.println("main: z2" + z2);
		System.out.println("-----");
	}
}