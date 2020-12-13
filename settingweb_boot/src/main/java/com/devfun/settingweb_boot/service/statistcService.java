package com.devfun.settingweb_boot.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfun.settingweb_boot.mapper.statistcMapper;
import com.devfun.settingweb_boot.vo.*;


@Service
public class statistcService {
	
	@Autowired
	public statistcMapper mapper;
	
	public List<testVo> selectTest() {
		return mapper.selectTest(); 
	}
	
	public List<requestInfoVo> selectRequestInfo() throws Exception { 
		return mapper.selectRequestInfo();
	}
	
	// 월별 접속자 수
	public List<visitorsMonthVo> selectVisitorsMonth(int year, int month) throws Exception { 
		return mapper.selectVisitorsMonth(year, month);
	}
	
	// 일자별 접속자 수
	public List<visitorsDateVo> selectVisitorsDate(int year, int month, int date) throws Exception { 
		return mapper.selectVisitorsDate(year, month, date);
	}
	
	// 평균 하루 로그인 수
	public List<loginVo> selectLoginAvgDate() throws Exception { 
		return mapper.selectLoginAvgDate();
	}
	
	// 휴일을 제외한 로그인 수
	public List<loginVo> selectLoginWeekday() throws Exception { 
		return mapper.selectLoginWeekday();
	}

	// 부서별 월별 로그인 수
	public List<loginDeptAndMonthVo> selectLoginDeptandMonth(String dept, int year, int month) throws Exception { 
		return mapper.selectLoginDeptandMonth(dept, year, month);
	}
	
}
