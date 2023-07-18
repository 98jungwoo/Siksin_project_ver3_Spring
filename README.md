# Siksin_project_ver3_Spring
리뷰게시판(CRUD),회원관리(CRUD), 로그인, 비밀번호 찾기 등 스프링을 이용하여 프로젝트진행
 <br><br> 
 
## ★ 프로젝트 소개
HTML, CSS, JAVASCRIPT, JAVA, OARCLE 등 언어들을 활용하여 Spring Framework 의 MVC 패턴 기법을 적용한 식신이라는 맛집 공유 프로그램을 웹사이트로 구현
사용자 친화적인 UI 와 기본에 충실한 그룹웨어로 조직 구성원들이 의사 소통, 업무 전달, 정보 공유 및 의사 결정들의 업무 활동을 원활하게 수행하고 지원.
<br><br>

### 프로젝트 진행 기간

>  2023.06.29 ~ 2023.07.12 <br>

![프로젝트 일정](https:/img/Siksin_project_ver3_Spring/프로젝트일정.png)
<br><br>

## ★ 개발환경

![개발환경](https:/img/Siksin_project_ver3_Spring/개발환경.png)
![개발환경](img/Siksin_project_ver3_Spring/개발환경.png)
<br>

- OS : Windows 10 <br>
- FW : Spring Framework <br>
- DB : Oracle 11 <br>
- WAS : Apache Tomcat 9 <br>
- Front-end : HTML / CSS / javascript / jQuery  <br>
- Back-end : JDK 1.8 / JSP / Mybatis <br>
- Developer Tools : STS 3.9.11 / eXERD / SqlDeveloper <br> 
<br><br>

### Stack

**Front-end**
<br>
- HTML
- CSS
- javascript
- jQuery 
<br>

**Back-end** 
<br><br>
- JDK 1.8
- JSP
- Mybatis
<br>

###  TOOL
- STS 3.9.11 
- eXERD
- SqlDeveloper <br> 
<br><br>

## ★ 주요 기능 

```sh
- 로그인(로그아웃)
- 비밀번호 찾기
- 리뷰게시판 관리 
- 회원관리
```
<br>

	
## ★ 기능 상세 설명 

### 로그인
- 전화번호를 아이디로 사용하여 비밀번호를 확인하여 로그인 처리
- 비밀번호를 잊어버렸을 시 전화번호 입력을 통해서 비밀번호를 찾도록 구현
<br>

![로그인](https:/img/Siksin_project_ver3_Spring/로그인.png)

![비밀번호찾기](https:/img/Siksin_project_ver3_Spring/비밀번호찾기.png)
 <br><br>

### 리뷰게시판
- 리뷰관리 페이지로 들어가기 전에 로그인이 되어야 페이지로 접속이 가능
- 해당 리뷰목록에서 리뷰작성 및 리뷰내용을 확인할 수 있음
- 리뷰작성시 로그인한 이름으로 작성도록 구현
- 리뷰내용을 확인하여서 수정 및 삭제를 진행할 수 있음
- 리뷰 수정&삭제를 위해서는 리뷰작성시 입력한 비밀번호와 일치해야지 수정&삭제 가능
 <br>
 
![리뷰전체조회](https:/img/Siksin_project_ver3_Spring/리뷰전체조회.png)

![리뷰상세조회](https:/img/Siksin_project_ver3_Spring/리뷰상세조회.png)

![리뷰작성](https:/img/Siksin_project_ver3_Spring/리뷰작성.png)

![리뷰수정](https:/img/Siksin_project_ver3_Spring/리뷰수정.png)

![리뷰삭제](https:/img/Siksin_project_ver3_Spring/리뷰삭제.png)
<br><br>

### 회원관리
- 회원관리 페이지로 들어가기 전에 로그인이 되어야 페이지로 접속이 가능
- 해당 회원목록에서 회원가입 및 회원상세정보를 확인할 수 있음
- 회원상세정보를 확인하여서 정보수정 및 회원탈퇴를 진행할 수 있음
- 회원탈퇴를 위해서는 해당회원의 비밀번호와 일치해야지 탈퇴 가능
- 회원탈퇴를 하면 자동로그아웃과 해당 이름으로 작성한 리뷰는 같이 삭제되도록 구현
<br>

![회원전체조회](https:/img/Siksin_project_ver3_Spring/회원전체조회.png)

![회원상세조회](https:/img/Siksin_project_ver3_Spring/회원상세조회.png)

![회원가입](https:/img/Siksin_project_ver3_Spring/회원가입.png)

![회원정보수정](https:/img/Siksin_project_ver3_Spring/회원정보수정.png)

![회원탈퇴](https:/img/Siksin_project_ver3_Spring/회원탈퇴.png)
<br><br>


## ★ ERD

![테이블명세서](https://img/Siksin_project_ver3_Spring/테이블명세서.png)
