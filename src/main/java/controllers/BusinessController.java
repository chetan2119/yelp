package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import dbModel.AccessBusinessCategories;

@RestController
public class BusinessController {
	
	@Autowired
	AccessBusinessCategories busCat;

	@RequestMapping("/q1")
	public String returndata() throws JsonProcessingException {
		String data = busCat.getData();
		return data;
	}
}
