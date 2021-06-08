import java.sql.*;
class E
{
	public static void main(String[] args) throws Exception
	{
		//if less than 3 arguments returns to main().we dont get anything
		if(args.length < 3)
		{	
			System.out.println("Please supply 3 command line args");
			return;
		}
		String id = args[0];//first cmd line arg into id
		String name = args[1];//second cmd line arg into name
		String age = args[2];//third comd line arg into age
		//id is a numeric no single qoute is required.
		//name is varchar so including single quote.
		//age is a numeric no single qoute is required.
		String sql = "INSERT INTO PERSON VALUES(" + id + ", '" + name +"'," + age +")";
		Class.forName("oracle.jdbc.driver.OracleDriver");//registering driver
		//establish a database connection.
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","developer");
		//get the statement object
		Statement stmt = con.createStatement();
		//sending sql command to database using statement object. 
		stmt.execute(sql);
		System.out.println("done");
	}
}
// in the previous program we were hard coded data in the sql commands.
