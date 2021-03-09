class M
{
	public static void main(String[] args)
	{
		int i, j;
		for(i = 0, j = 20;
		(i < 15 || j > 15);
			i++, j--)
		{
			System.out.println(i + "," + j);
		}
		System.out.println(i + "," + j);
	}
}
/* i = 15   j = 5
0, 20
1, 19
2, 18
3, 17
4, 16
5, 15
6, 14
7, 13
8, 12
9, 11
10, 10
11, 9
12, 8
13, 7
14, 6
15, 5
*/



