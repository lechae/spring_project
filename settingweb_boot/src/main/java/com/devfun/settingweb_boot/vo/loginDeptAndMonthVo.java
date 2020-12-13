package com.devfun.settingweb_boot.vo;

public class loginDeptAndMonthVo {
	private String resultCode;
	private int totalCnt;
	private String department;
	private int year;
	private int month;
	
	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	
	public int getTotalCnt() {
		return totalCnt;
	}
	
	public void setTotalCnt(int totalCnt) {
		this.totalCnt = totalCnt;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
