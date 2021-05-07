class L 
{
	public static void main(String[] args) 
	{
		//method inside method is not possible in java
		//method cant be inside method,SIB,IIB,constructor
		void test()
		{
			System.out.println("from A");
			System.out.println("from A");
			System.out.println("from A");
			System.out.println("from A");
		}
		test();
		test();
		test();
		System.out.println("done");
	}
}
