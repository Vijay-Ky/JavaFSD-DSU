import java.io.File;

public class M15 {
	public static void main(String[] args) {
		//path and directory
		File f1 = new File("D:/ocjp", "dir4");
		System.out.println("a:" + f1.exists());
		System.out.println("b:" + f1.mkdir());
		System.out.println("c:" + f1.exists());
		System.out.println("done");
	}
}
