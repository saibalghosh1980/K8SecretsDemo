package com.oup.k8secretdemo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/test")
	public String test() throws UnknownHostException {
		System.out.println("-------");
		String hostName=InetAddress.getLocalHost().getHostName();
		String ipAddress=InetAddress.getLocalHost().getHostAddress();
		return "hostname:"+hostName+" and ip-address:"+ipAddress;
	}

}
