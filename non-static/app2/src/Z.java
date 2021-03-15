class Z
{
	static
	{
		System.out.println("SIB begin");
		Z z1 = new Z();
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
		System.out.println("-----");
	}
}