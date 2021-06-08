import java.sql.*;
import java.io.*;//to interact with the file system
class H 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		//reading data from the text file
		//this text file should be in the java file location where we trigger  java command i,e in classes folder
		FileReader fin = new FileReader("data.txt");
		//because of BufferedReader we can read the data line by line
		BufferedReader bin = new BufferedReader(fin);
		String record = bin.readLine();//to readline
		String id, name, age, sql, data[];
		while(record != null)//checking whether first line is available or not
		{
			//spliting that line using cmn field seperator i,e ;
			//split method returns multiple splits from the first row
			//that we are assigning to data[] array
			data = record.split(";");
			//from the data array read the first element and assign that to id
			//trim()is a built-in method that eliminates leading and trailing spaces. 
			id = data[0].trim();
			name = data[1].trim();
			age = data[2].trim();
			sql = "INSERT INTO PERSON VALUES(" + id + ", '" + name +"'," + age +")";
			stmt.execute(sql);
			//reading 2,3,4,5 but for 6th row record will be null
			//if record is null comes out of while
			record = bin.readLine();
		}
		System.out.println("done");
	}
}
