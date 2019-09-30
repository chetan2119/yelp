package Utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {

	public String objToString(Object in) {
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			json = mapper.writeValueAsString(in);
		} catch (JsonProcessingException e) {
			System.out.println("Exception"+ e);
		}
		return json;
		
	}
}
