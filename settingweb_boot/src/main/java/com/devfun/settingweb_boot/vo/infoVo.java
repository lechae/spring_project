package com.devfun.settingweb_boot.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class infoVo {
	@JsonInclude(Include.NON_NULL)
	private int year;
	
	@JsonInclude(Include.NON_NULL)
	private int month;
	
	@JsonInclude(Include.NON_DEFAULT)
	private int date;
	
	@JsonInclude(Include.NON_NULL)
	private String department; 
	
	// getter setter	
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
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
