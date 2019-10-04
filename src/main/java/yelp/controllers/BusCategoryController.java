package yelp.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
public class BusCategoryController {

	@Autowired
	GaleraConnect gc;
	
	@Autowired
	JSONUtil json;
	
	@RequestMapping("/q3")
	public String returnData() throws Exception {
		List<String> list = new ArrayList<String>();
		Connection con = gc.getCon();
		String sql = "select count(*) AS count, category from yelp_business a, yelp_location b where "
					 + "a.business_id=b.business_id and city=? group by category";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "Phoenix");
		
		ResultSet rs = ps.executeQuery();
		 
		while(rs.next()) {
			list.add(rs.getString("category"));
		}
		String out = json.objToString(list);
		return out;
	}
}
