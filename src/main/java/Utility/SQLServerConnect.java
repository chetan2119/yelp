package Utility;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * 
 * @author CJ
 *
 */
public class SQLServerConnect implements DBConnect{
	//@Value("${mssql.ds.host}")
	private static String msHost = "jdbc:sqlserver://CJ-PC\\SQLEXPRESS;databaseName=yelp;integratedSecurity=true";//1433
	
	private static String driverClass = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

	public Connection getConnection() {
		Connection con= null;
		try{
			Class.forName(driverClass);
			con = DriverManager.getConnection(msHost);  
		}catch(Exception e){
			System.out.println("Exception"+ e);
		}
		return con;
	}
	
}
