package io2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class M4 {
	public static void main(String[] args) {
		File f1 = new File("test4.txt");
		FileWriter out = null;
		try
		{
			out = new FileWriter(f1);
			out.write("hello");
			out.write("test");
			out.write("end");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(out != null)
			{
				try
				{
					out.flush();
					out.close();
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
		
		System.out.println("done");
		
		
		
		
	}
}
