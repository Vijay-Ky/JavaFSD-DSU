import java.sql.*;
class D 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","developer");
		Statement stmt = con.createStatement();
		String sql1 = "INSERT INTO PERSON VALUES(1, 'ABC', 22)";
		String sql2 = "INSERT INTO PERSON VALUES(2, 'XYZ', 25)";
		String sql3 = "INSERT INTO PERSON VALUES(3, 'RAMU', 20)";
		String sql4 = "INSERT INTO PERSON VALUES(4, 'VIJAY', 21)";
		String sql5 = "INSERT INTO PERSON VALUES(5, 'KIRAN', 29)";
		String sql6 = "INSERT INTO PERSON VALUES(6, 'BABU', 29)";
		String sql7 = "INSERT INTO PERSON VALUES(7, 'NAVEEN', 24)";
		String sql8 = "INSERT INTO PERSON VALUES(8, 'MANU', 26)";
		stmt.execute(sql1);
		stmt.execute(sql2);
		stmt.execute(sql3);
		stmt.execute(sql4);
		stmt.execute(sql5);
		stmt.execute(sql6);
		stmt.execute(sql7);
		stmt.execute(sql8);
		System.out.println("done");
	}
}
