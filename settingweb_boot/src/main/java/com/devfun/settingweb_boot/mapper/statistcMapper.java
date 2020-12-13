package com.devfun.settingweb_boot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.devfun.settingweb_boot.vo.*;

@Repository
@Mapper
public interface statistcMapper {
	// test
	List<testVo> selectTest();
	List<requestInfoVo> selectRequestInfo();
	
	// 월별 접속자 수
	List<visitorsMonthVo> selectVisitorsMonth(@Param("year") int year, @Param("month") int month);
	
	// 일자별 접속자 수
	List<visitorsDateVo> selectVisitorsDate(@Param("year") int year, @Param("month") int month, @Param("date") int date);
	
	// 평균 하루 로그인 수
	List<loginVo> selectLoginAvgDate();
	
	// 휴일을 제외한 로그인 수
	List<loginVo> selectLoginWeekday();
	
	// 부서별 월별 로그인 수
	List<loginDeptAndMonthVo> selectLoginDeptandMonth(@Param("dept") String dept, @Param("year") int year, @Param("month") int month);
	
}