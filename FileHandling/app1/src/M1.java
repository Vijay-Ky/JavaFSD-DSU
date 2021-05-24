import java.io.File;

public class M1 {
	public static void main(String[] args) throws Exception {
		//by default creates file in the project folder
		File f1 = new File("hello1.txt");
		f1.createNewFile();
		System.out.println("done");
	}
}
