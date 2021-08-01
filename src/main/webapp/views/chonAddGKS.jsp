<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta>
<title>GOV HÒA HẢI</title>
<!-- LOGO TITLE -->
<!-- LOGO TITLE -->
<link href="<c:url value='/resources/images/logo.png' />"
	rel="stylesheet" type="text/css" media="all" />
<!-- BOOTSTRAP 4 -->
<link href="<c:url value='/resources/css/bootstrap.css' />"
	rel="stylesheet" type="text/css" media="all" />

<!-- FONTAWESOME -->
<link href="<c:url value='/resources/css/font-awesome.css' />"
	rel="stylesheet" type="text/css" media="all" />
<!-- OWL CAROUSEL -->
<link href="<c:url value='/resources/css/owl.carousel.css' />"
	rel="stylesheet" type="text/css" media="all" />
<link href="<c:url value='/resources/css/owl.theme.default.css' />"
	rel="stylesheet" type="text/css" media="all" />
<!-- MAIN CSS -->
<link href="<c:url value='/resources/css/index.css' />" rel="stylesheet"
	type="text/css" media="all" />
<link href="<c:url value='/resources/css/thongtinnhankhau.css' />"
	rel="stylesheet" type="text/css" media="all" />
	<link href="<c:url value='/resources/css/index_admin.css' />"
	rel="stylesheet" type="text/css" media="all" />
	
<link href="<c:url value='/resources/css/tracuutt1.css' />"
	rel="stylesheet" type="text/css" media="all" />
	
</head>
<body>



	<%@include file="/includes/header.jsp"%>
	<!-- OFFER -->
	<div class="container offer-section">
		<div class="row mb-5">
			<div class="col offer-title text-center">
				<div
					class="start-title__line welcome-title__line mx-auto mt-3 mb-2 mb-sm-5"></div>
				<span>Vui lòng lựa chọn hình thức</span>
			</div>
		</div>
		<div class="row text-center">
			<div class="col-12 col-sm-6 ">
				<a href="addNKCMND?soGKS=${gkse.soGKS}&id_shk=${id_shk}">
					<div class="offer-item">
						<i class="fa fa-user-o"></i>
						<h3>ADD NHÂN KHẨU DƯỚI 18 TUỔI</h3>						
					</div>
				</a>
			</div>
			<div class="col-12 col-sm-6 ">
				<a href="saveNKCMND?soGKS=${gkse.soGKS}&id_shk=${id_shk}">
					<div class="offer-item">
						<i class="fa fa-user-o"></i>
						<h3>ADD NHÂN KHẨU TRÊN 18 TUỔI</h3>
					
					</div>
				</a>
			</div>
		</div>
	</div>

	<%@include file="/includes/footer.jsp"%>

</body>
</html>

