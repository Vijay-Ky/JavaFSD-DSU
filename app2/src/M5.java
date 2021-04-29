import java.util.ArrayList;
import java.util.Collections;
public class M5
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list1 = new ArrayList();
		list1.add(940);
		list1.add(950);
		list1.add(90);
		list1.add(80);
		list1.add(20);
		list1.add(10);
		list1.add(88);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);
		//binary search always requires sorted container
		//after sorting only we need to perform binary search
		//otherwise we get junk values
		int i = Collections.binarySearch(list1, 10);
		System.out.println(i);
	}
}
