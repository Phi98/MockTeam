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
	<!-- XEM CMND -->
	<div class="container">
		<div>
			<div class="view_cmnd_detail mb-2">
				<div class="row">
					<div class="col-3">
						<div class="row mb-3">
							<div class="col ">
								<img
									src="<c:url value="/resources/images/quochuy1.png" ></c:url>"
									class="img-fluid star" alt="">
							</div>
						</div>
						<div class="row">
							<div class="col">
								<img
									src="<c:url value="/resources/images/${cmnde.anh}"></c:url>"
									class="img-fluid img_profile" alt="">
							</div>
						</div>
					</div>

					<div class="col-9 text-center cmnd_text_title">
						<h4>CỘNG HÒA XÃ HỘI CHỦ NGHĨA VIỆT NAM</h4>
						<h5>
							<u>Độc Lập-Tự Do-Hạnh Phúc</u>
						</h5>
						<h2>GIẤY CHỨNG MINH NHÂN DÂN</h2>
						<p class="text_number">Số CMND: ${cmnde.soCMND}</p>
						<div class="cmnd_text_detail text-left">
							<p>
								Họ Tên: <span>${cmnde.tenCMND}</span>
							</p>
							<p>
								Sinh Ngày: <span>${cmnde.soGKS.ngaySinh}</span>
							</p>
							<p>
								Nguyên Quán: <span>${cmnde.soGKS.queQuan}</span>
							</p>
							<p>
								Nơi DKHK thường trú: <span>${shke.diaChi}, Tổ
									${shke.id_ToDanPho.id_ToDanPho}, Phường
									${shke.id_ToDanPho.phuong}</span>
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="view_cmnd_detail mt-2 matsau">
				<div class="row border border-dark">
					<div class="col">
						<p class="pt-3">
							Dân tộc: <b>${cmnde.danToc}</b> ; Tôn giáo: <b>${cmnde.tonGiao}</b>
						</p>
					</div>
				</div>

				<div class="row">
					<div class="col-4">
						<div class="row border border-dark mt-4">
							<div class="col-10 vantay1 ">
								<img src="<c:url value="/resources/images/vantay.jpg"></c:url>"
									alt="">
							</div>
							<div class="col-2 p-0">
								<div class="outer ">
									<div class="inner rotate">Trỏ Trái</div>
								</div>
							</div>
						</div>
						<div class="row border border-dark mt-5">
							<div class="col-10 vantay1">
								<img src="<c:url value="/resources/images/vantay.jpg"></c:url>"
									alt="">
							</div>
							<div class="col-2 p-0">
								<div class="outer">
									<div class="inner rotate">Trỏ Phải</div>
								</div>
							</div>
						</div>

					</div>
					<div class="col-8 text-center">
						<div class="row  ml-5 border border-dark p-2 pb-5"
							style="display: block">
							<h5 class=" pb-3">
								<b>Dấu vết riêng và dị hình</b>
							</h5>
							<p class=" pb-3">${cmnde.note}</p>
						</div>
						<div class="row  ml-5 border border-dark p-2 pb-5 ">
							<h5 class="text-right pb-3">
								<b>Ngày Cấp: ${cmnde.ngayCapCMND}</b>
							</h5>
							<h5 class="text-center pb-3">
								<b> Giám đốc CA: ${cmnde.noiLamCMND}</b>
							</h5>
						</div>
					</div>
				</div>
			</div>

			
		</div>
	</div>
	<a href="editCMND?cmnd=${cmnde.soCMND}">EDIT CMND</a>
	<%@include file="/includes/canbo/footer.jsp"%>

</body>
</html>

