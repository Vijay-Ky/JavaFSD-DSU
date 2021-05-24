import java.io.File;
import java.io.IOException;

public class M9 {
	public static void main(String[] args)  {
		//constructors takes two arguments 
		//one takes path, another creates file
		//the path should be available
		File f1 = new File("D:\\ocjp", "hello11.txt");
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
