@interface F
{
	int version();
	String author();
}

@F(version = 3, author =  "abc")
class M4
{
	//CTE
	@F(version = 4)
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
