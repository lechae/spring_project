# spring_project
스프링 프레임워크 공부를 위한 연습용 프로젝트

- 기간: 2020.11.24 ~   
- 참고한 책: [코드로 배우는 스프링 웹 프로젝트](https://www.aladin.co.kr/shop/wproduct.aspx?ItemId=166270352)

</br>

# 주간보고
## 1주차 (2020.11.24 ~ 2020.11.29)
- Java 11.0.9 설치
- Eclipse(jee-2020-09-R) 및 STS(Spring Tool Suite) 설치
- Tomcat 9 설치 및 Eclipse 연동
- mariaDB(10.2.36) & workbench(8.0.22) 설치
- [settingweb](./settingweb) 프로젝트에 DB 연동하여 서버로 확인

  ![1주차 프로젝트 결과 이미지!](./pics/week1/projectresult.jpg "1주차 프로젝트 결과")

- [개발 환경 구축 중 나온 이슈들](./docs/[1week]how-to-resolve-setting-issues.md "개발 환경 구축 중 나온 이슈들")

</br>
</br>

## 2주차 (2020.11.30 ~ 2020.12.6)
- [API 가이드 문서 작성](./docs/[week2]SW_활용률_API_사용_가이드.pdf)
- 참고 문서
    - [LINE Pay 기술 연동 가이드](https://pay.line.me/file/guidebook/technicallinking/LINE_Pay_Technical_Linking_Guide_for_Normal_Merchant_v1.0.1_ko.pdf)
    - [RESTful API 설계 가이드](https://sanghaklee.tistory.com/57)
- Question
  - 요청 메세지가 json이 아닌 url인 경우 어떻게 작성해야 할까요? (어떻게 작성해야할 지 몰라 요청 URL로 작성했습니다.)
  
    ![API endpoint 명세 이미지!](./pics/week2/API_endpoint.jpg "LINE Pay 기술 연동 가이드에서 캡처")

- Quiz
  - pathVariable
    
    {}(중괄호)를 사용해 URL 뒤에 변수처럼 적어준 뒤 @pathVariable 어노테이션 뒤에 name 속성의 값으로 {} 안에 적은 변수명을 넣어서 사용한다. 그 이후 자료형과 변수명을 바로 뒤에 선언해주면 된다. restAPI에서 많이 사용한다.

  - JSON

    JavaScript Object Notation라는 의미의 축약어로 데이터를 저장하거나 전송할 때 많이 사용되는 경량의 DATA 교환 형식이다. 사람과 기계 모두가 이해하기 쉽고 용량이 작기 때문에 XML을 대체하여 데이터 전송 등에 자주 사용된다.

  - HTTP

     HTML 문서와 같은 리소스들을 가져올 수 있도록 해주는 프로토콜이다. 웹에서 이루어지는 모든 데이터 교환의 기초이며, 클라이언트-서버 프로토콜이다.


</br>
</br>
