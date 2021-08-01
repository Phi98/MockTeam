<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
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


	<div class="container ttnk">


		<div class="row ">
			<div class="col nhankhau__title text-center">
				<h1>ĐĂNG KÍ CMND</h1>
			</div>
		</div>
		<s:form class="form-body border p-3" action="addCMNDNK"
			enctype="multipart/form-data" commandName="cmnde"
			modelAttribute="cmnde">
			<div class="row justify-content-between ttc">
				<div class="col-12 ">
					<p class="mt-3">Đổi ảnh đại diện:</p>
					<input type="file" class=" mb-2" name="anh" required>




				</div>
				<div class=" col-12 ">
					<div class="row mb-3 ttc">

						<div class="col-lg-3 col-sm-6">
							<p>HỌ TÊN:</p>

							<div class="form-group">
								<input type="text" class="form-control" name="tenCMND"
									placeholder="Enter the title" required />
							</div>
						</div>
						<div class="col-lg-3 col-sm-6">
							<p>Số CMND:</p>

							<input type="text" name="soCMND" class="form-control"
								placeholder="Enter the title" required />

						</div>

						<div class="col-lg-3 col-sm-6">
							<p>Dân Tộc:</p>
							<div class="form-group">
								<input type="text" class="form-control" name="danToc" "Enter the
									title"  required />
							</div>
						</div>

						<div class="col-lg-3 col-sm-6">
							<p>Tôn Giáo:</p>
							<div class="form-group">
								<input type="text" class="form-control" name="tonGiao" "Enter
									the title" required />
							</div>
						</div>

						<div class="col-lg-3 col-sm-6">
							<p>Nơi Làm CMND:</p>
							<div class="form-group">
								<input type="text" class="form-control" name="noiLamCMND" "Enter
									the title" required />
							</div>
						</div>

						<div class="col-lg-3 col-sm-6">
							<p>Ghi Chú:</p>
							<div class="form-group">
								<input type="text" class="form-control" name="note" required />
							</div>
						</div>

						<div class="col-lg-3 col-sm-6">
							<p>Ngày cấp CMND:</p>
							<div class="form-group">
								<input type="date" class="form-control" name="ngayCapCMND"
									"Enter the title" required />
							</div>
						</div>
						<div class="col-lg 3 col-sm-6">
							<p>SỐ GIẤY KHAI SINH:</p>
							<select name="soGKS" id="" class="w-100  form-control">
								<c:forEach items="${listGKS}" var="list">
									<option value="${list.soGKS}">${list.soGKS}</option>
								</c:forEach>
							</select>
						</div>
						
					</div>
				</div>
			</div>
			<input type="submit" style="cursor: pointer;"
							class="btn btn-primary btn-block mt-3 mx-3 "
							value="THÊM CHỨNG MINH NHÂN DÂN">
		</s:form>

	</div>

	<%@include file="/includes/footer.jsp"%>

</body>
</html>
