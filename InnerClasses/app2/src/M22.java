class M22 
{
	static D method1()
	{
		D d1 = new D()
		{
			public void test1()
			{
				System.out.println("from test1 AIC");
			}
			public void test2()
			{
				System.out.println("from test2 AIC");
			}
		};
		return d1;
	}
	public static void main(String[] args) 
	{
		D obj = method1();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
