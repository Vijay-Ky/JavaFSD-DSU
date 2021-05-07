class I	
{
	class B
	{
	}
	static class C
	{
	}
}
class J
{
	public static void main(String[] args) 
	{

		//compulsary we should use the reference of I because it is outside the J class now.
		I.B b1 = new I().new B();
		I.C c1 = new I.C();
		System.out.println("done");
	}
}