import java.sql.*;
import java.util.Scanner;
class M8
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter table name");
		//reading table name while at program is running
		String tableName = sc.next();
		//same table name specifiying in the select command.
		//table name is not hardcoded.
		String sql = "SELECT * FROM " + tableName;
		ResultSet rs = stmt.executeQuery(sql);
		//meta-data of the ResultSet
		//the meta-data of ResultSet is extracted to ResultSetMetadata
		//in case of ResultSet meta-data is nothing but columns information
		ResultSetMetaData rsmd = rs.getMetaData();
		//to find out how many columns are there in the table
		int cols = rsmd.getColumnCount();
		//while calling the next() method cursor will be comming to the first record.
		//checks whether first record available or not
		//row wise iteration
		while(rs.next())
		{
			//in a particular row column wise iteration
			for (int i = 1; i <= cols; i++)
			{
				System.out.print(rs.getString(i) + ", ");
			}
			System.out.println();
		}
		System.out.println("done");
	}
}
//for both DDL and DML we can use execute method
//A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned before the first row.
//java.sql.ResultSet//its an Interface
