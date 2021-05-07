interface A
{
	void test();
}
class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			public void test()
			{
				System.out.println("from test AIC");
			}
		};
		a1.test();
		System.out.println("--------------");
		
		A a2 = () -> System.out.println("from test from LE");
		a2.test();
	}
}
//lambda expressions 1.8







