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
<link href="<c:url value='/resources/css/thongtinnhankhau.css' />"
	rel="stylesheet" type="text/css" media="all" />
</head>
<body>

	<%@include file="/includes/header.jsp"%>


	<div class="container khaisinh ttnk">

		
			<div class="row ">
			<div class="col nhankhau__title text-center">
				<h1>ĐĂNG KÍ KHAI SINH</h1>
			</div>
		</div>
			<s:form class="form-body border p-3" action="addGKSNK"
			commandName="gkse" modelAttribute="gkse">
				<div class="row justify-content-between ttc">
					<div class="col-md-8 ">
						<p>
							<b>Họ và tên:</b><input type="text" name="ten"
								class="w-100 form-control" required>
						</p>
					</div>
					<div class="col-md-4 ">
						<p class="mb-0">Giới tính :</p>
						<select name="gioiTinh" id="" class="w-100  form-control">
							<option value="Nam">Nam</option>
							<option value="Nữ">Nữ</option>
						</select>
					</div>
					<div class="col-md-4 ">
						<p>
							Ngày tháng năm sinh:<input name="ngaySinh" type="date"
								class="w-100 form-control" required>
						</p>
					</div>
					<div class="col-md-8">
						<p>
							Quốc Tịch:<input type="text" name="quocTich"
								class="w-100 form-control" required>
						</p>
					</div>

					<div class="col-md-12">
						<p>
							Nơi sinh:<input type="text" name="noiSinh"
								class="w-100 form-control" required>
						</p>
					</div>

					<div class="col-md-12">
						<p>
							Quê Quán:<input type="text" name="queQuan"
								class="w-100 form-control" required>
						</p>
					</div>

					<div class="col-md-12">
						<p>
							Tên Người làm giấy:<input type="text" name="tenNguoiLamGiay"
								class="w-100 form-control" required>
						</p>
					</div>
					<div class="col-md-4">
						<p>
							Ngày Làm giấy khai sinh:<input type="date" name="ngayLamGKS"
								class="w-100 form-control" required>
						</p>
					</div>
					<div class="col-md-8">
						<p>
							Nơi Làm giấy khai sinh:<input type="text" name="noiLamGKS"
								class="w-100 form-control" required>
						</p>
					</div>
					<div class="col-md-12">
				<!-- 		<p>
							<b>Họ và tên cha:</b><input type="text" name="id_cha"
								class="w-100 form-control">
						</p> -->
							<p class="mb-0">ID cha :</p>
						<select name="id_cha" id="" class="w-100  form-control">
			                <c:forEach items="${list}" var="list">
								<option value="${list.id_NK}">${list.id_NK}</option>
							</c:forEach>
						</select>
					</div>
						<div class="col-md-12">
									<p class="mb-0">ID Mẹ :</p>
						<select name="id_me" id="" class="w-100  form-control">
			<c:forEach items="${list}" var="list">
							<option value="${list.id_NK}">${list.id_NK}</option>
						</c:forEach>					
						
						</select>
					</div>
					<div class="col-md-12 ">
						<p>
						<input type="hidden" name="trangThai" value="chờ duyệt"
								class="w-100 form-control"  >
						</p>
					</div>
					

				</div>
				<input type="submit" style="cursor: pointer;"
					class="btn btn-success btn-block mt-3 " value="THÊM GIẤY KHAI SINH">
			</s:form>
		
	</div>
	<%@include file="/includes/footer.jsp"%>
</body>
</html>
