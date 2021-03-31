package app1;

public class E {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(2000);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		sb.append("12345678911234567");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
/*
 * default capacity is 16 but we can specify the capacity explicitley
 
 *StringBuffer
public StringBuffer(int capacity)
Constructs a string buffer with no characters in it and the specified initial capacity.
Parameters:
capacity - the initial capacity.
Throws:
NegativeArraySizeException - if the capacity argument is less than 0.
 *
 */
