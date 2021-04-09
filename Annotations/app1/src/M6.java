@interface H
{
	int version() default 1;//while declaring setting default value
	String author();
}
//now version is optional
@H(author =  "abc")
class M6
{
	//here we are overriding the default value to 4
	//for the main method version return value is 4
	@H(author =  "abc", version = 4)
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
//while using annotation default value given method can be skipped