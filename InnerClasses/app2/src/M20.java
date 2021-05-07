class M20 
{
	public static void main(String[] args) 
	{
		F.method1(new C()
			      {
					void test2()
					{
						System.out.println("from AIC test2");
					}
				  });
		System.out.println("done");
	}
}
