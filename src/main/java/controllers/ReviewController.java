package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dbModel.AccessBusinessCategories;

@RestController
public class ReviewController {

	@Autowired
	AccessBusinessCategories busCat;
	
	@RequestMapping("/q3")
	public String returndata() {
		String data = busCat.getData();
		return data;
	}
}
