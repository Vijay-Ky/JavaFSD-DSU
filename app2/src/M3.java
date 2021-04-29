import java.util.ArrayList;
import java.util.Iterator;


public class M3 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(60);
		list.add(40);
		list.add(20);
		System.out.println(list);
		
		//collection api supports reading operation through iterators
		//through iterator also we can able to read every element from the arraylist.
		Iterator it = list.iterator();
		//as long as elements are there hasNext method returns true
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
