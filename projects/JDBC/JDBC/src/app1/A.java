package app1;
import java.sql.*;

public class A {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "developer");
		Statement stmt = con.createStatement();
		String sql1 = "CREATE TABLE BOOKS(NAME VARCHAR2(90))";
		stmt.execute(sql1);
		System.out.println("done");
	}

}
