import java.sql.*;
class J 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","admin");
		Statement stmt = con.createStatement();
		String sql = "DELETE FROM PERSON WHERE ID = 5";
		stmt.execute(sql);
		System.out.println("done");
	}
}
