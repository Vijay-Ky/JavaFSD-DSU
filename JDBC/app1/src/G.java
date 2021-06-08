import java.sql.*;
import java.util.Scanner;
class G 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);//creating the scanner object
		String id, name, age, sql;
		do
		{
			System.out.println("Please enter id");
			id = sc.next();
			System.out.println("Please enter name");
			name = sc.next();
			System.out.println("Please enter age");
			age = sc.next();
			sql = "INSERT INTO PERSON VALUES(" + id + ", '" + name +"'," + age +")";
			stmt.execute(sql);
			System.out.println("do you want to insert one more(yes/no)?");
		}
		while ("yes".equalsIgnoreCase(sc.next()));
		System.out.println("done");
	}
}
