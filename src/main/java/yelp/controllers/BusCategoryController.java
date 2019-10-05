package yelp.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import yelp.utility.GaleraConnect;
import yelp.utility.JSONUtil;

/**
 * 
 * @author CJ
 * Class for Question 1
 * Input as city
 * Output is categories and their count for that city
 */
@RestController
public class BusCategoryController {

	@Autowired
	GaleraConnect gc; //Connection object for Galera Cluster
	
	@Autowired
	JSONUtil json; //Object to assist with JSON operations
	
	@PostMapping("/q3")
	public String returnData(@RequestBody String city){
		System.out.println("#############----->"+ city);
		HashMap<String,String> map = new HashMap<String, String>();
		Connection con = gc.getCon();
		String sql = "select count(*) AS count, category from yelp_business a, yelp_location b where "
					 + "a.business_id=b.business_id and city=? group by category order by category";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, city.replace("\"", ""));
			ResultSet rs = ps.executeQuery();
			System.out.println("done!");
			
			while(rs.next()) {
				map.put(rs.getString("category"),rs.getString("count"));
			}
		}catch(Exception e) {
			System.out.println("Exception:"+e);
		}
		
		String out = json.objToString(map);
		return out;
	}
}
