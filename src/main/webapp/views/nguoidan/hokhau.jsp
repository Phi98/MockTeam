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
<link href="<c:url value='/resources/css/guihosotiepnhan.css' />" rel="stylesheet"
	type="text/css" media="all" />
</head>
<body>

	<%@include file="/includes/header.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col text-center hokhau-title">
			             <%--     <a href="tintuc?id=${shke.id_SHK}">tin tuc</a> --%>
				<h1>
					Chi tiết hộ khẩu số: <span class="span__title">${shke.id_SHK}</span>
				</h1>
				<h1>
					Địa chỉ hộ khẩu : <span class="span__title">${shke.diaChi}</span>
				</h1>
				<div
					class="hokhau-title__line welcome-title__line mx-auto mt-3 mb-2 mb-sm-5"></div>
			</div>
		</div>
		<div class="row hokhau__table">
			<div class="col">
				<table class="table table-light mb-5 border">
					<thead>
						<tr>
							<th>Tên thành viên</th>
							<th>Quan hệ chủ hộ</th>
							<th>Ngày sinh</th>
							<th>Trạng thái</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${list}" var="nk">
							<tr>
								<td>${nk.soGKS.ten}</td>
								<td>${nk.quanHeVoiChuHo}</td>
								<td>${nk.soCMND.soGKS.ngaySinh}</td>
								<td>${nk.trangthai}</td>
								<td><a href="view?id=${nk.id_NK}"
									class="btn btn-primary btn-block">View</a></td>
								
								<c:if test="${nk.trangthai!='mất'}">	<td><a href="addGBT?id_nk=${nk.id_NK}"
									class="btn btn-primary btn-block">Báo tử</a></td></c:if>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<table class="table table-light mb-5 border">
				<div class="row">
			<div class="col text-center hokhau-title  ghstn-title">
				<h1>
					THÔNG TIN CÁ NHÂN TẠM TRÚ		</h1>
				
			</div>
		</div>
				
					<tbody>			
    <tr>
                <td>Tên</td>
                <td>số CMND</td>
                <td>Ngày đi</td>
                <td>ngày về</td>
                
            </tr>
        
    </tbody>
    <tbody>
        <c:forEach items="${list1}" var="stt">
            <tr>
                <td>${stt.soCMND.tenCMND}</td>
                <td>${stt.soCMND.soCMND}</td>
                <td>${stt.ngayDi}</td>
                <td>${stt.ngayVe}</td>
                
            </tr>
        </c:forEach>
    </tbody>
				</table>


			</div>
		</div>
	</div>
	 <!-- GỬI HỒ SƠ TIẾP NHẬN -->
    <div class="container ghslc mb-0">
        <div class="row">
            <div class="col text-center ghstn-title">
                <h1>GỬI HỒ SƠ TIẾP NHẬN </h1>
                <div class="ghstn-title__line welcome-title__line mx-auto mt-3 mb-2 mb-sm-2"></div>
                <span class="font-weight-bold">Vui lòng Click chọn hồ sơ:</span>
            </div>
        </div>
        <!-- GỬI HỒ SƠ TIẾP NHẬN BODY -->
        <div class="container offer-section">
            <div class="row text-center">
                <div class="col-12 col-sm-6 ">
                    <a href="addGKS?id_shk=${shke.id_SHK}">
                        <div class="offer-item">
                            <i class="fa fa-chevron-circle-up"></i>
                            <h3>Gửi tiếp nhận Nhân Khẩu mới</h3>
                        </div>
                    </a>
                </div>
                <div class="col-12 col-sm-6 ">
                    <a href="addCMTT?id=${shke.id_SHK}">
                        <div class="offer-item">
                            <i class="fa fa-chevron-circle-up"></i>
                            <h3>Gửi Tiếp Nhận người tạm trú mới</h3>
                        </div>
                    </a>
                </div>
            </div>
        </div>
    </div>
	<%@include file="/includes/footer.jsp"%>

</body>
</html>
