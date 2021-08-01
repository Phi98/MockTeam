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

	<%@include file="/includes/canbo/header.jsp"%>
	<div class="container">
		<s:form class="form-body" action="editCMND" method="post"
			commandName="cmnd" modelAttribute="cmnd" accept-charset="UTF-8">

			<div class="row">
				<div class="col-6 col-md-6 mt-6">
					<label>Số CMND: </label>
					<div class="form-group">

						<input type="text" name="soCMND" value="${cmnd.soCMND}"
							class="form-control" id="title" placeholder=""
							readonly="readonly" />
					</div>
				</div>
				
				<div class="col-6 col-md-6 mt-6">
					<label>Ngày Cấp: </label>
					<div class="form-group">
						<input type="date" name="ngayCapCMND" class="form-control"
							id="title" value="${cmnd.ngayCapCMND}" />
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col-12 col-md-12">
					<label>Nơi Cấp</label>
					<div class="form-group">
						<div class="form-group">
							<input type="text" class="form-control" name="noiLamCMND"
								value="${cmnd.noiLamCMND}" />
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12 col-md-6">
					<label>Dân tộc</label>
					<div class="form-group">
						<input type="text" name="danToc" class="form-control" id="title"
							value="${cmnd.danToc}" />
					</div>
				</div>
				<div class="col-12 col-md-6">
					<label>Tôn Giáo</label>
					<div class="form-group">
						<input type="text" name="tonGiao" class="form-control" id="title"
							value="${cmnd.tonGiao}" />
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-12 col-md-12">
					<label>Note</label>
					<div class="form-group">
						<div class="form-group">
							<textarea class="form-control" name="note" id="content" rows="2">${cmnd.note}</textarea>
						</div>
					</div>
				</div>
			</div>

			<input type="submit" class="btn btn-success mb-3" value="EDIT CMND" />

		</s:form>
	</div>
	<%@include file="/includes/canbo/footer.jsp"%>
</body>
</html>

