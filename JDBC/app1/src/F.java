import java.sql.*;
import java.util.Scanner;
class F 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);//creating the scanner object
		System.out.println("Please enter id");
		String id = sc.next();
		System.out.println("Please enter name");
		String name = sc.next();
		System.out.println("Please enter age");
		String age = sc.next();
		String sql = "INSERT INTO PERSON VALUES(" + id + ", '" + name +"'," + age +")";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		System.out.println("done");
	}
}
