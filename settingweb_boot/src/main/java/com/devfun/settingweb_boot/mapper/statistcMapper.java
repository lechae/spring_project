package com.devfun.settingweb_boot.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.devfun.settingweb_boot.vo.*;

@Repository
@Mapper
public interface statistcMapper {
	
	// 월별 접속자 수
	List<resultVo> selectVisitorsMonth(@Param("year") int year, @Param("month") int month);
	
	// 일자별 접속자 수
	List<resultVo> selectVisitorsDate(@Param("year") int year, @Param("month") int month, @Param("date") int date);
	
	// 평균 하루 로그인 수
	List<resultVo> selectLoginAvgDate();
	
	// 휴일을 제외한 로그인 수
	List<resultVo> selectLoginWeekday();
	
	// 부서별 월별 로그인 수
	List<resultVo> selectLoginDeptandMonth(@Param("dept") String dept, @Param("year") int year, @Param("month") int month);
	
	// 사용자 정보
	List<userVo> selectUserInfo();
	
	// 사용자 정보 추가
	int insertUserInfo(@Param("userId") String userId, @Param("name") String name, @Param("dept") String dept);
	
	// 사용자 정보 삭제
	int deleteUserInfo(@Param("userId") String userId);
	
}