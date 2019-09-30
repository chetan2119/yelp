package controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dbModel.AccessCategory;

/**
 * 
 * @author CJ
 *
 */
@RestController
public class YelpController {

	@Autowired
	AccessCategory category;
	
	@GetMapping("/category")
	public String getCategory() throws SQLException {
		String cat = category.getData();
		return cat;
	}
}
