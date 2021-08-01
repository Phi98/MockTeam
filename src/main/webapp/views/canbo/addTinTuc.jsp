
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
<link href="<c:url value='/resources/css/index_admin.css' />"
	rel="stylesheet" type="text/css" media="all" />

</head>
<body>

	<%@include file="/includes/canbo/header.jsp"%>

	<s:form class="form-body" action="addTinTuc">
		<div class="container">
			<div class="col-md-12">
				<p>Tiêu Đề</p>
				<div class="form-group">
					<input type="text" class="form-control" name="tieuDe" value="" />
				</div>
			</div>


			<div class="col-md-12">
				<p>
					Nội Dung Ngắn:<input name="noiDungNgan" type="text" value=""
						class="w-100 form-control">
				</p>
			</div>
			<div class="col-md-12">
				<label>Nội Dung</label>
				<div class="form-group">
					<div class="form-group">
						<textarea class="form-control" name="noiDungDai" rows="6"></textarea>
					</div>
				</div>
			</div>

			<div class="col-md-12">

				<input type="submit" style="cursor: pointer;"
					class="btn btn-primary btn-block" value="Xác Nhận" />

			</div>
		</div>
	</s:form>

</body>
</html>