import java.io.File;
//Exception is a part of java.lang package but IOException we should import
import java.io.IOException;	

public class M6 {
	public static void main(String[] args)  {
		File f1 = new File("hello6.txt");
		System.out.println("a: " + f1.exists());
		//instead of throws
		try
		{
			System.out.println("b: " + f1.createNewFile());
		}
		catch(IOException ex)
		{
			System.out.println(ex);
		}
		System.out.println("c: " + f1.exists());
		System.out.println("done");
	}
}
