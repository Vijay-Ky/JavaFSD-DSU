class V
{
	static
	{
		System.out.println("V-SIB");
	}
	public static void main(String[]args)
	{
		System.out.println("V-main-begin");
		U.main(null);
		System.out.println("-----");
		U.main(null);
		System.out.println("V-main-end");
	}
}