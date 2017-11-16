package com.example.demo.supplier.impl;

import com.example.demo.supplier.Supplier;

public class Xiaoka implements Supplier{

	@Override
	public String query(String carNo) {
		return "xiaoka: " + carNo;
	}

	
}
