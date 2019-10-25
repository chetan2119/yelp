package yelp.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mongodb.client.MongoDatabase;

import yelp.utility.JSONUtil;
import yelp.utility.MongoConnect;

/**
 * 
 * @author CJ
 *
 */
@Component
public class NoSQLData {

	@Autowired
	MongoConnect mc; //Gets the object for Galera DB connection
	
	@Autowired
	JSONUtil json; //Object to assist with JSON operations
	
	public HashMap<String, String> getQ1Result(String category){
		HashMap<String,String> map = new HashMap<String, String>();
		MongoDatabase database = mc.getDatabase();
		//add code for querying here -- Q1
		
		return map;
	}
	
	public HashMap<String, String> getQ2Result(String category){
		HashMap<String,String> map = new HashMap<String, String>();
		MongoDatabase database = mc.getDatabase();
		//add code for querying here -- Q2
		
		return map;
	}
	
	public HashMap<String, String> getQ3Result(String category){
		HashMap<String,String> map = new HashMap<String, String>();
		MongoDatabase database = mc.getDatabase();
		//add code for querying here -- Q3
		
		return map;
	}
	
	public String getCategory() {
		List<String> list = new ArrayList<String>();
		MongoDatabase database = mc.getDatabase();
		//add code for querying here -- get distinct categories
		String out = json.objToString(list);
		return out;
	}
	
	public String getCity() {
		List<String> list = new ArrayList<String>();
		MongoDatabase database = mc.getDatabase();
		//add code for querying here -- get distinct cities
		String out = json.objToString(list);
		return out;
	}
	
	public String getState() {
		List<String> list = new ArrayList<String>();
		MongoDatabase database = mc.getDatabase();
		//add code for querying here -- get distinct states
		String out = json.objToString(list);
		return out;
	}
}
