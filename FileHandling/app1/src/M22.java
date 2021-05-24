import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class M22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source path");
		String src = sc.next();
		File srcDir = new File(src);
		//key,value pairs
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		File[] srcDirMembers = srcDir.listFiles();
		
		String fileType;
		for(File file : srcDirMembers)
		{
			if(file.isFile())
			{
				fileType = file.getName().substring(file.getName().indexOf(".") + 1);
				if(map.get(fileType) == null)
				{
					map.put(fileType, 1);
				}
				else
				{
					map.put(fileType, map.get(fileType) + 1);
				}
			}
			System.out.println(file.getName() + ":" + map);
		}
		System.out.println("final map:" + map);			
		System.out.println("total members:" + srcDirMembers.length);
	}
}
