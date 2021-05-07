//non-static, static, local inner classes

//outer class cant be static
//static is applied to the only members of a class
class D
{
	//inner class
	//non-static member of A
	class B
	{
	}
	//another inner class
	//static memeber of A
	static class C
	{
	}
	public static void main(String[] args) 
	{
		//cant use B inside main method to create the object inside the main method
		//we can only use B for specifying the datatype.
		//B b1 = new B();
		C c1 = new C();
		System.out.println("done");
	}
}