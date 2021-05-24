import java.io.File;

public class M20 {
	public static void main(String[] args) {
		File src = new File("D:\\");
		File[] members = src.listFiles();		
		for(File member : members)
		{
			//print whether file or directory
			System.out.println(member.getName() + ":" + (member.isFile() ? " file " : " directory ")) ;
		}
	}
}
