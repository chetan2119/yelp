package yelp.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import yelp.utility.GaleraConnect;
import yelp.utility.JSONUtil;


/**
 * 
 * @author CJ
 *
 */
@RestController
public class YelpController {
	@Autowired
	GaleraConnect gc;
	
	@Autowired
	JSONUtil json;
	
	@GetMapping("/staticData")
	public String returnData() throws SQLException {
		String category = getCategory();
		String city = getCity();
		String state = getState();
		String year = getYear();
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("category", category);
		map.put("city", city);
		map.put("state", state);
		map.put("year", year);
		
		String out = json.objToString(map);
		return out;
		
	}
	
	private String getYear() {
		List<Integer> year = new ArrayList<Integer>();
		for(int i = 2004; i< 2018; i++) {
			year.add(i);
		}
		String out = json.objToString(year);
		return out;
	}

	private String getCategory() throws SQLException {
		List<String> list = new ArrayList<String>();
		Connection con = gc.getCon();
		String sql = "select distinct category from yelp_business";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		 
		while(rs.next()) {
			list.add(rs.getString("category"));
		}
		String out = json.objToString(list);
		return out;
		
	}
	
	private String getCity() throws SQLException {
		List<String> list = new ArrayList<String>();
		Connection con = gc.getCon();
		String sql = "select distinct city from yelp_location";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		 
		while(rs.next()) {
			list.add(rs.getString("category"));
		}
		String out = json.objToString(list);
		return out;
		
	}
	
	private String getState() throws SQLException {
		List<String> list = new ArrayList<String>();
		Connection con = gc.getCon();
		String sql = "select distinct state from yelp_location";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		 
		while(rs.next()) {
			list.add(rs.getString("category"));
		}
		String out = json.objToString(list);
		return out;
		
	}
}
