@N(message = "abc")
class M14
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
/*
1. while compiling, message = "abc" moving to the class file
2. while running when M14 loading to the memory along with the 
   class, message = abc also loading.
*/