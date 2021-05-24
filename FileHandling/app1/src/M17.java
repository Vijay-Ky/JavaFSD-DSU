import java.io.File;

public class M17 {
	public static void main(String[] args) {
		File dir = new File("D:/JDK8.0/xyz");
		File f1 = new File(dir, "dir6");
		System.out.println("a:" + f1.exists());
		//if the path didnt exists simply you get false not exception
		System.out.println("b:" + f1.mkdir());
		System.out.println("c:" + f1.exists());
		System.out.println("done");
	}
}
