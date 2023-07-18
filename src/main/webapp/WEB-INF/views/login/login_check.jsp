<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
console.log("${siksinMemberDTO.phoneNum}", 핸드폰번호);
console.log("${siksinMemberDTO.password}", 비밀번호);

</script>

<c:choose>
    <c:when test="${empty siksinMemberDTO}">
        <script type="text/javascript">
            alert("아이디와 비밀번호를 다시 확인해주세요");
            history.back();
        </script>
    </c:when>
    <c:otherwise>
        <script type="text/javascript">			
            location.href="./SiksinMemberSelect";
        </script>
    </c:otherwise>
</c:choose>
</head>
<body>
</body>
</html>