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
	rel="shortcut icon" type="text/css" media="all" />
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

	
	<!-- THÔNG TIN NHÂN KHẨU -->
	<div class="container ttnk ">
		<div class="row ">
			<div class="col nhankhau__title text-center">
				<h1>GỬI TIẾP NHẬN TẠM VẮNG</h1>
			</div>
		</div>


		<s:form class="form-body" action="addCMTT" method="post"
			commandName="cmtt" modelAttribute="cmtt" enctype="multipart/form-data"> 
			<div class="row border ttc pt-2 my-2">
				<div class="col-12  col-sm-3">
					<form action="">
					
						
							<p>SỐ SỔ HỘ KHẨU:</p>
						
								<input type="text" class="form-control" name="id_SHK"
									value="${id_shk}" readonly="readonly" />
						
						

					
						<p class="mt-3">Đổi ảnh đại diện:</p>
						<input type="file" class=" mb-2" name="anh" required>
					</form> 
				</div>
				<div class=" col-12 col-sm-9">
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
						
							<input type="text"  name="soCMND"  class="form-control" 
								placeholder="Enter the title" required />
					
						</div>	
						
						<div class="col-lg-3 col-sm-6">
							<p>Dân Tộc:</p>
							<div class="form-group">
								<input type="text" class="form-control" name="danToc" "Enter the title"  required/>
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
									the title" required/>
							</div>
						</div>

						<div class="col-lg-3 col-sm-6">
							<p>Ghi Chú:</p>
							<div class="form-group">
								<input type="text" class="form-control" name="note" required/>
							</div>
						</div>

						<div class="col-lg-3 col-sm-6">
							<p>Ngày cấp CMND:</p>
							<div class="form-group">
								<input type="date" class="form-control" name="ngayCapCMND"
									"Enter the title" required/>
							</div>
						</div>
					
						<div class="col-lg-3 col-sm-6">
							<p>Ngày đi:</p>
							<div class="form-group">
								<input type="date" class="form-control" name="ngayDi"
									"Enter the title" required />
							</div>
						</div>
						
						<div class="col-lg-3 col-sm-6">
							<p>Ngày về:</p>
							<div class="form-group">
								<input type="date" class="form-control" name="ngayVe"
									"Enter the title" required/>
							</div>
						</div>
							<div class="col-lg-3 col-sm-6">
							<p>Lý do:</p>
							<div class="form-group">
								<div class="form-group">
								<input type="text" class="form-control" name="lyDo" required />
							</div>
							</div>
						</div>	

					</div>
					<input class="btn btn-success mb-3 btn-block gtn_tamvang" style="cursor: pointer;" type="submit"
						value="GỬI TIẾP NHẬN TẠM VẮNG" >
				</div>
			</div>

		</s:form>
	</div>

	<%@include file="/includes/footer.jsp"%>

</body>
</html>