class K 
{
	public static void main(String[] args) 
	{
		//3rd type of inner class
		//we can develop an inner class inside a method,constructor,IIB,SIB
		//it is the local inner class
		//class A visibility now within the main method
		class A
		{
			void test()
			{
				System.out.println("from A");
			}
		}
		A a1 = new A();
		a1.test();
		System.out.println("done");
	}
}

