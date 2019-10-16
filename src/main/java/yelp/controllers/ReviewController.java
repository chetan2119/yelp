package yelp.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	GaleraConnect gc; //Connection object for Galera Cluster
	
	@Autowired
	JSONUtil json; //Object to assist with JSON operations
	
	@RequestMapping("/q2")
	public String returnData(@RequestBody String input) throws IOException {
		System.out.println("#############----->"+ input);
		HashMap<String,String> map = new HashMap<String, String>();
		
		ObjectMapper mapper = new ObjectMapper();
		JsonNode actualObj = mapper.readTree(input);
		String state = actualObj.get("state").toString().replace("\"", "");
		int year = Integer.parseInt(actualObj.get("year").toString().replace("\"", ""));
		
		Connection con = gc.getCon();
		//String sql ="select user_id, count(*) as cnt from yelp_location bus RIGHT Join yelp_reviews rev " + 
			//		"on bus.business_id = rev.business_id where rev.year=? and bus.state=? "
			//		+ "group by rev.user_id order by cnt desc limit 10";
		String sql ="select user_id, count(review_id) as cnt from yelp_reviews where year=? and business_id "
				+ "in(select business_id from yelp_location where state=?) group by user_id having count(review_id)>10 limit 10";
				
		System.out.println("Running: "+sql);
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, year);
			ps.setString(2, state);
			ResultSet rs = ps.executeQuery();
			System.out.println("done!");
			
			while(rs.next()) {
				map.put(rs.getString("user_id"),rs.getString("cnt"));
			}
		}catch(Exception e) {
			System.out.println("Exception:"+e);
		}
		String out = json.objToString(map);
		return out;
	}
}
