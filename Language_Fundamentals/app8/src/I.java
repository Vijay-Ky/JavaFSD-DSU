class I
{
	public static void main(String[] args)
	{
		int i = 0;
		switch(i)
		{
			case 2:
			//case 2:
			case 4:
			case 6:
			case 8:
			case 10:
			System.out.println("even");
			break;
			case 1:
			case 3:
			case 5:
			case 7:
			System.out.println("odd");
			break;
			default:
			System.out.println("not matching");
		}
	}
}
