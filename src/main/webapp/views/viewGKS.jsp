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
<link href="<c:url value='/resources/css/index_admin.css' />" rel="stylesheet"
	type="text/css" media="all" />

</head>
<body>

	<%@include file="/includes/header.jsp"%>
	

                       
                            	<!-- THÔNG TIN NHÂN KHẨU -->
	<div class="container ttnk ">
		<div class="row ">
			<div class="col nhankhau__title text-center">
				<h1>THÔNG TIN KHAI SINH</h1>
			</div>
		</div>
		<div class="row border ttc pt-2 my-2">
		
			
			       
			<div class=" col-12  ">
				<div class="row mb-3">
					<div class="col-lg-3 col-sm-6">
						<p>HỌ VÀ TÊN:</p>
						<div class="border-item border">
							<span>${gks.ten}</span>
						</div>
					</div>
					<div class="col-lg-3 col-sm-6">
						<p>GIỚI TÍNH:</p>
						<div class="border-item border">
							<span>${gks.gioiTinh}</span>
						</div>
					</div>
					<div class="col-lg-3 col-sm-6">
						<p>NGÀY SINH: </p>
						<div class="border-item border">
							<span>${gks.ngaySinh}</span>
						</div>
					</div>
					<div class="col-lg-3 col-sm-6">
						<p>QUỐC TỊCH:</p>
						<div class="border-item border">
							<span>${gks.quocTich}</span>
						</div>
					</div>
				</div>
				
				
				
                              
                              
						
				<div class="row mb-3">
					<div class="col-lg-3 col-sm-6">
						<p>QUÊ QUÁN:</p>
						<div class="border-item border">
							<span>${gks.queQuan}</span>
						</div>
					</div>
					<div class="col-lg-3 col-sm-6">
						<p>NƠI SINH:</p>
						<div class="border-item border">
							<span>${gks.noiSinh}</span>
						</div>
					</div>
					<div class="col-lg-3 col-sm-6">
						<p> NGƯỜI ĐI KHAI SINH:</p>
						<div class="border-item border">
							<span>${gks.tenNguoiLamGiay}</span>
						</div>
					</div>
					
					<div class="col-lg-3 col-sm-6">
						<p>NƠI ĐĂNG KÍ KHAI SINH: </p>
						<div class="border-item border">
							<span>${gks.noiLamGKS}</span>
						</div>
					</div>
				</div>
				<div class="row mb-3">
					<div class="col-lg-3 col-sm-6">
						<p>NGÀY ĐĂNG KÍ: </p>
						<div class="border-item border">
							<span>${gks.ngayLamGKS}</span>
						</div>
					</div>
				
					
				</div>
			</div>
		</div>
	</div>
                            
                            
                            
                            
                        
                        
               
		<%@include file="/includes/footer.jsp"%>
</body>
</html>

