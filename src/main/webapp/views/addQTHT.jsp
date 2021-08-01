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


	<div class="container ttnk">

        
        <div class="row ">
        <div class="col nhankhau__title text-center">
            <h1>THÊM QUÁ TRÌNH HỌC TẬP</h1>
        </div>
    </div>
        <s:form class="form-body border p-3" action="addQTHT" commandName="qtht" modelAttribute="qtht">
            <div class="row justify-content-between">
                <div class="form-group">
                    <div class="_id pl-3 ">
                        <input type="text" class="form-control" name="id_nk" value=" ${id}" readonly="readonly" />
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-12">

                    Địa chỉ:<input type="text" name="diaChi" class="w-100 form-control" required>
                    </p>

                </div>
                <div class="col-md-4 col-12">
                    Trường:<input type="text" name="noiHocTap" class="w-100 form-control" required>
                    </p>
                </div>
                <div class="col-md-4 col-12">
                    <p>
                        Ngày bắt đầu:<input name="ngayBatDau" type="date" class="w-100 form-control" required>
                    </p>
                </div>
                <div class="col-md-4 col-12">
                    <p>
                        Ngày kết thúc:<input name="ngayKetThuc" type="date" class="w-100 form-control" required>
                    </p>
                </div>
            </div>

            <input type="submit" style="cursor: pointer;" class="btn btn-primary btn-block " value="GỬI TIẾP NHẬN">
        </s:form>
    
</div>
	<%@include file="/includes/footer.jsp"%>
</body>
</html>
