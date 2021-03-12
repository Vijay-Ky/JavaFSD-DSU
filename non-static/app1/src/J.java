class J
{
	void test1()
	{
		System.out.println("from test1");
	}
	static void test2()
	{
		J obj = new J();
		obj.test1();
		System.out.println("from test2");
	}
}