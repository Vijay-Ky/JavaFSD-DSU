class L
{
	static void test1()
	{
		System.out.println("from test1.L");
	}
}

class M extends L
{
	static void test1()
	{
		System.out.println("from test1.M");
	}
	public static void main(String[] args) 
	{
		L l1 = new M();
		l1.test1();
		l1.test1();
	}
}
