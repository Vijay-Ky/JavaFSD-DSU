@interface E
{
	int version();
	String author();
}

@E(version = 3, author =  "abc")
class M3
{
	@E(version = 4, author =  "xyz")
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}

//inside annotation any no. of method declaration we can have