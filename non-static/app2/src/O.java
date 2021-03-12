class O
{
	O()
	{
		this(10);
		System.out.println("O()");
	}
	O(int i)
	{
		System.out.println("O(int)");
	}
	public static void main(String[]args)
	{
		O o1 = new O();
		System.out.println("-----");
		O o2 = new O(20);
		System.out.println("-----");
	}
}