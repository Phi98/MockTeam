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

<%-- 
	<h1>${nke.trinhDoVanHoa}</h1>
	<h1>${nke.ngheNghiep}</h1>
	<h1>${nke.noiLamViec}</h1>
	<h1>${nke.quanHeVoiChuHo}</h1>
	<h1>${nke.trangthai}</h1>
	<h1>${nke.ngaySHK}</h1>
	<h1>${nke.soGKS}</h1>
	<h1>${nke.id_SHK}</h1>
	<h1>${nke.tenCMND}</h1>
	<h1>${nke.danToc}</h1>
	<h1>${nke.tonGiao}</h1>
	<h1>${nke.noiLamCMND}</h1>
	<h1>${nke.note}</h1>
	<h1>${nke.ngayCapCMND}</h1>
	<h1>${nke.anh}</h1> --%>
	<!-- THÔNG TIN NHÂN KHẨU -->
	<div class="container ttnk ">
		<div class="row ">
			<div class="col nhankhau__title text-center">
				<h1>THÔNG TIN CHUNG</h1>
			</div>
		</div>


		<s:form class="form-body" action="saveNKCMND" method="post"
			commandName="nk" modelAttribute="nk" enctype="multipart/form-data">
			<div class="row border ttc pt-2 my-2">
				<div class="col-sm-4 ">
					<form action="">
						<p>Đổi ảnh đại diện:</p>
						<input type="file" class=" mb-2" name="anh" required>
					</form>
				</div>

			
					

						<div class=" col-sm-4">
							<p>HỌ TÊN:</p>
							<div class="form-group">
								<input type="text" class="form-control" value="${gkse.ten}"
									readonly="readonly" />
							</div>
						</div>
						<div class=" col-sm-4">
							<p>NƠI SINH:</p>
							<div class="form-group">
								<input type="text" class="form-control" value="${gkse.noiSinh}"
									readonly="readonly" />
							</div>
						</div>
					


					<div class="col-sm-4">
						<p>TRÌNH ĐỘ VĂN HÓA:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="trinhDoVanHoa"
								placeholder="Enter the title" required/>
						</div>
					</div>
				
				
					<div class=" col-sm-4">
						<p>NGHỀ NGHIỆP:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="ngheNghiep"
								placeholder="Enter the title" required />
						</div>
					</div>
					<div class=" col-sm-4">
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
								placeholder="Enter the title"  required/>
						</div>
					</div>
			
				<div class="col-sm-4">
						<p class="mb-0">Giới tính :</p>
						<select name="gioiTinh" id="" class="w-100  form-control">
							<option value="Nam">Nam</option>
							<option value="Nữ">Nữ</option>
						</select>
					</div>

			
					<div class="col-sm-4">
						<p>QUAN HỆ CHỦ HỘ:</p>
						
						<select name="quanHeVoiChuHo" id="" class="form-control">
							<option value="Vợ">Vợ</option>
							<option value="Con">Con</option>
							<option value="Cháu">Cháu</option>
							<option value="Anh">Anh</option>
							<option value="Chị">Chị</option>
							<option value="Bác">Bác</option>
							<option value="Gì">Gì</option>
							<option value="Cậu">Cậu</option>
						</select>
						
								</div>

					<div class=" col-sm-4">
						<p>SỐ SỔ HỘ KHẨU:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="id_SHK"
								value="${id_shk}" readonly="readonly"  />
						</div>
					</div>

					<div class="col-sm-4">
						<p>Tên CMND:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="tenCMND"
								value="${gkse.ten}" readonly="readonly" />
						</div>
					</div>
					<div class=" col-sm-4">
						<p>Dân Tộc:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="danToc" "Enter the title"  required/>
						</div>
					</div>

					<div class=" col-sm-4">
						<p>Tôn Giáo:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="tonGiao" "Enter the title"  required/>
						</div>
					</div>

					<div class=" col-sm-4">
						<p>Nơi Làm CMND:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="noiLamCMND" "Enter
								the title"  required/>
						</div>
					</div>

					<div class=" col-sm-4">
						<p>Ghi Chú:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="note" "Enter the title"  required/>
						</div>
					</div>

					<div class=" col-sm-4">
						<p>Ngày cấp CMND:</p>
						<div class="form-group">
							<input type="date" class="form-control" name="ngayCapCMND" "Enter
								the title" required />
						</div>
					</div>

					<div class=" col-sm-4">
						<p>SỐ GIẤY KHAI SINH:</p>
						<div class="form-group">
							<input type="text" class="form-control" name="soGKS"
								value="${gkse.soGKS}" readonly="readonly" />
						</div>
					</div>
			
				<input class="btn btn-success btn-block my-3 mx-3" style="cursor: pointer;" type="submit"
					value="Thêm Nhân Khẩu">
			</div>
	</div>

	</s:form>
	</div>

	<%@include file="/includes/footer.jsp"%>

</body>
</html>