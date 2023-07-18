<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SIKSIN &mdash;joinMember</title>
<script type="text/javascript">
	alert("${siksinMemberDTO.memberName} 님 가입이 완료되었습니다.");
	location.href = "./SiksinMemberSelect";
</script>
</head>
<body>
</body>
</html>