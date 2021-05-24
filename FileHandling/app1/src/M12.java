import java.io.File;

public class M12 {
	public static void main(String[] args) {
		File f1 = new File("dir1");
		//to create the directory
		//doesnt requres try/catch or throws
		f1.mkdir();
		System.out.println("done");
	}
}
