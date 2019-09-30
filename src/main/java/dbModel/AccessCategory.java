package dbModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Utility.JSONUtil;
import Utility.SQLServerConnect;

/**
 * 
 * @author CJ
 *
 */
@Component
public class AccessCategory  implements AccessData{
	
	@Autowired
	JSONUtil util;
	
	@Override
	public String getData() {
		SQLServerConnect sc = new SQLServerConnect();
		Connection con = sc.getConnection();
		String sql = "SELECT DISTINCT CATEGORY FROM DBO.YELP_BUSINESS";
		ArrayList<String> resultList = new ArrayList<String>();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			
			while(rs.next()) {
				resultList.add((rs.getString(1)));
			}
		} catch (SQLException e) {
			System.out.println("Exception" + e);
		}
		String out=util.objToString(resultList);
		return out;
	}

}