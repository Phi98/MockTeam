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
			<h1 class="khaisinh__title text-center">Quá  trình học tập</h1>

	
			<s:form id="FormS" class="form-body" action="addTT" commandName="tte"
				modelAttribute="tte">
				<div class="row justify-content-between">

	<c:if test="${email=='email'}">Email không đúng</c:if>
	<br>
					<div class="col-md-12">

						Tên Đăng Nhập:<input type="text" name="username"
							class="w-100 form-control" required>
						</p>

					</div>
					<div class="col-md-12">
						Mât khâu:<input type="text" name="pw" class="w-100 form-control"
							required>
						</p>
					</div>



					<div class="col-md-12">
						<p>
							Email <input id="email" name="email" type="type"
								class="w-100 form-control" required>
						<p id="checkEmail" class="font-weight-normal "
							style="color: red; font-size: 1rem;"></p>
						</p>
					</div>

					<div class="col-md-12">

						<p class="mb-0">ID_NK :</p>
						<select name="id_NK" id="" class="w-100  form-control">
							<c:forEach items="${list}" var="list">
								<option value="${list.id_NK}">${list.id_NK}</option>
							</c:forEach>
						</select>
					</div>

					<div class="col-md-12">

						<p class="mb-0">ID_TDP :</p>
						<select name="id_ToDanPho" id="" class="w-100  form-control">
							<c:forEach items="${listt}" var="list">
								<option value="${list.id_ToDanPho}">${list.id_ToDanPho}</option>
							</c:forEach>
						</select>
					</div>

				</div>
				<input type="submit" style="cursor: pointer;"
					class="btn btn-primary btn-block mx-3" value="Add">
			</s:form>
		</div>
	</div>
	<br>
	<%-- <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
	<script src="<c:url value='/resources/js/checkForm.js'/>"></script> --%>
</body>
</html>
