 package yelp.controllers;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import yelp.utility.GaleraConnect;
import yelp.utility.JSONUtil;
 
 @RestController 
 public class NewBusinessController {
 
 @Autowired
 JSONUtil json; //Object to assist with JSON operations
 
 @Autowired
 GaleraConnect gc; //Connection object for Galera Cluster
 
 /**
  * @author CJ
  * @return
  * @throws JsonProcessingException
  */
 @PostMapping("/q1")
	public String returnData(@RequestBody String category){
		System.out.println("#############----->"+ category);
		HashMap<String,String> map = new HashMap<String, String>();
		Connection con = gc.getCon();
		String sql = "select a.name,c.city from yelp_business a, yelp_reviews b, yelp_location c where"
						+ " a.business_id=b.business_id and a.category=?"
						+ " and a.business_id=c.business_id and a.is_open=1 and a.stars>3 order by b.date desc limit 10";
		System.out.println("Running: "+sql);
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, category.replace("\"", ""));
			ResultSet rs = ps.executeQuery();
			System.out.println("done!");
			
			while(rs.next()) {
				map.put(rs.getString("name"),rs.getString("city"));
			}
		}catch(Exception e) {
			System.out.println("Exception:"+e);
		}
		String out = json.objToString(map);
		return out;
	}
 }
 