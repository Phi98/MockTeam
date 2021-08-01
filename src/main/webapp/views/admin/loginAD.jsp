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




	<div class="container">
		<div class="row mt-5 mb-5 justify-content-center">

			<div class="col-lg-8 ">
				<div class="modal-content ">
					<div class="modal-header align-self-center ">
						<h1>ĐĂNG NHẬP ADMIN</h1>
					</div>
					<div class="modal-body">
						<s:form method="post" action="loginAD">
 UserName:  <input name="userName" class="form-control" />
							<br>
 PassWord <input type="password" name="pw" class="form-control" />
 &nbsp;<input type="submit" value="ĐĂNG NHẬP"
								class="btn btn-primary btn-block mt-3">

						</s:form>

					</div>
				</div>
			</div>

		</div>
	</div>
	

</body>
</html>