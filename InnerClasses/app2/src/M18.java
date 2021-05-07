class M18
{
	public static void main(String[] args) 
	{
		E e1 = new E();
		e1.method1(new A()
				   {
						void test2()
						{
							System.out.println("from A.AIC.test2");
						}
				   });
		System.out.println("done");
	}
}
