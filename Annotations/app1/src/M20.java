import java.util.ArrayList;

@SuppressWarnings({"unchecked", "deprecation"})
class M20
{
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(90);
		list.add(900);
		System.out.println(list);
		Thread t1 = new Thread();
		t1.stop();//deprecated method
	}
}
