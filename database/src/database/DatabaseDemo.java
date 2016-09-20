package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatabaseDemo {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/qwerty", "root","root");
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery("select * from users");
		while(rs.next())
		{
			System.out.println("hello");
			System.out.println(rs.getString("uname"));
		}
		rs.close();
		st.close();
		conn.close();
		
		
	}

}

