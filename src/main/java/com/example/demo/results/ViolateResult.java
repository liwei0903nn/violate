package com.example.demo.results;

import java.util.List;

public class ViolateResult {
	
	private Integer code;
	private String msg;
	List<ViolateInfo> violateInfos;
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<ViolateInfo> getViolateInfos() {
		return violateInfos;
	}
	public void setViolateInfos(List<ViolateInfo> violateInfos) {
		this.violateInfos = violateInfos;
	}
	
	
	

}


