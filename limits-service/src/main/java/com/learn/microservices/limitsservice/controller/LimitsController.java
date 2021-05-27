package com.learn.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.limitsservice.bean.Limits;
import com.learn.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration conf;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(conf.getMinimum(),conf.getMaximum());
	}
}
