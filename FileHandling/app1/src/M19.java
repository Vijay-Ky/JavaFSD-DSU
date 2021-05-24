import java.io.File;

public class M19 {
	public static void main(String[] args) {
		File f1 = new File("D:\\");
		//reading all the mebers of the directory
		File[] members = f1.listFiles();
		for(File member : members)
		{
			System.out.println(member.getName());
		}
	}
}
