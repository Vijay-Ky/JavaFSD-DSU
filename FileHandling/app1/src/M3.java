import java.io.File;

public class M3 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("hello3.doc");
		f1.createNewFile();
		System.out.println("done");
	}
}
