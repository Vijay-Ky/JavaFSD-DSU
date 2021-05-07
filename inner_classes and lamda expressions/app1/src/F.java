class F
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
		//we can supply reference of outer class or object to create B class object
		//reference will be pointing to object only
		B b1 = new F().new B();
		C c1 = new C();
		System.out.println("done");
	}
}