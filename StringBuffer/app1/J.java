package app1;

public class J {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hellotoall");
		System.out.println(sb);          // 0123456789
		sb.delete(2, 3000);
		System.out.println(sb);
		//String s = new String("hello");
		//String s2 = s.substring(0);
		//System.out.println(s2);
		
	}
}
/*
 * no exception while going beyond.
 * in case of delete second argument any int number beyond the length
 * */
