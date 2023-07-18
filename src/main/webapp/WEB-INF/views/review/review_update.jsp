<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:if test="${empty sessionScope.phoneNum}">
	<script type="text/javascript">
		location.href = "./SiksinLogin"
	</script>
</c:if>
<!DOCTYPE HTML>
<!--
	Aesthetic by gettemplates.co
	Twitter: http://twitter.com/gettemplateco
	URL: http://gettemplates.co
-->
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>SIKSIN &mdash;review_update</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Free HTML5 Website Template by GetTemplates.co" />
<meta name="keywords"
	content="free website templates, free html5, free template, free bootstrap, free website template, html5, css3, mobile first, responsive" />
<meta name="author" content="GetTemplates.co" />

<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Kaushan+Script"
	rel="stylesheet">

<!-- Animate.css -->
<link rel="stylesheet" href="css/animate.css">
<!-- Icomoon Icon Fonts-->
<link rel="stylesheet" href="css/icomoon.css">
<!-- Themify Icons-->
<link rel="stylesheet" href="css/themify-icons.css">
<!-- Bootstrap  -->
<link rel="stylesheet" href="css/bootstrap.css">
<!-- Magnific Popup -->
<link rel="stylesheet" href="css/magnific-popup.css">
<!-- Bootstrap DateTimePicker -->
<link rel="stylesheet" href="css/bootstrap-datetimepicker.min.css">
<!-- Owl Carousel  -->
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<!-- Theme style  -->
<link rel="stylesheet" href="css/style.css">
<!-- Modernizr JS -->
<script src="js/modernizr-2.6.2.min.js"></script>
<!-- FOR IE9 below -->
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
<script type="text/javascript">

