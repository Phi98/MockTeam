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
	<link href="<c:url value='/resources/css/viewNK.css' />" rel="stylesheet"
	type="text/css" media="all" />
</head>
<body>

	<%@include file="/includes/canbo/header.jsp"%>

	<!-- THÔNG TIN NHÂN KHẨU -->
        <div class="container ttnk mt-5">
            <div class="row ">
                <div class="col nhankhau__title text-center">
                    <h1>THÔNG TIN CHUNG</h1>
                </div>
            </div>
          
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12  col-sm-3">
                    <div class="img__personal">
                        <img src="./images/t3.jpg" class="w-100 h-100" alt="">
                    </div>
                    <form action="" >
                        <p>Đổi ảnh đại diện:</p>
                        <input type="file" class=" mb-2" id="myFile" name="filename2">
                      </form>
                </div>
                <div class=" col-12 col-sm-9">
                    <div class="row mb-3">
                        <div class="col-lg-3 col-sm-6">
                            <p>SỐ HỘ KHẨU:</p>
                            <input type="text" class="form-control" value="13572468">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>HỌ TÊN:</p>
                            <input type="text" class="form-control" value="LÊ VĂN TRỢ">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>NGÀY SINH:</p>
                            <input type="text" class="form-control" value="26/02/1999">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>GIỚI TÍNH:</p>
                            <input type="text" class="form-control" value="NAM">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col-lg-3 col-sm-6">
                            <p>DÂN TỘC:</p>
                            <input type="text" class="form-control" value="KINH">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>TÔN GIÁO:</p>
                            <input type="text" class="form-control" value="CAO ĐÀI">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>QUỐC TỊCH:</p>
                            <input type="text" class="form-control" value="VIỆT NAM">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>QUAN HỆ CHỦ HỘ:</p>
                            <input type="text" class="form-control" value="CON">
                        </div>
                    </div>
                  
                    <div class="row mb-3">
                        <div class="col-lg-3 col-sm-6">
                            <p> HỌC VẤN:</p>
                            <input type="text" class="form-control" value="ĐẠI HỌC">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>CHUYÊN MÔN:</p>
                            <input type="text" class="form-control" value="CNTT">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>NGHỀ NGHIỆP :</p>
                            <input type="text" class="form-control" value="LẬP TRÌNH">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>NƠI LÀM VIỆC</p>
                            <input type="text" class="form-control" value="DH FPT ĐÀ NẴNG">
                        </div>
                    </div>
                    <div class="row mb-3">
                        <div class="col-lg-3 col-sm-6">
                            <p>SỐ HỘ CHIẾU</p>
                            <input type="text" class="form-control" value="13572467">
                        </div>
                        <div class="col-lg-3 col-sm-6">
                            <p>CMND:</p>
                            <input type="text" class="form-control" value="206067782">
                        </div>
                       <div class="col-lg-6">
                        <a href="view__infoID.html" class="btn btn-primary btn-block view_cmnd  ">Xem CMND</a>
                       </div>
                       
                    </div>
                 
                </div>
            </div>
            <div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>NƠI SINH</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-lg-2 col-sm-4">
                            <p>QUỐC GIA:</p>
                            <input type="text" class="form-control" value="VIỆT NAM">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>TỈNH/TP:</p>
                            <input type="text" class="form-control" value="QUẢNG NAM">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>QUẬN/HUYỆN:</p>
                            <input type="text" class="form-control" value="PHÚ NINH">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>PHƯỜNG/XÃ:</p>
                            <input type="text" class="form-control" value="TAM LỘC">
                        </div>
                        <div class="col-lg-4 col-sm-8">
                            <p>ĐỊA CHỈ:</p>
                            <input type="text" class="form-control" value="ĐỘI 10 , THÔN ĐẠI QUÝ">
                        </div>
                    </div>
                </div>
            </div>
            <div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>QUÊ QUÁN</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-lg-2 col-sm-4">
                            <p>QUỐC GIA:</p>
                            <input type="text" class="form-control" value="VIỆT NAM">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>TỈNH/TP:</p>
                            <input type="text" class="form-control" value="QUẢNG NAM">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>QUẬN/HUYỆN:</p>
                            <input type="text" class="form-control" value="PHÚ NINH">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>PHƯỜNG/XÃ:</p>
                            <input type="text" class="form-control" value="TAM LỘC">
                        </div>
                        <div class="col-lg-4 col-sm-8">
                            <p>ĐỊA CHỈ:</p>
                            <input type="text" class="form-control" value="ĐỘI 10,THÔN ĐẠI QUÝ">
                        </div>
                    </div>
                </div>
            </div>
