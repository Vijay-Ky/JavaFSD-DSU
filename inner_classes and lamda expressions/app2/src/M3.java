class M3
{
	public static void main(String[] args) 
	{
		A a1 = new A()
		{
			void test2()
			{
				System.out.println("AIC.test2()");
			}
		};
		a1.test1();
		a1.test2();
	}
}
