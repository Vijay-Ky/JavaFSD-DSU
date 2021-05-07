interface A
{
	int test(int i, int j);
}
class M8
{
	public static void main(String[] args) 
	{
		A a2 = (x, y) -> x + y;
		int i = a2.test(10, 20);
		System.out.println(i);
	}
}
