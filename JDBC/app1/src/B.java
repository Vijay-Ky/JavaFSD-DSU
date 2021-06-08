import java.sql.*;
class B 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM","developer");
		Statement stmt = con.createStatement();
		String sql = "INSERT INTO TEST10 VALUES(1000)";
		stmt.execute(sql);
		System.out.println("done");
	}
}
