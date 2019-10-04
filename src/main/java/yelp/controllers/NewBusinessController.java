 package yelp.controllers;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import yelp.utility.JSONUtil;
 
 @RestController 
 public class NewBusinessController {
 
 @Autowired
 JSONUtil json;
 
 /**
  * @author CJ
  * @return
  * @throws JsonProcessingException
  */
 @RequestMapping("/q1")
 public String returnData() throws JsonProcessingException { 
	
	 String out = ""; 
	 System.out.println(out);
	 return out; 
	 } 
 }
 