Trợ
<div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>NƠI THƯỜNG TRÚ</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-lg-2 col-sm-4">
                            <p>QUỐC GIA:</p>
                            <input type="text" class="form-control" value="VIỆT NAM">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>TỈNH/TP:</p>
                            <input type="text" class="form-control" value="QUẢNG NAM">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>QUẬN/HUYỆN:</p>
                            <input type="text" class="form-control" value="PHÚ NINH">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>PHƯỜNG/XÃ:</p>
                            <input type="text" class="form-control" value="TAM LỘC">
                        </div>
                        <div class="col-lg-4 col-sm-8">
                            <p>ĐỊA CHỈ:</p>
                            <input type="text" class="form-control" value="ĐỘI 10,THÔN ĐẠI QUÝ">
                        </div>
                    </div>
                </div>
            </div>
            <div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>CHỔ Ở HIỆN TẠI</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-lg-2 col-sm-4">
                            <p>QUỐC GIA:</p>
                            <input type="text" class="form-control" value="VIỆT NAM">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>TỈNH/TP:</p>
                            <input type="text" class="form-control" value="ĐÀ NẴNG">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>QUẬN/HUYỆN:</p>
                            <input type="text" class="form-control" value="NGŨ HÀNH SƠN">
                        </div>
                        <div class="col-lg-2 col-sm-4">
                            <p>PHƯỜNG/XÃ:</p>
                            <input type="text" class="form-control" value="HÒA HẢI">
                        </div>
                        <div class="col-lg-4 col-sm-8">
                            <p>ĐỊA CHỈ:</p>
                            <input type="text" class="form-control" value="200 MAI ĐĂNG CHƠN">
                        </div>
                    </div>
                </div>
            </div>
            <div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>QUÁ TRÌNH HOẠT ĐỘNG</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3 ">
                            <p>THỜI GIAN:</p>
                        </div>
                        <div class="col-sm-3 ">
                            <p>LÀM GÌ:</p>
                        </div>
                        <div class="col-sm-4 ">
                            <p>Ở ĐÂU :</p>
                        </div>
                        <div class="col-sm-2 ">
                            <p> CHỨC VỤ:</p>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3 ">
                            <input type="text" class="form-control" value="18/7/2010-18/7/2014">
                            
                        </div>
                        <div class="col-sm-3 ">
                            <input type="text" class="form-control" value="Học THCS TAM LỘC">
                        </div>
                        <div class="col-sm-4 ">
                            <input type="text" class="form-control" value="Tam Lộc,Phú Ninh,Quảng Nam">
                        </div>
                        <div class="col-sm-2 ">
                            <input type="text" class="form-control" value="Học Sinh">
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3 ">
                            <input type="text" class="form-control" value="18/7/2010-18/7/2014">
                            
                        </div>
                        <div class="col-sm-3 ">
                            <input type="text" class="form-control" value="Học THCS TAM LỘC">
                        </div>
                        <div class="col-sm-4 ">
                            <input type="text" class="form-control" value="Tam Lộc,Phú Ninh,Quảng Nam">
                        </div>
                        <div class="col-sm-2 ">
                            <input type="text" class="form-control" value="Học Sinh">
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3 ">
                            <input type="text" class="form-control" value="18/7/2010-18/7/2014">
                            
                        </div>
                        <div class="col-sm-3 ">
                            <input type="text" class="form-control" value="Học THCS TAM LỘC">
                        </div>
                        <div class="col-sm-4 ">
                            <input type="text" class="form-control" value="Tam Lộc,Phú Ninh,Quảng Nam">
                        </div>
                        <div class="col-sm-2 ">
                            <input type="text" class="form-control" value="Học Sinh">
                        </div>
                    </div>
                </div>
              
            </div>
            <div class="row ">
                <div class="col nhankhau__title text-center mt-2">
                    <h1>LỊCH SỬ TẠM TRÚ</h1>
                </div>
            </div>
            <div class="row border ttc pt-2 my-2" >
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <p>THỜI GIAN:</p>
                        </div>
                        <div class="col-sm-3">
                            <p>TỈNH/TP:</p>
                        </div>
                        <div class="col-sm-6">
                            <p>ĐỊA CHỈ:</p>
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <input type="text" class="form-control" value="10/10/2018 - 10/10/2019">
                        </div>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" value="ĐÀ NẴNG">
                        </div>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" value="87 HOÀNG VĂN THÁI,HÒA KHÁNH NAM,LIÊN CHIỂU">
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <input type="text" class="form-control" value="10/10/2018 - 10/10/2019">
                        </div>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" value="ĐÀ NẴNG">
                        </div>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" value="87 HOÀNG VĂN THÁI,HÒA KHÁNH NAM,LIÊN CHIỂU">
                        </div>
                    </div>
                </div>
                <div class="col-12">
                    <div class="row mb-3">
                        <div class="col-sm-3">
                            <input type="text" class="form-control" value="10/10/2018 - 10/10/2019">
                        </div>
                        <div class="col-sm-3">
                            <input type="text" class="form-control" value="ĐÀ NẴNG">
                        </div>
                        <div class="col-sm-6">
                            <input type="text" class="form-control" value="87 HOÀNG VĂN THÁI,HÒA KHÁNH NAM,LIÊN CHIỂU">
                        </div>
                    </div>
                </div>
               
               
            </div>
            
            <a href="" class="btn btn-primary btn-block mb-5">Hoàn Tất Sửa Đổi</a>
        </div>



	<%@include file="/includes/canbo/footer.jsp"%>

</body>
</html>

