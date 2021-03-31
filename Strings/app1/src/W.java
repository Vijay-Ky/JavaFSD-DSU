package app1;

public class W {

	public static void main(String[] args) {
		String s1 = "abc"+ null;
		System.out.println(s1.length());
	}
}
/* now the content is abcnull and the length is 7*/