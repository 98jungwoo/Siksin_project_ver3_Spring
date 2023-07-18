<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SIKSIN &mdash;review_update</title>

<script type="text/javascript">
	console.log('${siksinReviewDTO.reviewPassword}')
	console.log('${siksinReviewDTODetail.reviewPassword}')
</script>

</head>
<body>
	<script type="text/javascript">
		alert("리뷰를 삭제하였습니다.");
		location.href = "./SiksinReviewSelect";
	</script>
</body>
</html>