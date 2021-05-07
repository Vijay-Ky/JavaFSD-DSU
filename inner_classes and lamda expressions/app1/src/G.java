class G
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
		B b1 = new G().new B();
		//C is a static member this can be accesses through class name
		C c1 = new G.C();
		System.out.println("done");
	}
}