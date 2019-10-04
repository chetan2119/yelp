package yelp.utility;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * 
 * @author CJ
 *
 */
@Component
public class GaleraConnect{

	@Autowired
	JSONUtil json;
	
	private static String driverClass = "org.mariadb.jdbc.Driver";
	private Connection con = null;
	
	public GaleraConnect(){
		try{
			Class.forName(driverClass);  
			/**
			 * removed code for security reasons	
			 */
		}catch(Exception e){
			System.out.println(e);
		}
	}  
	
	
	public void close() {
		try {
			getCon().close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
}
