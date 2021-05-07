class M21 
{
	public static void main(String[] args) 
	{
		G.method1(new D()
				  {
					public void test1()
					{
						System.out.println("D.AIC.test1()");
					}
					public void test2()
					{
						System.out.println("D.AIC.test2()");
					}
				  });
		System.out.println("done");
	}
}
