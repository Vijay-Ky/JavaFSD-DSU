class M12
{
	public static void main(String[] args) 
	{
		C c1 = new C()
		{
			void test1()
			{
				System.out.println("from AIC.test1()");
			}
			void test2()
			{
				System.out.println("from AIC.test2()");
			}
		};
		c1.test1();
		c1.test2();
		System.out.println("done");
	}
}
