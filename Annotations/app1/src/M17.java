class T
{
	void test1()
	{
	}
}
class U extends T
{
	//built-in annotation
	//it is only allowed to use override a method
	@Override
	void test1()
	{
	}
	//@Override// CTE // its not overrided
	void test2()
	{
	}
}
class M17 {

	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
