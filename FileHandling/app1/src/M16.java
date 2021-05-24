import java.io.File;

public class M16 {
	public static void main(String[] args) {
		File dir = new File("D:/ocjp");
		//path refered through reference variable
		File f1 = new File(dir, "dir6");
		System.out.println("a:" + f1.exists());
		System.out.println("b:" + f1.mkdir());
		System.out.println("c:" + f1.exists());
		System.out.println("done");
	}
}
