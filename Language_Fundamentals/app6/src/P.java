class P
{
	public static void main(String[] args)
	{
		int i;
		for(i = 0, System.out.println("INITIALIZER");
		i < 5;
		i++, System.out.println("INCREMENT"))
		{
			System.out.println("BODY");
		}
	}
}
/*
INITIALIZER
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT
BODY
INCREMENT
*/