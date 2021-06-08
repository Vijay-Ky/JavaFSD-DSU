import java.sql.*;
class M5
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		//we are selecting only two columns
		//giving aliasing name for the columns
		String sql = "SELECT id p_id, age person_age FROM PERSON";
		//for select command we need to call executeQuery() of statement object
		//executeQuery returns resultset
		//we need to supply select cmd to the executeQuery()
		//ResultSet will be having all the records which are returning by select command	
		//in the ResultSet there is a cursor concept
		//initialy cursor will be on top of the resultset
		ResultSet rs = stmt.executeQuery(sql);
		//while calling the next() method cursor will be comming to the first record.
		//checks whether first record available or not
		while(rs.next())
		{
			//any datatype of the column we can read in the form of String
			//getString() is applicable for any datatype of the column
			//we can supply column indexes rather than column name
			//we need to call only two getString method
			//column indexes are starting from 1
			//first record column id index
			//if you are using aliasing names in select cmd then you should supply alias names only. not original column names.
			System.out.print(rs.getString(1) + ", ");
			//first record coulumn name index
			System.out.print(rs.getString(2) + ", ");
			System.out.println();
		}
		System.out.println("done");
	}
}
//for both DDL and DML we can use execute method
//A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned before the first row.
//java.sql.ResultSet//its an Interface
