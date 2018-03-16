package com.niks.springcloud.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration config;
	
	@GetMapping("/limits")
	public LimitConfiguartion retrieveLimitConfig(){
		
		return new LimitConfiguartion(config.getMaximum(),config.getMinimum());
	}

}
