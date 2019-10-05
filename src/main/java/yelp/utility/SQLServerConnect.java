package yelp.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * This class was generated for local testing purposes until the cluster was ready, to work with local sql server
 * @author CJ
 *
 */
public class SQLServerConnect{
	private static String msHost = "jdbc:sqlserver://CJ-PC\\SQLEXPRESS;databaseName=yelp;integratedSecurity=true";
	private static String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	Connection con= null;
	
	public Connection getConnection() {
		
		try{
			Class.forName(driverClass);
			con = DriverManager.getConnection(msHost);  
		}catch(Exception e){
			System.out.println("Exception"+ e);
		}
		return con;
	}
	
	public void close() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Exception"+ e);
		}
	}
	
}
