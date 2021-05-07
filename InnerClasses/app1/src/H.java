class H	
{
	class B
	{
	}
	static class C
	{
	}
	public static void main(String[] args) 
	{
//while specifying inner class for the datatype purpose, we have to go for outer.inner
//no matter inner is static, non-static
		H.B b1 = new H().new B();
		H.C c1 = new H.C();
		System.out.println("done");
	}
}