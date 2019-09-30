package Utility;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;
/**
 * 
 * @author CJ
 *
 */
public class GaleraConnect implements DBConnect{

	@Value("${mariadb.ds.host}")
	private static String host;
	@Value("${mariadb.ds.user}")
	private static String user;
	@Value("${mariadb.ds.pass}")
	private static String pass;
	private static String driverClass = "org.mariadb.jdbc.Driver";

	public Connection getConnection(){
		Connection con = null;
		try{
			Class.forName(driverClass);  
			con=DriverManager.getConnection(host,user,pass);
		}catch(Exception e){
			System.out.println(e);
		}
		return con;
	}  
	
}
