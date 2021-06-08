import java.sql.*;
class A 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","developer");
		Statement stmt = con.createStatement();
		String sql2 = "CREATE TABLE TEST10(ID NUMBER)";
		stmt.execute(sql2);
		System.out.println("done");
	}
}
