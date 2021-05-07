interface A
{
	int test();
}
class M7
{
	public static void main(String[] args) 
	{
		//if multiple statements then braces if braces are there then return statement is madatory
		A a2 = () ->{
						System.out.println("from test:LE");
						return 2000;
					};
		int i = a2.test();
		System.out.println(i);
	}
}
