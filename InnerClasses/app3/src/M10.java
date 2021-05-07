//this annotation is only allowed for only single method interfaces
@FunctionalInterface
interface A
{
	int test(int i, int j);
}

class M10
{
	public static void main(String[] args) 
	{
		A a2 = (x, y) -> {
							System.out.println("from test");					
							return	x + y;
						 };
		int i = a2.test(10, 20);
		System.out.println(i);
	}
}
