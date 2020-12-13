import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		String host= "localhost";
		String port= "3306";
		
		Connection con= DriverManager.getConnection("jdbc:mysql://" + host + ":" + port +"/qadbt", "root", "root");
		Statement st= con.createStatement();
		ResultSet rs=st.executeQuery("select * from Employeeinfo where scenario ='rewardscard'");

		while(rs.next())

		{


		
		}

		}

		
	

}
