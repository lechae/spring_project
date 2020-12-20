package com.devfun.settingweb_boot.controller;

import java.util.ArrayList;
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
	statistcService sService;
	
	// 에러 VO 생성
	private resultVo makeError(String errorCode) {
		resultVo result = new resultVo();
		result.setResultCode(errorCode);
		result.setResultString(printErrorStr(errorCode));
		
		return result;
	}
	
	// 에러 메세지 생성
	private String printErrorStr(String errorCode) {
		String result = "";

		switch (errorCode) {
		case "1100":
			result = "연도 정보가 정상이 아닙니다. 다시 입력해주세요.";
			break;
		case "1010":
			result = "월 정보가 정상이 아닙니다. 다시 입력해주세요.";
			break;
		case "1001":
			result = "일 정보가 정상이 아닙니다. 다시 입력해주세요.";
			break;
		case "2000":
			result = "부서 정보가 정상이 아닙니다. 다시 입력해주세요.";
			break;
		case "3001":
			result = "아이디 정보가 없습니다. 다시 입력해주세요.";
			break;
		case "3002":
			result = "이름 정보가 없습니다. 다시 입력해주세요.";
			break;
		case "8000":
			result = "아이디가 이미 존재합니다. 아이디를 변경해주세요.";
			break;
		case "8888":
			result = "사용자 정보 삭제를 실패했습니다. 관리자에게 문의주세요.";
			break;	
		case "9000":
			// 삭제 시, userId 파라미터 손실
			result = "내부 오류 발생!";
			break;
		case "9999":
			result = "내부 오류 발생!";
			break;
		}

		return result;
	}
	
	// 월별 접속자 수 조회
	@RequestMapping(value = "/visitorsMonth")
	public List<resultVo> selectVisitorsMonth(HttpServletRequest request) throws Exception {
		List<resultVo> resultVoList = new ArrayList<resultVo>();
		// year 파라미터 확인
		if(request.getParameter("year") == null || request.getParameter("year").equals("")) {
			resultVoList.add(makeError("1100"));
		}
		// month 파라미터 확인
		if(request.getParameter("month") == null || request.getParameter("month").equals("")) {
			resultVoList.add(makeError("1010"));
		}
		// errorCode가 존재하면 json 출력
		if(!resultVoList.isEmpty()) {
			return resultVoList;
		}
		 
		int year = Integer.parseInt(request.getParameter("year"));
		int month = Integer.parseInt(request.getParameter("month"));
		
		resultVoList = sService.selectVisitorsMonth(year, month);
		infoVo info = new infoVo();
		info.setYear(year);
		info.setMonth(month);

		for (int i = 0; i < resultVoList.size(); i++) {
			resultVoList.get(i).setInfo(info);
		}

		return resultVoList;
	}

	// 일자별 접속자 수 조회
	@RequestMapping(value = "/visitorsDate")
	public List<resultVo> selectVisitorsDate(HttpServletRequest request) throws Exception {
		List<resultVo> resultVoList = new ArrayList<resultVo>();
		// year 파라미터 확인
		if(request.getParameter("year") == null || request.getParameter("year").equals("")) {
			resultVoList.add(makeError("1100"));
		}
		// month 파라미터 확인
		if(request.getParameter("month") == null || request.getParameter("month").equals("")) {
			resultVoList.add(makeError("1010"));
		}
		// date 파라미터 확인
		if(request.getParameter("date") == null || request.getParameter("date").equals("")) {
			resultVoList.add(makeError("1001"));
		}
		// errorCode가 존재하면 json 출력
		if(!resultVoList.isEmpty()) {
			return resultVoList;
		}
		
		int year = Integer.parseInt(request.getParameter("year"));
		int month = Integer.parseInt(request.getParameter("month"));
		int date = Integer.parseInt(request.getParameter("date"));

		resultVoList = sService.selectVisitorsDate(year, month, date);
		infoVo info = new infoVo();
		info.setYear(year);
		info.setMonth(month);
		info.setDate(date);

		for (int i = 0; i < resultVoList.size(); i++) {
			resultVoList.get(i).setInfo(info);
		}

		return resultVoList;
	}

	// 평균 하루 로그인 수 조회
	@RequestMapping(value = "/loginAvgDate")
	public List<resultVo> selectLoginAvgDate() throws Exception {
		List<resultVo> resultVoList = sService.selectLoginAvgDate();

		return resultVoList;
	}

	// 휴일을 제외한 로그인 수 조회
	@RequestMapping(value = "/loginWeekday")
	public List<resultVo> selectLoginWeekday() throws Exception {
		List<resultVo> resultVoList = sService.selectLoginWeekday();

		return resultVoList;
	}

	// 부서별 월별 로그인 수 조회
	@RequestMapping(value = "/loginDeptandMonth")
	public List<resultVo> selectLoginDeptandMonth(HttpServletRequest request) throws Exception {
		List<resultVo> resultVoList = new ArrayList<resultVo>();
		// year 파라미터 확인
		if(request.getParameter("year") == null || request.getParameter("year").equals("")) {
			resultVoList.add(makeError("1100"));
		}
		// month 파라미터 확인
		if(request.getParameter("month") == null || request.getParameter("month").equals("")) {
			resultVoList.add(makeError("1010"));
		}
		// dept 파라미터 확인
		if(request.getParameter("dept") == null || request.getParameter("dept").equals("")) {
			resultVoList.add(makeError("2000"));
		} 
		// errorCode가 존재하면 json 출력
		if(!resultVoList.isEmpty()) {
			return resultVoList;
		}
		
		String dept = request.getParameter("dept");
		int year = Integer.parseInt(request.getParameter("year"));
		int month = Integer.parseInt(request.getParameter("month"));

		resultVoList = sService.selectLoginDeptandMonth(dept, year, month);
		infoVo info = new infoVo();
		info.setDepartment(dept);
		info.setYear(year);
		info.setMonth(month);

		for (int i = 0; i < resultVoList.size(); i++) {
			resultVoList.get(i).setInfo(info);
		}

		return resultVoList;
	}
	
	// 사용자 정보 조회
	@RequestMapping(value = "/userInfo")
	public ModelAndView selectUserInfo() throws Exception {
		ModelAndView mav = new ModelAndView("userInfo");

		List<userVo> requestInfoList = sService.selectUserInfo();
		mav.addObject("list", requestInfoList);

		return mav;
	}
	
	@RequestMapping(value = "/userInfoJson")
	public List<userVo> selectUserInfoJson() throws Exception {
		List<userVo> userVoList = sService.selectUserInfo();

		return userVoList;
	}
	
	// 사용자 정보 입력 페이지
	@RequestMapping(value = "/registerView")
 	public ModelAndView register() throws Exception {
		ModelAndView mav = new ModelAndView("register");

		return mav;
	}
	
	// USER 테이블에 사용자 정보 추가
	@RequestMapping(value = "/register")
	public List<resultVo> insertUserInfo(HttpServletRequest request) throws Exception {
		List<resultVo> resultVoList = new ArrayList<resultVo>();
		// userId 파라미터 확인
		if(request.getParameter("userId") == null || request.getParameter("userId").equals("")) {
			resultVoList.add(makeError("3001"));
		}
		// name 파라미터 확인
		if(request.getParameter("name") == null || request.getParameter("name").equals("")) {
			resultVoList.add(makeError("3002"));
		}
		// dept 파라미터 확인
		if(request.getParameter("dept") == null || request.getParameter("dept").equals("")) {
			resultVoList.add(makeError("2000"));
		} 
		// errorCode가 존재하면 json 출력
		if(!resultVoList.isEmpty()) {
			return resultVoList;
		}
		 
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		String dept = request.getParameter("dept");
		
		try {
			sService.insertUserInfo(userId, name, dept);
		} catch (Exception e) {
			// TODO: handle exception
			resultVoList.add(makeError("8000"));
			
			return resultVoList;
		}
		
		String successCode = "0000";
		resultVo result = new resultVo();
		result.setResultCode(successCode);
		result.setResultString("사용자 정보가 정상적으로 추가되었습니다.");
		resultVoList.add(result);

		return resultVoList;
	}

	// USER 테이블에 사용자 정보 삭제
	@RequestMapping(value = "/remove")
	public List<resultVo> deleteUserInfo(HttpServletRequest request) throws Exception { 
		List<resultVo> resultVoList = new ArrayList<resultVo>();
		// userId 파라미터 확인
		if(request.getParameter("userId") == null || request.getParameter("userId").equals("")) {
			resultVoList.add(makeError("9000"));
		}
		// errorCode가 존재하면 json 출력
		if(!resultVoList.isEmpty()) {
			return resultVoList;
		}
		 
		String userId = request.getParameter("userId");
		
		try {
			sService.deleteUserInfo(userId);
		} catch (Exception e) {
			// TODO: handle exception
			resultVoList.add(makeError("8888"));
			
			return resultVoList;
		}
		
		String successCode = "0000";
		resultVo result = new resultVo();
		result.setResultCode(successCode);
		result.setResultString("사용자 정보가 정상적으로 삭제되었습니다.");
		resultVoList.add(result);

		return resultVoList;
	}
}
