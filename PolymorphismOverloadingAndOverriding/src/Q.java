class P
{
	void test1(int i)
	{
		System.out.println("from test1.P");
	}
}

class Q extends P
{
	int test1()
	{
		System.out.println("from test1.Q");
		return 0;
	}
	public static void main(String[] args) 
	{
		P p1 = new Q();
		//p1.test1();
		p1.test1(10);
	}
}
