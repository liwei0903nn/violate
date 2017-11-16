package com.example.demo.service;

import com.example.demo.results.ViolateResult;

public interface ViolateService {
	
	ViolateResult queryViolate(String carNo, String frameNo, String engineNo);

}
