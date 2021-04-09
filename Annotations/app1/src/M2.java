@interface D
{
	int someDesc();
}

@D(someDesc = 100)
class M2
{
	@D(someDesc = 20)
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
