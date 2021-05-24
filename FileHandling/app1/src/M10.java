import java.io.File;
import java.io.IOException;

public class M10 {
	public static void main(String[] args)  {
		File dir = new File("D://ocjp");
		//several constructors
		//location we are supplying through another file object
		File f1 = new File(dir, "hello12.txt");
		System.out.println("a:" + f1.exists());
		try
		{
			System.out.println("b:" + f1.createNewFile());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("c:" + f1.exists());
		System.out.println("done:");
	}
}
