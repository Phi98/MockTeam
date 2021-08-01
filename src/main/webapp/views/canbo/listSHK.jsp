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

	<div class="container qlhk  ">
		<div class="row mt-3 p-0">
			<div class="col text-center text_title">
				
				<s:form method="post" commandName="searchSHK" action="searchSHK">
					<div class="row justify-content-center">
						
						<div class="col-sm-6 ">
							 <div class="col text-center text_title">
         					   <h1> HỘ KHẨU TỔ: </h1>
           							 <input type="text" value="${to}"
									class="form-control text-center" name="to" id=""
									readonly="readonly">
        					 </div>
						</div>
						
					</div>

					<div class="row border mt-5 bg-info text-white font-weight-bold">
						<div class="col-sm-6 ">
							<div class="form-group">
								<label for="to"> Địa chỉ: </label> <input type="text"
									class="form-control " name="diaChi" id="">
							</div>
						</div>
						<div class="col-sm-3">
							<div class="form-group">
								<label for="to"> Số hộ khẩu: </label> <input type="text"
									class="form-control " name="id_SHK" id="">
							</div>
						</div>
						  <div class="col-sm-3 align-self-end mb-2"> 
						  <input class="btn btn-success btn-block " style="cursor: pointer;" type="submit"
						value="Tìm Kiếm">
						  </div>
					</div>
					
				</s:form>
				

		


		</div>
		</div>
			<table class="table table-light  mt-5 p-3 border ">
		<thead>
			<tr>
				<th>SỐ HỘ KHẨU</th>
				<th>ĐỊA CHỈ</th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="shk">
				<tr>
					<td>${shk.id_SHK}</td>

					<td>${shk.diaChi}</td>
					<td><a href="viewNKSHK?id=${shk.id_SHK}"
						class="btn btn-primary btn-block">View</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
			
					<a href="addSHKNK" class="btn btn-primary btn-block">THÊM SỔ HỘ KHẨU</a>
			
	</div>
<%@include file="/includes/footer.jsp"%>


</body>
</html>

