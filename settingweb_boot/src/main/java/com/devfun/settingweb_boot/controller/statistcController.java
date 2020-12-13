package com.devfun.settingweb_boot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.devfun.settingweb_boot.service.statistcService;
import com.devfun.settingweb_boot.vo.*;

@RestController
public class statistcController {

	@Autowired
	statistcService testService;

	@RequestMapping(value = "/test1")
	public ModelAndView test() throws Exception {
		ModelAndView mav = new ModelAndView("test1");
		
		List<testVo> testList = testService.selectTest();
		mav.addObject("list", testList);
		
		return mav;
	}

	@RequestMapping(value = "/selectRequestInfo")
	public ModelAndView requestInfo() throws Exception{ 
		ModelAndView mav = new ModelAndView("requestInfo"); 
		
		List<requestInfoVo> requestInfoList = testService.selectRequestInfo(); 
		mav.addObject("list", requestInfoList); 
		
		return mav; 
	}
	
	// 월별 접속자 수
	@RequestMapping(value = "/visitorsMonth")
	public List<visitorsMonthVo> selectVisitorsMonth(HttpServletRequest request) throws Exception{ 
		int year = Integer.parseInt(request.getParameter("year"));
		int month = Integer.parseInt(request.getParameter("month"));
		
		List<visitorsMonthVo> loginMonthList = testService.selectVisitorsMonth(year, month); 
		
		return loginMonthList; 
	}
	
	// 일자별 접속자 수
	@RequestMapping(value = "/visitorsDate")
	public List<visitorsDateVo> selectVisitorsDate(HttpServletRequest request) throws Exception{ 
		int year = Integer.parseInt(request.getParameter("year"));
		int month = Integer.parseInt(request.getParameter("month"));
		int date = Integer.parseInt(request.getParameter("date"));
		
		List<visitorsDateVo> loginDateList = testService.selectVisitorsDate(year, month, date); 
		
		return loginDateList; 
	}
	
	// 평균 하루 로그인 수
	@RequestMapping(value = "/loginAvgDate")
	public List<loginVo> selectLoginAvgDate() throws Exception{ 
		List<loginVo> loginDateList = testService.selectLoginAvgDate(); 
		
		return loginDateList; 
	}

	// 휴일을 제외한 로그인 수
	@RequestMapping(value = "/loginWeekday")
	public List<loginVo> selectLoginWeekday() throws Exception{ 
		List<loginVo> loginDateList = testService.selectLoginWeekday(); 
		
		return loginDateList; 
	}
	
	// 부서별 월별 로그인 수
	@RequestMapping(value = "/loginDeptandMonth")
	public List<loginDeptAndMonthVo> selectLoginDeptandMonth(HttpServletRequest request) throws Exception{ 
		String dept = request.getParameter("dept");
		int year = Integer.parseInt(request.getParameter("year"));
		int month = Integer.parseInt(request.getParameter("month"));
		
		List<loginDeptAndMonthVo> loginDateList = testService.selectLoginDeptandMonth(dept, year, month); 
		
		return loginDateList; 
	}
	
}
