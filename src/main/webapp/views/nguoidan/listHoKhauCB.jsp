<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>GOV HÒA HẢI</title>
<!-- LOGO TITLE -->
<link href="<c:url value='/resources/images/logo.png' />" rel="stylesheet" type="text/css" media="all"/>
<!-- BOOTSTRAP 4 -->
<link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet" type="text/css" media="all"/>

<!-- FONTAWESOME -->
<link href="<c:url value='/resources/css/font-awesome.css' />" rel="stylesheet" type="text/css" media="all"/>
<!-- OWL CAROUSEL -->
<link href="<c:url value='/resources/css/owl.carousel.css' />" rel="stylesheet" type="text/css" media="all"/>
<link href="<c:url value='/resources/css/owl.theme.default.css' />" rel="stylesheet" type="text/css" media="all"/>
    <!-- MAIN CSS -->
<link href="<c:url value='/resources/css/index_admin.css' />" rel="stylesheet" type="text/css" media="all"/>


</head>

<body>

   <%@include file="/includes/canbo/header.jsp"%>
   
     <!-- QUẢN LÍ HỘ KHẨU -->
    <div class="container-fluid qlhk px-xl-5 ">
        <div class="row mt-5">
            <div class="col text-center text_title">
                <h1>HỘ KHẨU TỔ : <span>${tdp.id_todanpho}</span> </h1> 
                <div class="row">
                    <class class="col-8 m-auto">
                        <form class="form-inline search">
                            <input class="form-control mr-2  " placeholder="Tìm Kiếm">
                            <a href="#" class="btn btn-primary" type="submit"> <i class="fa fa-search"></i></a>
                        </form>
                    </class>
                </div>
               

            </div>
        </div>
        <div class="row QLHK_title mt-5">
            <div class="col-lg-1">STT:</div>
            <div class="col-lg-1">HỘ KHẨU:</div>
            <div class="col-lg-2">TÊN CHỦ HỘ:</div>
            <div class="col-lg-4">ĐỊA CHỈ:</div>
            <div class="col-lg-1">SỐ NGƯỜI:</div>
            <div class="col-lg-1">SỬA,XÓA:</div>
            <div class="col-lg-2">CHI TIẾT:</div>
            
        </div>
        <div class="QLHK_detail">
            <div class="row py-1 mb-1 ">
                <div class="col-lg-1"><input type="text" value="1" class="stt form-control"></div>
                <div class="col-lg-1"><input type="text" value="13572468" class="hk_number form-control"></div>
                <div class="col-lg-2"><input type="text" value="LÊ VĂN TRỢ" class="name_ch form-control"></div>
                <div class="col-lg-4">
                    <input type="text" value="35 NAM KÌ KHỞI NGHĨA,PHƯỜNG HÒA HẢI,QUẬN NGŨ HÀNH SƠN"
                        class="address form-control">
                </div>
                <div class="col-lg-1"><input type="text" value="5" class="number_people form-control"></div>
                <div class="col-lg-1">
                    <a href="" class="btn btn-primary btn-block edit" type="submit">SỬA</a>
                    <a href="" class="btn btn-primary btn-block delete mb-2" type="submit">XÓA</a>
                </div>

                <div class="col-lg-2"> <a href="hokhau_detail_admin.html" class="btn btn-primary btn-block detail">CHI TIẾT</a></div>
            </div>
            <div class="row py-1 mb-1 ">
                <div class="col-lg-1"><input type="text" value="2" class="stt form-control"></div>
                <div class="col-lg-1"><input type="text" value="13572468" class="hk_number form-control"></div>
                <div class="col-lg-2"><input type="text" value="LÊ VĂN TRỢ" class="name_ch form-control"></div>
                <div class="col-lg-4">
                    <input type="text" value="35 NAM KÌ KHỞI NGHĨA,PHƯỜNG HÒA HẢI,QUẬN NGŨ HÀNH SƠN"
                        class="address form-control">
                </div>
                <div class="col-lg-1"><input type="text" value="5" class="number_people form-control"></div>
                <div class="col-lg-1">
                    <a href="" class="btn btn-primary btn-block edit" type="submit">SỬA</a>
                    <a href="" class="btn btn-primary btn-block delete mb-2" type="submit">XÓA</a>
                </div>

                <div class="col-lg-2"> <a href="hokhau_detail_admin.html" class="btn btn-primary btn-block detail">CHI TIẾT</a></div>
            </div>
            <div class="row py-1 mb-1 ">
                <div class="col-lg-1"><input type="text" value="3" class="stt form-control"></div>
                <div class="col-lg-1"><input type="text" value="13572468" class="hk_number form-control"></div>
                <div class="col-lg-2"><input type="text" value="LÊ VĂN TRỢ" class="name_ch form-control"></div>
                <div class="col-lg-4">
                    <input type="text" value="35 NAM KÌ KHỞI NGHĨA,PHƯỜNG HÒA HẢI,QUẬN NGŨ HÀNH SƠN"
                        class="address form-control">
                </div>
                <div class="col-lg-1"><input type="text" value="5" class="number_people form-control"></div>
                <div class="col-lg-1">
                    <a href="" class="btn btn-primary btn-block edit" type="submit">SỬA</a>
                    <a href="" class="btn btn-primary btn-block delete mb-2" type="submit">XÓA</a>
                </div>

                <div class="col-lg-2"> <a href="hokhau_detail_admin.html" class="btn btn-primary btn-block detail">CHI TIẾT</a></div>
            </div>
            <div class="row py-1 mb-1 ">
                <div class="col-lg-1"><input type="text" value="4" class="stt form-control"></div>
                <div class="col-lg-1"><input type="text" value="13572468" class="hk_number form-control"></div>
                <div class="col-lg-2"><input type="text" value="LÊ VĂN TRỢ" class="name_ch form-control"></div>
                <div class="col-lg-4">
                    <input type="text" value="35 NAM KÌ KHỞI NGHĨA,PHƯỜNG HÒA HẢI,QUẬN NGŨ HÀNH SƠN"
                        class="address form-control">
                </div>
                <div class="col-lg-1"><input type="text" value="5" class="number_people form-control"></div>
                <div class="col-lg-1">
                    <a href="" class="btn btn-primary btn-block edit" type="submit">SỬA</a>
                    <a href="" class="btn btn-primary btn-block delete mb-2" type="submit">XÓA</a>
                </div>

                <div class="col-lg-2"> <a href="hokhau_detail_admin.html" class="btn btn-primary btn-block detail">CHI TIẾT</a></div>
            </div>
            <nav>
                <ul class="pagination">
                    <li class="page-item disabled"><a href="" class="page-link">Trước</a></li>
                    <li class="page-item active"><a href="" class="page-link">1</a></li>
                    <li class="page-item"><a href="" class="page-link">2</a></li>
                    <li class="page-item"><a href="" class="page-link">3</a></li>
                    <li class="page-item"><a href="" class="page-link">Trang sau</a></li>
                </ul>
        </nav>
        
        </div>
        <div class="text_title">
            <h1 class="text-center">THÊM HỘ KHẨU</h1>
        </div>
        <div class="row QLHK_title mt-5">
            <div class="col-lg-2">SỐ HỘ KHẨU:</div>
            <div class="col-lg-2">TÊN CHỦ HỘ:</div>
            <div class="col-lg-4">ĐỊA CHỈ:</div>
            <div class="col-lg-1">SỐ NGƯỜI:</div>
            <div class="col-lg-3">THÊM HỘ KHẨU</div>
            
        </div>
        <div class="QLHK_detail">
            <div class="row py-1 mb-5 ">
               
                <div class="col-lg-2"><input type="text" class="hk_number form-control"></div>
                <div class="col-lg-2"><input type="text"  class="name_ch form-control"></div>
                <div class="col-lg-4">
                    <input type="text" 
                        class="address form-control">
                </div>
                <div class="col-lg-1"><input type="text"  class="number_people form-control"></div>
                

                <div class="col-lg-3"> <a href="" class="btn btn-primary btn-block detail">THÊM</a></div>
            </div>
         </div>
        
      
    </div>


    </div>

    <!-- ---------------------------THƯ VIỆN JQUERY & JAVASCRIPT----------------------------- -->
     <!-- THƯ VIỆN JQUERY -->
        <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
        <!-- THƯ VIỆN POPUP -->
        <script src="<c:url value='/resources/js/popper.min.js'/>"></script>
        <!-- THƯ VIỆN OWL CAROUSEL -->
        <script src="<c:url value='/resources/js/owl.carousel.min.js'/>"></script>
        <!-- THƯ VIỆN BOOTSTRAP JS -->
        <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
        <!-- THƯ VIỆN WAYPOINTS JQUERY -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>
        <script src="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js'/>"></script>
        <!-- THƯ VIỆN ĐẾM SỐ -->
        <script src="<c:url value='/resources/js/jquery.countup.js'/>"></script>
</body>

</html>