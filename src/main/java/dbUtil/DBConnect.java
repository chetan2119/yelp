package dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;

public class DBConnect {
	public Connection con= null;
	
	@Value("${mssql.ds.pass}")
	private static String sHost;
	
	@Value("${mariadb.ds.host}")
	private static String mHost;
	
	@Value("${mariadb.ds.user}")
	private static String user;
	
	@Value("${mariadb.ds.pass}")
	private static String pass;

	/**
	 * default constructor to connect with Maria DB
	 */
	public DBConnect() {
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection(sHost);  
		}catch(Exception e){
			System.out.println("Exception"+ e);
		}
	}
	
	public void closeConnection() throws SQLException {
		con.close();
	}
	
	/**
	 * default constructor to connect with Local SQL Server
	 */
	public DBConnect(int i) {
		try{
			String Host = "jdbc:sqlserver://CJ-PC\\SQLEXPRESS;databaseName=yelp;integratedSecurity=true";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con=DriverManager.getConnection(Host);  
		}catch(Exception e){
			System.out.println("Exception"+ e);
		}
	}
	
	public static Connection connect(String host) throws SQLException {
		Connection con = null;
		try{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con=DriverManager.getConnection(host);  
			}catch(Exception e){
				System.out.println("Exception"+ e);
			}
		return con;
	}

}
