package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class SQLServerConnect  {
	@Value("${mssql.ds.pass}")
	private static String msHost;
	
	private static String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";


	
	
	public static void main(String[] args) throws SQLException {
		//DBConnect db = new DBConnect(1);
	
		//Connection con =db.con;

		String Host = "jdbc:sqlserver://CJ-PC\\SQLEXPRESS;databaseName=yelp;integratedSecurity=true";
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection(Host);  
			java.sql.Statement stmt=con.createStatement();  

			ResultSet rs=stmt.executeQuery("select count(*) from yelp_business"); 
			
			while(rs.next()){  
				System.out.println(rs.getInt(1));
			}
			con.close(); 
		}catch(Exception e){
			System.out.println(e);
			}
		finally{
			//con.close(); 
			//db.closeConnection();
		}
	}

}
