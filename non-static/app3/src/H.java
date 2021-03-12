class H
{
	H(int i)
	{
		System.out.println("H(int)");
	}
	{
		System.out.println("IIB1");
	}
	H()
	{
		this(10);
		System.out.println("H()");
	}
	{
		System.out.println("IIB2");
	}
	public static void main(String[]args)
	{
		H h1 = new H();
		System.out.println("-----");
		H h2 = new H(20);
		System.out.println("-----");
	}
}