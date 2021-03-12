class H
{
	static int i;
	static
	{
		System.out.println(j = 10);
		i = i;
		System.out.println(i);
		System.out.println(j = 15);
	}
	static int j = 20;
	
	public static void main(String[]args)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println("done");
	}	
}
