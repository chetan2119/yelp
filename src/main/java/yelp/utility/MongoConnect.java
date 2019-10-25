package yelp.utility;


import org.bson.Document;
import org.springframework.stereotype.Component;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

@Component
public class MongoConnect {
	
	MongoDatabase database=null;
	
	static MongoClient mongoClient = null;
	public void getNewDatabase() {
		try{
			mongoClient = new MongoClient("localhost");
			database = mongoClient.getDatabase("yelp");
		}catch(Exception e){
			System.out.println("Exception"+ e);
		}
	}
	public MongoDatabase getDatabase() {
		if(database==null) {
			getNewDatabase(); 
		}
		return database;
	}
	
	public static void close() {
		mongoClient.close();
	}
	
}
