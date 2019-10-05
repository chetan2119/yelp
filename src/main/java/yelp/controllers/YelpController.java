package yelp.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
public class YelpController {
	@Autowired
	GaleraConnect gc; //Connection object for Galera Cluster
	
	@Autowired
	JSONUtil json; //Object to assist with JSON operations
	
	/**
	 * Returns static data for city, state, category and year
	 * @return
	 * @throws SQLException
	 */
	@RequestMapping("/staticData")
	public String returnData(){
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
	
	/**
	 * years vary from 2004 to 2017 as per data, setting them in a list
	 */
	private String getYear() {
		List<Integer> year = new ArrayList<Integer>();
		for(int i = 2004; i< 2018; i++) {
			year.add(i);
		}
		String out = json.objToString(year);
		return out;
	}

	/**
	 * getting the categories values from DB
	 * @return
	 */
	private String getCategory() {
		List<String> list = new ArrayList<String>();
		Connection con = gc.getCon();
		String sql = "select distinct category from yelp_business";
		
		
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			 
			while(rs.next()) {
				list.add(rs.getString("category"));
			}
		}catch(SQLException e) {
			System.out.println("Exception:"+e);
		}
		String out = json.objToString(list);
		return out;
		
	}
	
	/**
	 * getting the city values from DB
	 * @return
	 */
	private String getCity() {
		List<String> list = new ArrayList<String>();
		Connection con = gc.getCon();
		String sql = "select distinct city from yelp_location";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			 
			while(rs.next()) {
				list.add(rs.getString("city"));
			}
		}catch(SQLException e) {
			System.out.println("Exception:"+e);
		}
		String out = json.objToString(list);
		return out;
		
	}
	
	/**
	 * getting the state values from DB
	 * @return
	 */
	private String getState() {
		List<String> list = new ArrayList<String>();
		Connection con = gc.getCon();
		String sql = "select distinct state from yelp_location";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			 
			while(rs.next()) {
				list.add(rs.getString("state"));
			}
		}catch(SQLException e) {
			System.out.println("Exception:"+e);
		}
		String out = json.objToString(list);
		return out;
		
	}
}
