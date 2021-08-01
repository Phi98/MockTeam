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
</head>
<body>

	<%@include file="/includes/header.jsp"%>

	<div class="container">
		<div class="row mt-5 mb-5">
			<div class="col-lg-2"></div>
			<div class="col-lg-8">
				<div class="modal-content ">
					<div class="modal-header align-self-center py-5">
						<h1>ĐỔI MẬT KHẨU</h1>
					</div>

					<%-- <div style="color: red">${message}</div> --%>
					<div class="modal-body">
						<s:form method="post" commandName="tt" action="changepassTT">
							<div class="form-group">
								<label for="username">TÊN ĐĂNG NHẬP :</label> <input type="text"
									placeholder="" class="form-control " name="userName" required>
								<div class="invalid-feedback">
									<span>>${ms}</span>
									<!-- báo lỗi cho người dùng khi dữ liệu khi invalid -->
								</div>
								<!-- nếu dữ liệu đúng thêm class is-valid vào thẻ input ,nếu dữ liệu sai thêm class is-invalid vào thẻ input -->
							</div>
							<div class="form-group">
								<label for="password">MẬT KHẨU CŨ :</label> <input type="password"
									class="form-control " name="pass" id="pw" required>
								<div class="invalid-feedback">
									CMND không tồn tại
									<!-- báo lỗi cho người dùng khi dữ liệu khi invalid -->
								</div>
								<!-- nếu dữ liệu đúng thêm class is-valid vào thẻ input ,nếu dữ liệu sai thêm class is-invalid vào thẻ input-->
							</div>


							<div class="form-group">
								<label for="password">MẬT KHẨU MỚI :</label> <input type="password"
									class="form-control " name="rePass" id="pw" required>
								<div class="invalid-feedback">
									<span>>${message}</span>
									<!-- báo lỗi cho người dùng khi dữ liệu khi invalid -->
								</div>
								<!-- nếu dữ liệu đúng thêm class is-valid vào thẻ input ,nếu dữ liệu sai thêm class is-invalid vào thẻ input-->
							</div>


							<div class="form-group">
								<label for="password">NHẬP LẠI MẬT KHẨU MỚI :</label> <input type="password"
									class="form-control " name="rePass1" id="pw" required>
								<div class="invalid-feedback">
									CMND không tồn tại
									<!-- báo lỗi cho người dùng khi dữ liệu khi invalid -->
								</div>
								<!-- nếu dữ liệu đúng thêm class is-valid vào thẻ input ,nếu dữ liệu sai thêm class is-invalid vào thẻ input-->
							</div>
							<input class="btn btn-primary btn-block" type="submit"
								value="ĐỔI MẬT KHẨU">
						</s:form>
					</div>
				</div>
			</div>
			<div class="col-lg-2"></div>
		</div>
	</div>

	<%@include file="/includes/footer.jsp"%>

</body>
</html>