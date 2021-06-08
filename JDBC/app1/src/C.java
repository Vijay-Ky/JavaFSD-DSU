import java.sql.*;
class C 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","developer");
		Statement stmt = con.createStatement();
		String sql1 = "DROP TABLE PERSON CASCADE CONSTRAINTS";
		String sql2 = "CREATE TABLE PERSON (ID NUMBER, NAME VARCHAR(90), AGE NUMBER)";
		stmt.execute(sql1);
		stmt.execute(sql2);
		System.out.println("done");
	}
}
