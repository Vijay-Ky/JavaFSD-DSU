import java.io.File;

public class M2 {
	public static void main(String[] args) throws Exception
		{
		//any type of the file
		File f1 = new File("hello2.html");
		//requires io exception
		f1.createNewFile();
		System.out.println("done");
	}
}
