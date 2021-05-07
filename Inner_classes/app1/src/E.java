//non-static, static, local inner classes

//outer class cant be static
//static is applied to the only members of a class
class E
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
		E e1 = new E();
		//using reference of E class then its fine
		B b1 = e1.new B();
		C c1 = new C();
		System.out.println("done");
	}
}