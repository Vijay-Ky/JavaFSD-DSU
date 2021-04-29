package app1;

public class X {
	public static void main(String[] args) {
		int[] x = { 1, 8, 3, 3, 9, 3, 3 };
		int endindex = x.length - 1;
		int startindex = 0;
		int sumleft = 0;
		int sumright = 0;
		while (true) {
			if (sumleft > sumright) {
				sumright += endindex--;
			} else {
				sumleft += startindex++;
			}
			if (startindex > endindex) {
				if (sumleft == sumright) {
					System.out.println(endindex);
				} else {
					System.out.println("dont have");
				}
				break;
			}
		}
	}
}