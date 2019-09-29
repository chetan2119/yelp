package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YelpController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Test String";
	}
}
