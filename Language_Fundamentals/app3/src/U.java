class U
{
	public static void main(String[] args)
	{
		int i = 0;
		int j = ++i + i + ++i + i;//1 + 1 + 2 + 2
		i = 0;
		int k = --i + i + --i + i;//-1 + -1 + -2 + -2
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}