function passwordCheck() {
	if (${siksinReviewDTODetail.reviewPassword} != $("#reviewPassword").val()) {
		alert("비밀번호가 일치하지 않습니다.");

	}else {
		$("#reviewUpdate").submit();
	}
}
</script>
</head>
<body>
	<div class="gtco-loader"></div>
	<div id="page">
		<!-- <div class="page-inner"> -->
		<nav class="gtco-nav" role="navigation">
			<div class="gtco-container">
				<div class="row">
					<div class="col-sm-4 col-xs-12">
						<div id="gtco-logo">
							<a href="./index.jsp">SIKSIN <em>.</em></a><br>
						</div>
					</div>
					<div class="col-xs-8 text-right menu-1">
						<ul>
							<c:choose>
								<c:when test="${empty sessionScope.phoneNum}">
									<li class="btn-cta"><a
										onclick="location.href='./SiksinLogin'"><span>Login</span></a>
								</c:when>
								<c:otherwise>
									<li class="btn-cta">
									<li class="has-dropdown"><a href="./SiksinReviewSelect">리뷰관리</a>
									<li class="has-dropdown"><a href="./SiksinSelect">회원관리</a>
										<a
										href="./SiksinSelectMemberDetail?memberName=${sessionScope.memberName}">${sessionScope.memberName}(${sessionScope.nickName})
											님</a>
									<li class="btn-cta"><a
										onclick="location.href='./SiksinLogout'"><span>Logout</span></a>
								</c:otherwise>
							</c:choose>
						</ul>
					</div>
				</div>
			</div>
		</nav>

		<header id="gtco-header" class="gtco-cover gtco-cover-sm"
			role="banner" style="background-image: url(images/img_bg_3.jpg)">
			<div class="overlay"></div>
			<div class="gtco-container">
				<div class="row">
					<div class="col-md-12 col-md-offset-0 text-center">
						<div class="row row-mt-15em">
							<div class="col-md-12 mt-text animate-box"
								data-animate-effect="fadeInUp">
								<span class="intro-text-small"> <a href="#"
									target="_blank">대한민국 No.1 맛집 서비스 siksin. 리뷰수정</a></span>
								<h1 class="cursive-font">SIKSIN.</h1>
							</div>
						</div>
					</div>
				</div>
			</div>
		</header>

		<div class="gtco-section">
			<div class="gtco-container">
				<div class="row">
					<div class="col-md-12">
						<div class="col-md-12 animate-box">
							<fieldset name="review">
								<h3>리뷰 수정하기</h3>
								<form method="post" enctype="application/x-www-form-urlencoded"
									id="reviewUpdate">

									<!-- 여기에 별점 모양 -->
									<div class="row form-group">
										<div class="col-md-12">
											<label class="member_label" for="memberArea">별점</label> <select
												name="ratingScore" id="ratingScore" class="form-control">
												<option value="${siksinReviewDTODetail.ratingScore}">${siksinReviewDTODetail.ratingScore}</option>
												<option value="5점">★★★★★ 5</option>
												<option value="4점">★★★★☆ 4</option>
												<option value="3점">★★★☆☆ 3</option>
												<option value="2점">★★☆☆☆ 2</option>
												<option value="1점">★☆☆☆☆ 1</option>
												<option value="0점">☆☆☆☆☆ 0</option>
											</select>
										</div>
									</div>

									<!-- 리뷰내용 작성 -->
									<div class="row form-group">
										<div class="col-md-12">
											<label class="sr-only" for="message">리뷰 작성</label>
											<textarea name="reviewContent" id="reviewContent" cols="30"
												rows="10" class="form-control"
												placeholder="매장에 대한 리뷰를 작성해보세요*">${siksinReviewDTODetail.reviewContent}</textarea>
										</div>
									</div>

									<!-- 태그 선택 -->
									<div class="row form-group">
										<div class="col-md-12">
											<label class="member_label" for="restaurantTag">매장 태그</label>
											<select name="restaurantTag" id="restaurantTag"
												class="form-control">
												<option value="${siksinReviewDTODetail.restaurantTag}">${siksinReviewDTODetail.restaurantTag}</option>
												<option value="전체">전체</option>
												<option value="백년가게">백년가게</option>
												<option value="여자들끼리">여자들끼리</option>
												<option value="데이트">데이트</option>
												<option value="남자들끼리">남자들끼리</option>
												<option value="가족식사">가족식사</option>
												<option value="모임">모임</option>
												<option value="신상맛집">신상맛집</option>
												<option value="동창">동창</option>
												<option value="여자동창모임">여자동창모임</option>
												<option value="여자">여자</option>
												<option value="가족외식">가족외식</option>
											</select>
										</div>
									</div>

									<!-- 음식점 이름입력 -->
									<div class="row form-group">
										<div class="col-md-12">
											<label class="sr-only" for="restaurantName">매장 명(필수)</label>
											<input name="restaurantName" id="restaurantName"
												class="form-control" placeholder="매장 명*"
												value="${siksinReviewDTODetail.restaurantName}"></input>
										</div>
									</div>

									<!-- 음식점 지역 입력 -->
									<div class="row form-group">
										<div class="col-md-12">
											<label class="sr-only" for="restaurantArea">매장 지역</label> <input
												name="restaurantArea" id="restaurantArea"
												class="form-control" placeholder="매장 지역"
												value="${siksinReviewDTODetail.restaurantArea}"></input>
										</div>
									</div>

									<!-- 리뷰 수정을 위한 비밀번호 입력 -->
									<div class="row form-group">
										<div class="col-md-6">
											<label class="sr-only" for="reviewPassword">비밀번호</label> <input
												name="reviewPassword" id="reviewPassword"
												class="form-control" placeholder="리뷰수정을 위한 비밀번호(필수)"></input>
										</div>
									</div>
									<hr>
									<div class="form-group">
										<div class="member_button">
											<input type="button" class="btn btn-primary"
												id="review_submit" value="리뷰 수정완료" onclick="passwordCheck()">

											<input type="reset" class="btn btn-primary"
												id="review_submit" value="리뷰 수정취소">
										</div>
									</div>
								</form>
							</fieldset>
						</div>
					</div>
				</div>
			</div>
		</div>

		<footer id="gtco-footer" role="contentinfo"
			style="background-image: url(images/img_bg_1.jpg)"
			data-stellar-background-ratio="0.5">
			<div class="overlay"></div>
			<div class="gtco-container">
				<div class="row row-pb-md">

					<div class="col-md-12 text-center">
						<div class="gtco-widget">
							<h3>Get In Touch</h3>
							<ul class="gtco-quick-contact">
								<li><a href="#"><i class="icon-phone"></i> 1577-3957</a></li>
								<li><a href="#"><i class="icon-mail2"></i>info@siksinhot.com</a></li>
								<li><a href="#"><i class="icon-chat"></i> Live Chat</a></li>
							</ul>
						</div>
						<div>
							<p>
								<strong data-reactid="1330">식신(주)</strong><em
									data-reactid="1331"></em>
								<!-- react-text: 1332 -->
								대표자
								<!-- /react-text -->
								<!-- react-text: 1333 -->
								&nbsp;
								<!-- /react-text -->
								<strong data-reactid="1334">안병익</strong><em data-reactid="1335"></em>
								<!-- react-text: 1336 -->
								서울특별시 강남구 테헤란로8길 16, 9층 (지희빌딩)
								<!-- /react-text -->
								<br data-reactid="1337">
								<!-- react-text: 1338 -->
								사업자등록번호
								<!-- /react-text -->
								<!-- react-text: 1339 -->
								&nbsp;
								<!-- /react-text -->
								<strong data-reactid="1340">214-88-59748&nbsp;</strong><em
									data-reactid="1341"></em>
								<!-- react-text: 1342 -->
								|&nbsp;TEL&nbsp;
								<!-- /react-text -->
								<strong data-reactid="1343"><a href="tel:1577-3957"
									data-reactid="1344">1577-3957&nbsp;</a></strong><em data-reactid="1345"></em>
								<!-- react-text: 1346 -->
								|&nbsp;FAX&nbsp;
								<!-- /react-text -->
								<strong data-reactid="1347">02.533.1909&nbsp;</strong><em
									data-reactid="1348"></em>
								<!-- react-text: 1349 -->
								|&nbsp;EMAIL&nbsp;
								<!-- /react-text -->
								<a href="mailto:info@siksinhot.com" data-reactid="1350"><strong
									data-reactid="1351">info@siksinhot.com</strong></a><br
									data-reactid="1352">
								<!-- react-text: 1353 -->
								Copyright (c) SIKSIN. All Rights Reserved.
								<!-- /react-text -->
							</p>
						</div>
					</div>

					<div class="col-md-12 text-center copyright">
						Shared by <i class="fa fa-love"></i><a
							href="https://bootstrapthemes.co">BootstrapThemes</a>
					</div>
				</div>
			</div>
		</footer>
	</div>
	<div class="gototop js-top">
		<a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
	</div>
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Carousel -->
	<script src="js/owl.carousel.min.js"></script>
	<!-- countTo -->
	<script src="js/jquery.countTo.js"></script>
	<!-- Stellar Parallax -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Magnific Popup -->
	<script src="js/jquery.magnific-popup.min.js"></script>
	<script src="js/magnific-popup-options.js"></script>
	<script src="js/moment.min.js"></script>
	<script src="js/bootstrap-datetimepicker.min.js"></script>
	<!-- Main -->
	<script src="js/main.js"></script>
</body>
</html>

