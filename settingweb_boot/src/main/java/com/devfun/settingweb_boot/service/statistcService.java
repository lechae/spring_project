package com.devfun.settingweb_boot.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.devfun.settingweb_boot.mapper.statistcMapper;
import com.devfun.settingweb_boot.vo.*;


@Service
public class statistcService {
	
	@Autowired
	public statistcMapper mapper;
	
	// 월별 접속자 수	
	public List<resultVo> selectVisitorsMonth(int year, int month) throws Exception { 
		return mapper.selectVisitorsMonth(year, month);
	}
	
	// 일자별 접속자 수
	public List<resultVo> selectVisitorsDate(int year, int month, int date) throws Exception { 
		return mapper.selectVisitorsDate(year, month, date);
	}
	
	// 평균 하루 로그인 수
	public List<resultVo> selectLoginAvgDate() throws Exception { 
		return mapper.selectLoginAvgDate();
	}
	
	// 휴일을 제외한 로그인 수
	public List<resultVo> selectLoginWeekday() throws Exception { 
		return mapper.selectLoginWeekday();
	}

	// 부서별 월별 로그인 수
	public List<resultVo> selectLoginDeptandMonth(String dept, int year, int month) throws Exception { 
		return mapper.selectLoginDeptandMonth(dept, year, month);
	}
	
	// 사용자 정보
	public List<userVo> selectUserInfo() throws Exception { 
		return mapper.selectUserInfo();
	}
	
	// 사용자 정보 추가
	public int insertUserInfo(String userId, String name, String dept) throws Exception { 
		return mapper.insertUserInfo(userId, name, dept);
	}
	
	// 사용자 정보 삭제
	public int deleteUserInfo(String userId)throws Exception { 
		return mapper.deleteUserInfo(userId);
	}
	
}
