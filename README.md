# Siksin_project_ver3_Spring
리뷰게시판(CRUD),회원관리(CRUD), 로그인, 비밀번호 찾기 등 스프링을 이용하여 프로젝트진행
 <br><br> 
 
## ★ 프로젝트 소개
HTML, CSS, JAVASCRIPT, JAVA, OARCLE 등 언어들을 활용하여 Spring Framework 의 MVC 패턴 기법을 적용한 식신이라는 맛집 공유 프로그램을 웹사이트로 구현
<br><br>

### 프로젝트 진행 기간

>  2023.06.26 ~ 2023.07.12 <br>

![프로젝트일정](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/e566d7d5-7c3b-4e84-a0af-c97a552ef86a)
<br><br>

## ★ 개발환경

![개발환경](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/1647505d-48c6-48ca-a9b8-52744ee6d180)
<br> 

- OS : Windows 10 <br>
- FW : Spring Framework 4.3.18 <br>
- DB : Oracle 11 <br>
- WAS : Apache Tomcat 9.0.76
- Front-end : HTML / CSS / javascript / jQuery / Bootstrap  <br>
- Back-end : JDK 1.8 / JSP / Maven 3.9.2 <br>
- Developer Tools : STS 3.9.11 / eXERD / SqlDeveloper <br> 
<br><br>

### Stack

**Front-end**
<br>
- HTML
- CSS
- javascript
- jQuery
- Bootstrap
<br>

**Back-end** 
<br>
- JDK 1.8
- JSP
- Maven 3.9.2
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

![로그인](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/3fbb03cd-3ec7-4c00-9290-2341b23cb2ba)

![비밀번호찾기](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/6fb669a5-4266-4aa7-b5eb-578c8eb84476)
 <br><br>

### 리뷰게시판
- 리뷰관리 페이지로 들어가기 전에 로그인이 되어야 페이지로 접속이 가능
- 해당 리뷰목록에서 리뷰작성 및 리뷰내용을 확인할 수 있음
- 리뷰작성시 로그인한 이름으로 작성도록 구현
- 리뷰내용을 확인하여서 수정 및 삭제를 진행할 수 있음
- 리뷰 수정&삭제를 위해서는 리뷰작성시 입력한 비밀번호와 일치해야지 수정&삭제 가능
 <br>
 
![리뷰전체조회](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/f03ae0fb-2ac5-4694-8739-a76a58313f8c)

![리뷰상세조회](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/ea8ad959-9e0b-4239-b45a-4fff9d43b6e6)

![리뷰작성](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/2ca6d369-96c8-4a85-b72a-5cf0af6d2b4d)

![리뷰수정](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/703642e1-514b-49c5-bf0d-b7126b16598d)

![리뷰삭제](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/50007a53-b9ed-473a-86c1-57c840865ea2)
<br><br>

### 회원관리
- 회원관리 페이지로 들어가기 전에 로그인이 되어야 페이지로 접속이 가능
- 해당 회원목록에서 회원가입 및 회원상세정보를 확인할 수 있음
- 회원상세정보를 확인하여서 정보수정 및 회원탈퇴를 진행할 수 있음
- 회원탈퇴를 위해서는 해당회원의 비밀번호와 일치해야지 탈퇴 가능
- 회원탈퇴를 하면 자동로그아웃과 해당 이름으로 작성한 리뷰는 같이 삭제되도록 구현
<br>

![회원전체조회](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/9e557eff-3071-4b04-8981-eb14197a6c5d)

![회원상세조회](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/58ac66c9-5eee-4f6b-bdb5-a8772da64946)

![회원가입](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/f1b6f709-0aae-406e-8abf-3b253151478a)

![회원정보수정](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/2bb2f7b0-58d6-40e8-b682-2dbd1b267fd7)

![회원탈퇴](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/68aa53ea-52f8-41b6-8726-51b34e814d14)
<br><br>


## ★ ERD

![프로젝트일정](https://github.com/98jungwoo/Siksin_project_ver3_Spring/assets/126783518/76fa88db-0ca3-4349-881e-97f0b2bd1852)
