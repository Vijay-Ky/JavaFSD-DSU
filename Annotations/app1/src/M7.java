@interface I
{
	int version() default 1;
	String author() default "vijay";
}

@I(author =  "abc")
class M7
{
	//both can be skipped bcz of default values
	@I
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
