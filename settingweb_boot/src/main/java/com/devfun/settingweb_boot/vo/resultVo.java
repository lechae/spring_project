package com.devfun.settingweb_boot.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class resultVo {
	@JsonInclude(Include.NON_NULL)
	private String resultCode;
	
	@JsonInclude(Include.NON_NULL)
	private String resultString;
	
	@JsonInclude(Include.NON_DEFAULT)
	private int totalCnt;
	
	@JsonInclude(Include.NON_DEFAULT)
	private int avgNum;
	
	@JsonInclude(Include.NON_NULL)
	private infoVo info;
	
	// getter setter
	public String getResultCode() {
		return resultCode;
	}
	
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	
	public String getResultString() {
		return resultString;
	}
	
	public void setResultString(String resultString) {
		this.resultString = resultString;
	}
	
	public int getTotalCnt() {
		return totalCnt;
	}
	
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}
	
	public int getAvgNum() {
		return avgNum;
	}
	
	public void setAvgNum(int avgNum) {
		this.avgNum = avgNum;
	}

	public infoVo getInfo() {
		return info;
	}

	public void setInfo(infoVo info) {
		this.info = info;
	}
}
