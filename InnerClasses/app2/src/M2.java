class M2 
{
	public static void main(String[] args) 
	{
		//this is the class construction
		//for this class there is no name, for this class super class is A
		//super class constructor is a no-arg constructor
		//sub-class doesnt have a name bcz of that we are calling it as anonymous-inner class
		//a1 is pointing to an object of sub-class to A
		//for this anonymous inner class we only specifying what is the super class
		  //and what is the super class constructor
		//from class A two methods got inherited between two only one got overrided.
		//anonymous inner class developing for only one time usage
		//anonymous inner class cant be an abstract class
		//for the aic we cant develop constructor bcz there is no name to the aic.
		A a1 = new A()
		{
			void test1()
			{
				System.out.println("AIC.test1()");
			}
		};
		a1.test1();
		a1.test2();
	}
}
/*
A a1 = new A()
		{
			void test1()
			{
				System.out.println("AIC.test1()");
			}
		};

here we are not creating an object to A but an object to subclass of A

*/