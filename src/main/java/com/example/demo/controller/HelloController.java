package com.example.demo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.supplier.SupplierManager;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello()
	{
		SupplierManager.printSupplierMap();
		//return "hello";
		return SupplierManager.getSupplier("xiaoka").query("hello");
	}
	
}
