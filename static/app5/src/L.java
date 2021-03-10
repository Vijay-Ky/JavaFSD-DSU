class L
{
	static
	{
		System.out.println("SIB-L");
	}
	public static void main(String[] args)
	{
		System.out.println("L-main");
	}
}
class M
{
	static
	{
		System.out.println("SIB-M");
	}
	public static void main(String[] a)
	{
		System.out.println("M-main-begin");
		L.main(a);
		System.out.println("M-main-end");
	}
}
