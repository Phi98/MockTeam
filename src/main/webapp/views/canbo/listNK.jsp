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

	<div class="container qlhk ">
		<div class="row mt-5">
			<div class="col">
				<s:form method="post" commandName="searchNK" action="searchNK">
					<div class="row justify-content-center">

						<div class="col-md-8">
							<div class="col text-center text_title">
								<h1>NHÂN KHẨU TRONG TỔ</h1>
								<input type="text" value="${to}"
									class="form-control text-center" name="to" id=""
									readonly="readonly">
							</div>
						</div>

					</div>
					<div class="border p-3 bg-info text-white">
						<div class="row">

							<div class="col-6">
								<div class="form-group">
									<b> Tên </b> <input type="text" class="form-control "
										name="tenCMND" id="">
								</div>
							</div>
							<div class="col-6">
								<div class="form-group">
									<b> Địa chỉ </b> <input type="text" class="form-control "
										name="diaChi" id="">

								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-6">
								<div class="form-group">
									<b> Số hộ khẩu: </b> <input type="text" class="form-control "
										name="id_SHK" id="">
								</div>
							</div>
							<div class="col-6">
								<div class="form-group">
									<b> số CMND : </b> <input type="text" class="form-control "
										name="soCMND" id="">


								</div>
							</div>
						</div>


						<div class="row">
							<div class="col">
								<div class="form-group text-center">
									<input class="btn btn-success btn-block" type="submit"
										value="Tìm kiếm">
								</div>
							</div>
						</div>

					</div>


				</s:form>
			</div>
		</div>

		<div class="row hokhau__table mt-5 border">
			<div class="col">
				<table class="table table-light ">
					<thead>
						<tr>
							<th>ID</th>
							<th>TÊN THÀNH VIÊN</th>
							<th>NGÀY SINH</th>
							<th>ĐỊA CHỈ</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="nk">
							<tr>
								<td>${nk.id_NK}</td>
								<td>${nk.soGKS.ten}</td>
								<td>${nk.soCMND.soGKS.ngaySinh}</td>
								<td>${nk.id_SHK.diaChi}</td>
								<td><a href="viewNKCB?id=${nk.id_NK}"
									class="btn btn-primary btn-block">View</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row mt-3">
			<div class="col-6">
				<a href="addNKTT" class="btn btn-primary btn-block mb-3">THÊM
					NHÂN KHẨU</a>
			</div>
			<div class="col-6">
				<a href="addGKSNK" class="btn btn-primary btn-block mb-3">THÊM
					GIẤY KHAI SINH</a>
			</div>

			<div class="col-6">
				<a href="addCMNDNK" class="btn btn-primary btn-block mb-3">THÊM
					CMND</a>
			</div>
		</div>
	</div>


	<%@include file="/includes/footer.jsp"%>
</body>
</html>

