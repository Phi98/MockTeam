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




	<div class="container khaisinh">

		<div class="khaisinh__content">
			<h1 class="khaisinh__title text-center mt-3 mb-5">CHỈNH SỬA TÀI
				KHOẢN</h1>
			<s:form  id="FormS" class="form-body border p-3" action="edit" commandName="id"
				modelAttribute="id">
				<div class="row justify-content-between ">

					<div class="col-12">

						Tên Đăng Nhập:<input type="text" name="username"
							value="${tte.username}" class=" form-control" readonly="readonly">
					</div>

					<div class="col-md-6">
						Mât khâu:<input type="text" name="pw" class="w-100 form-control"
							required>
						</p>
					</div>



					<div class="col-md-6">
						<p>
							Email <input name="email" id="email" type="type"
								class="w-100 form-control" required>
						<p id="checkEmail" class="font-weight-normal "
							style="color: red; font-size: 1rem;"></p>
						</p>


					</div>

					<div class="col-md-6">
						<p>
							Nhan Khau <input name="id_NK" type="type"
								value="${tte.id_NK.id_NK}" class="w-100 form-control"
								readonly="readonly">
						</p>
					</div>

					<div class="col-md-6">
						<p>
							To dan pho <input name="id_NK" type="type"
								value="${tte.id_ToDanPho.id_ToDanPho}"
								class="w-100 form-control" readonly="readonly">
						</p>
					</div>


					<input type="submit" style="cursor: pointer;"
						class="btn btn-primary btn-block mx-3" value="Add">
				</div>
			</s:form>
		</div>
	</div>

	<%-- <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
	<script src="<c:url value='/resources/js/checkForm.js'/>"></script> --%>
</body>
</html>


