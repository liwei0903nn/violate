package com.example.demo.controller;



import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.supplier.SupplierManager;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello()
	{
		SupplierManager.printSupplierMap();
		String serverIp = null;
		//return "hello";
		try {
			serverIp =  InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//获得本机IP  
		
		return SupplierManager.getSupplier("xiaoka").query(serverIp);
	}
	
}
