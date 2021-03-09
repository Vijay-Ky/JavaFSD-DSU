class R
{
	public static void main(String[] args)
	{
		for(int i = 1; i < 8; i++)
		{
			System.out.println("loop begin");
			if(i > 5)
			{
				break;
			}
			System.out.println("loop end");
		}
		System.out.println("main end");
	}
}
