package yelp.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yelp.utility.GaleraConnect;
import yelp.utility.JSONUtil;

/**
 * 
 * @author CJ
 *
 */
@RestController
public class ReviewController {

	@Autowired
	GaleraConnect gc;
	
	@Autowired
	JSONUtil json;
	
	@RequestMapping("/q2")
	public String returnData() throws SQLException {
		HashMap<String,String> map = new HashMap<String, String>();
		
		Connection con = gc.getCon();
		String sql ="select user_id, count(*) as cnt from yelp_location bus RIGHT Join yelp_review rev " + 
					"on bus.business_id = rev.business_id where rev.year=? and bus.state=? "
					+ "group by rev.user_id order by cnt desc limit 10";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "2016");
		ps.setString(2, "AZ");
		ResultSet rs = ps.executeQuery();
		 
		while(rs.next()) {
			map.put(rs.getString("user_id"),rs.getString("cnt"));
		}
		String out = json.objToString(map);
		return out;
	}
}
