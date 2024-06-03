package com.ciq.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class TestController {

	@GetMapping("/path")
	public String getMethodName(String param) {
		return new String("sjasho");
	}

}
