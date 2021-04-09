@interface G
{
	int version();
	String author();
}

//CTE
@G(author =  "abc")
class M5
{
	@G(author = "abc", version = 4)
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}