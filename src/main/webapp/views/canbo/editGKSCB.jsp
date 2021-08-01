
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
<link href="<c:url value='/resources/css/index_admin.css' />"
	rel="stylesheet" type="text/css" media="all" />

</head>
<body>

	<%@include file="/includes/canbo/header.jsp"%>


	<div class="container khaisinh">

		<div class="khaisinh__content">

			<s:form class="form-body" action="addGKSCB" commandName="nke"
				modelAttribute="nke">

				<div class="col-md-6">
					<p>ID:</p>
					<div class="form-group">
						<input type="text" class="form-control" name="id_NK"
							value="${nke.id_NK}" readonly="readonly" />
					</div>
				</div>
				<a href="viewCMND?id=${nke.soCMND.soCMND}" style="cursor: pointer;"
					class="btn btn-primary btn-block mx-3"> XemCMND </a>
				<a href="viewGKS?id=${nke.soGKS.soGKS}" style="cursor: pointer;"
					class="btn btn-primary btn-block mx-3"> XemGKS </a>

				<div class="row">
					<div class="col">
						<img src="<c:url value="/resources/images/${nke.anh}"></c:url>"
							class="img-fluid img_profile" alt="">
					</div>
				</div>

				<div class="col-md-6">
					<p>
						trinhDoVanHoa:<input name="trinhDoVanHoa" type="text"
							value="${nke.trinhDoVanHoa}" class="w-100 form-control">
					</p>
				</div>
				<div class="col-md-6">
					<p>
						ngheNghiep:<input name="ngheNghiep" type="text"
							value="${nke.ngheNghiep}" class="w-100 form-control">
					</p>
				</div>
				<div class="col-md-6">
					<p>
						noiLamViec:<input name="noiLamViec" type="text"
							value="${nke.noiLamViec}" class="w-100 form-control">
					</p>
				</div>




				<div class="col-md-12">

					<input type="submit" style="cursor: pointer;"
						class="btn btn-primary btn-block mx-3" value="Xác Nhận" />
					<a href="deleteGKSCB?id_nk=${nke.id_NK}" style="cursor: pointer;"
						class="btn btn-primary btn-block mx-3"> Xóa </a>
				</div>

			</s:form>
		</div>
	</div>
	<%@include file="/includes/canbo/footer.jsp"%>
</body>
</html>