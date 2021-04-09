@interface J
{
	int version() default 1;
	String author() default "vijay";
	String platform() default "windows";
}

@J(author =  "abc")
class M8
{
	@J(author = "Manu")
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}

//all the methods are now optional