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
<link href="<c:url value='/resources/images/logo.png' />"
	rel="shortcut icon" type="text/css" media="all" />
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
<link
	href="<c:url value='/resources/css/User_ghstn/user_baotu_ghstn.css' />"
	rel="stylesheet" type="text/css" media="all" />

</head>
<body>

	<%@include file="/includes/header.jsp"%>

	<div class="container ttnk">
		<div class="row ">
			<div class="col nhankhau__title text-center">
				<h1>THÔNG BÁO BÁO TỬ</h1>
			</div>
		</div>
		<s:form class="form-body border p-3" action="saveGBT"
			commandName="gbt" modelAttribute="gbt">
			<div class="">
				<div class="row">

					<div class="col-6 col-md-6 mt-6">

						<div class="form-group">
							IDNK: <input type="text" name="id_nk" value="${id_nk}"
								class="form-control" id="title" readonly="readonly" />
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-12 col-md-12">
						<label>Lý Do</label>
						<div class="form-group">
							<div class="form-group">
								<input type="text" class="form-control" name="lyDo" required />
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-12 col-md-12">
						<label>Tên Người Làm Giấy</label>
						<div class="form-group">
							<div class="form-group">
								<input type="text" class="form-control" name="tenNguoiLamGiay"
									required />
							</div>
						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-12 col-md-12">
						<label>Nơi Mất</label>
						<div class="form-group">
							<div class="form-group">
								<input type="text" class="form-control" name="noiMat" required />
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-12 col-md-12">
						<label>Ngày Mất</label>
						<div class="form-group">
							<div class="form-group">
								<input type="date" class="form-control" name="ngayMat" required />
							</div>
						</div>
					</div>
				</div>
				<!-- <div class="row">
					<div class="col-12 col-md-12">
						<label>Tuổi</label>
						<div class="form-group">
							<div class="form-group">
								<input type="hidden" class="form-control" value ="1"  name="tuoi" required />
							</div>
						</div>
					</div>
				</div> -->

				<div class="row">
					<div class="col-12 col-md-12">
						<label>Ghi chú:</label>
						<div class="form-group">
							<div class="form-group">
								<textarea class="form-control" name="note" id="content" rows="2"></textarea>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<input type="submit" class="btn btn-primary mx-3 mb-3 btn-block"
						style="cursor: pointer;" value="GỬI BÁO TỬ" />
				</div>
			</div>
		</s:form>

	</div>


	<%@include file="/includes/footer.jsp"%>
</body>

</html>
>
