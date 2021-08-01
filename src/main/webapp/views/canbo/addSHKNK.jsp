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
	<div class="mb-5"></div>
	<%@include file="/includes/canbo/header.jsp"%>


	<!-- THÔNG TIN NHÂN KHẨU -->
	<div class="container ttnk ">
		<div class="row ">
			<div class="col nhankhau__title text-center">
				<h1>THÊM SỔ HỘ KHẨU</h1>
			</div>
		</div>


		<s:form class="form-body" action="addSHKNK" method="post"
			commandName="shk" modelAttribute="shk" enctype="multipart/form-data">
			<div class="row border ttc pt-2 my-2">
				<div class="col-12">
					<p>Đổi ảnh đại diện:</p>
					<input type="file" class=" mb-2 form-control" name="anh" required>
				</div>


				<div class=" col-sm-3">
					<p>TRÌNH ĐỘ VĂN HÓA:</p>
					<div class="form-group">
						<input type="text" class="form-control" name="trinhDoVanHoa"
							placeholder="" required />
					</div>
				</div>


				<div class=" col-sm-3">
					<p>NGHỀ NGHIỆP:</p>
					<div class="form-group">
						<input type="text" class="form-control" name="ngheNghiep"
							placeholder="Enter the title" required />
					</div>
				</div>
				<div class=" col-sm-6">
					<p>NƠI LÀM VIỆC:</p>
					<div class="form-group">
						<input type="text" class="form-control" name="noiLamViec"
							placeholder="Enter the title" required />
					</div>
				</div>
				<div class=" col-sm-4">
					<p>NGÀY ĐĂNG KÝ THƯỜNG TRÚ:</p>
					<div class="form-group">
						<input type="date" class="form-control" name="ngaySHK"
							placeholder="Enter the title" required />
					</div>
				</div>	
			


				

			<div class=" col-sm-4">
					<p>CMND:</p>
					<select name="soCMND" id="" class="w-100  form-control">
						<c:forEach items="${listCMND}" var="list">
							<option value="${list.soCMND}">${list.soCMND}</option>
						</c:forEach>
					</select>
				</div>				
			
			<div class=" col-sm-4">
				<p>NGÀY Cấp Sổ:</p>
					<div class="form-group">
						<input type="date" class="form-control" name="ngayCapSo"
							placeholder="Enter the title" required />
					</div>
				</div>
				
			<div class=" col-sm-12">
					<p>Địa Chỉ:</p>
					<div class="form-group">
						<input type="text" class="form-control" name="diaChi"
							placeholder="Nhập địa chỉ" required />
					</div>
				</div>
				<input class="btn btn-success mb-3 btn-block mt-5 mx-3"
					type="submit" value="THÊM SỔ HỘ KHẨU">
		</div>
		</s:form>
	</div>




	<%@include file="/includes/footer.jsp"%>

</body>
</html>