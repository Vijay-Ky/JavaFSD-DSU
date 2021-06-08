import java.sql.*;
class I 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		String sql = "UPDATE PERSON SET NAME = 'MANOHAR' WHERE ID = 5";
		stmt.execute(sql);
		System.out.println("done");
	}
}
