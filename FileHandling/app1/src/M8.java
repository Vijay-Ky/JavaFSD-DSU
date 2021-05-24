import java.io.File;
import java.io.IOException;

public class M8 {
	public static void main(String[] args)  {
		//if it is backslash two backslash required
		//if it is forward slash only one is enough
		File f1 = new File("D:/hello8.txt");
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
