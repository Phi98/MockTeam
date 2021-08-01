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
	<link href="<c:url value='/resources/css/thudientu.css' />" rel="stylesheet"
	type="text/css" media="all" />
</head>
<body>

	<%@include file="/includes/header.jsp"%>
<!-- --CONTACT US -->
 <section class="container contact-section">
    <div class="row">
        <div class="col contact-title text-center">
            <h1>HỆ THỐNG THƯ ĐIỆN TỬ</h1>
            <span>Mọi người dân đều có thể phản hồi ý kiến khách quan với chính quyền phường HÒA HẢI thông qua kênh thư điện tử</span>
            <div class="contact-title__line welcome-title__line mx-auto mt-3 mb-2 mb-sm-5"></div>
        </div>
    </div>
    <div class="row contact-content">
        <div class=" col-lg-5 ">
            <div class="contact-info ">
                <h3 class="text-white mb-4">Liên Hệ</h3>
                <div class="contact-info__detail d-flex">
                    <div class="contact-info__detail__item">
                        <i class="fa fa-volume-control-phone"></i>
                    </div>
                    <h4>Số điện thoại
                        <br>
                        <span>(+84.236) 3.893.777</span>
                    </h4>
                </div>
                <div class="contact-info__detail d-flex">
                    <div class="contact-info__detail__item">
                        <i class="fa fa-envelope-o"></i>
                    </div>
                    <h4>Mail
                        <br>
                        <span>toasoan@hoahainhs.gov.vn</span>
                    </h4>
                </div>
                <div class="contact-info__detail d-flex">
                    <div class="contact-info__detail__item">
                        <i class="fa fa-map-marker"></i>
                    </div>
                    <h4> Địa chỉ trực tiếp
                        <br>
                        <span>255 Ngũ Hành Sơn ,Hòa Hải,tp Đà Nẵng</span>
                    </h4>
                </div>
                <div class="contact-info__social">
                    <i class="fa fa-facebook contact-facebook"></i>
                    <i class="fa fa-youtube contact-twitter"></i>
                </div>
            </div>
        </div>
        <div class=" col-lg-7 contact-info__img">
        </div>
    </div>
    <div class="row contact-form mt-5">
        <div class="col-sm">
            <input class="form-control mb-3" type="text" name="Name" placeholder="Họ tên đầy đủ">
            <input class="form-control mb-3" type="email" name="Email" placeholder="Địa chỉ Email">
            <input class="form-control mb-3" type="tel" name="Phone"  pattern="[0-9]{10}" placeholder="Số điện thoại liên hệ">
            <input class="form-control mb-3" type="text" name="Subject" placeholder="Chủ đề phản hồi">
        </div>
        <div class="col-sm">
            <textarea rows="7" class="form-control" name="Message" placeholder="Nội dung"></textarea>
            <button class="btn btn-contact-submit btn-block ">Gửi</button>
        </div>
    </div>
</section>
<div class="section contact-map">
    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3834.490947386948!2d108.24003055048368!3d16.0399936444266!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31421760a07c0a2b%3A0x9d80bcc954cc72bc!2zMjU1IE5nxakgSMOgbmggU8ahbiwgQuG6r2MgTeG7uSBBbiwgTmfFqSBIw6BuaCBTxqFuLCDEkMOgIE7hurVuZywgVmnhu4d0IE5hbQ!5e0!3m2!1svi!2s!4v1598172202736!5m2!1svi!2s" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
</div>

	
	<%@include file="/includes/footer.jsp"%>

</body>
</html>