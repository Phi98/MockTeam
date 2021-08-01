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
	<div class="container">
	$$$: ${count}
	<h1 class="text-center mt-3 mb-5">DANH SÁCH CÁN BỘ</h1>
	<div class="row hokhau__table">
		<div class="col">
			<table class="table table-bordered mb-5">
				<thead>
					<tr>
						<th>User Name:</th>
						<th>PassWord:</th>
						<th>ID NK:</th>
						<th>Tổ:</th>
						<th>Email:</th>
						<th></th>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${lists}" var="list">
						<tr>
							<td>${list.username}</td>
							<td>${list.pw}</td>
							<td>${list.id_NK.id_NK}</td>
							<td>${list.id_ToDanPho.id_ToDanPho}</td>
							<td>${list.email}</td>
							<td><a class="nav-link btn btn-primary" href="edit?id=${list.username}">Edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="row mb-5"> <a class="nav-link btn btn-primary btn-block" href="add">THÊM CÁN BỘ</a>
			<c:if test="${admin!=null}">
				<a class="nav-link  btn btn-primary btn-block" href="thoatAD">THOÁT</a>
			</c:if></div>
			
		</div>
	</div>
	<pre>$$$: ${count}</pre>
	</div>
</body>
</html>