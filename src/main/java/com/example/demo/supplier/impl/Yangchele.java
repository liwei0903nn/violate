package com.example.demo.supplier.impl;

import com.example.demo.supplier.Supplier;

public class Yangchele implements Supplier {

	@Override
	public String query(String carNo) {
		return "yangchele " + carNo;
	}

}
