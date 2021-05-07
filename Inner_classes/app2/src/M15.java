class M15
{
	public static void main(String[] args) 
	{
		D d1 = new D()
		{
			public void test1()
			{
				System.out.println("from test1");
			}
			public void test2()
			{
				System.out.println("from test2");
			}
		};
		d1.test1();
		d1.test2();
		System.out.println("done");
	}
}
