package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class GaleraConnect extends DBConnect{

	@Value("${mariadb.ds.host}")
	private static String host;
	
	@Value("${mariadb.ds.user}")
	private static String user;
	
	@Value("${mariadb.ds.pass}")
	private static String pass;
	
	private static String driverClass = "org.mariadb.jdbc.Driver";
	
	public static void test() {
		try {
			DBConnect.connect("");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main1(String[] args) throws SQLException {
		Connection con = null;
		try{
			Class.forName("org.mariadb.jdbc.Driver");  
			//con=DriverManager.getConnection(host,user,pass);  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yelp_data","root","chetan");  
					
			java.sql.Statement stmt=con.createStatement();  

			ResultSet rs=stmt.executeQuery("select * from test"); 
			
			while(rs.next()){  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
			}
		}catch(Exception e){
			System.out.println(e);
			}
		finally{
			con.close(); 
		}
	}  
	
	
	
}
