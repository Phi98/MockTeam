
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

			<s:form class="form-body" action="addSTVCB" commandName="stv"
				modelAttribute="stv">

				<div class="col-md-6">
					<p>ID:</p>
					<div class="form-group">
						<input type="text" class="form-control" name="id_GiayTamVang"
							value="${list.id_GiayTamVang}" readonly="readonly" />
					</div>
				</div>




								
				<div class="col-md-6">
					<p>ID Nhân Khẩu:</p>
					<div class="form-group">
						<input type="text" class="form-control" name="id_nk"
							value="${list.id_nk.id_NK}" readonly="readonly" />
					</div>
				</div>
				
			
			
				<div class="col-md-12">
					Lí Do:<input type="text" name="noiDi"
						value="${list.noiDi}" class="w-100 form-control">
					</p>
				</div>
				<div class="col-md-6">
					<p>
						Tên người làm giấy<input name="lyDo" type="text"
							value="${list.lyDo}" class="w-100 form-control">
					</p>
				</div>
	
				
					
					<div class="col-md-6">
					<p>
						Ngày Tày Vắng:<input name="ngayTamVang" type="date"
							value="${list.ngayTamVang}" class="w-100 form-control">
					</p>
				</div>
				
			
				
				
				<div class="col-md-12">

						<input type="submit" style="cursor: pointer;"
							class="btn btn-primary btn-block mx-3" value="Xác Nhận">
		
						<a href="deleteSTVCB?id_GiayTamVang=${list.id_GiayTamVang}" style="cursor: pointer;"
							class="btn btn-primary btn-block mx-3"> Xóa </a>
				</div>
				
				
							
				
				
			</s:form>
		</div>
	</div>
	<%@include file="/includes/canbo/footer.jsp"%>
</body>
</html>