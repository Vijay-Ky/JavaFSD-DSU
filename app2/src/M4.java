import java.util.ArrayList;
import java.util.ListIterator;

public class M4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(60);
		list.add(40);
		list.add(20);
		System.out.println(list);
		
		//using listIterator also we can able to read every element from the arraylist.
		ListIterator it = list.ListIterator();
		//as long as elements are there hasNext method returns true
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
