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
	<div class="container">
		
	<%-- 	<div class="row">
			<div class="col text-center hokhau-title">
				<h1>
					Chi tiết hộ khẩu số: <span class="span__title">${shke.id_SHK}</span>
				</h1>
				<h1>
					Địa chỉ hộ khẩu : <span class="span__title">${shke.diaChi}</span>
				</h1>
				<div
					class="hokhau-title__line welcome-title__line mx-auto mt-3 mb-2 mb-sm-5"></div>
			</div>
		</div> --%>
		
		<div class="row hokhau__table mt-5">
			<div class="col">
			<h1 class="text-center">ĐƠN TIẾP NHẬN QUÁ TRÌNH HỌC TẬP</h1>
				<table class="table table-light mb-5 border">
					<thead>
						<tr>
							<th>ID</th>
								<th>Tên</th>
								<th>Ngày bắt đầu</th>
								<th>Ngày kết thúc</th>
								<th>Nơi học tâp</th>
								<th>Địa chỉ</th>
								<th>Trạng thái</th>	
								<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="list">
							<tr>
								<td>${list.id_qtht}</td>
								<td>${list.id_nk.soGKS.ten}</td>
								<td>${list.diaChi}</td>
								<td>${list.ngayBatDau}</td>
								<td>${list.ngayKetThuc}</td>					
								<td>${list.noiHocTap}</td>
								<td>${list.trangthai}</td>
								
								<td><a href="addQTHTCB?qtht=${list.id_qtht}"
									class="btn btn-primary btn-block">Edit</a></td>		
							</tr>
						</c:forEach>
					</tbody>			
				</table>
	
			</div>
		</div>
	</div>
	<%@include file="/includes/footer.jsp"%>

</body>
</html>
