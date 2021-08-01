<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!--NAVBAR-->
    <nav class="navbar navbar-expand-md navbar-light m-auto" >
        <div class="container">
            <button class="navbar-toggler buttonMenu" data-toggle="collapse" data-target="#myMenu">
            <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse " id="myMenu">
                <ul class="navbar-nav ml-auto navbar-nav--menu">
                    <li class="nav-item ">
                        <a class="nav-link" href="listSHK?id=${to}">QUẢN LÍ HỘ KHẨU</a>
                        <div class="nav-item__line"></div>
                    </li>
                    <li class="nav-item ">
                        <a class="nav-link" href="listNK?id=${to}">QUẢN LÍ NHÂN KHẨU</a>
                        <div class="nav-item__line"></div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">THỐNG KÊ</a>
                        <div class="nav-item__line"></div>
                    </li>
                    
                    <li class="nav-item">
                     <a class="nav-link" data-toggle="dropdown" id="dropdownMenuButton" aria-haspopup="true" aria-expanded="false" >ĐƠN TIẾP NHẬN</a>
                    
                    <div class="dropdown">

  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="listQTHTCB?id=${to}">Quá Trình Học Tập</a>
    <a class="dropdown-item" href="listGBTCB?id=${to}">Giấy Báo Tử</a>
    <a class="dropdown-item" href="listSTVCB?id=${to}">Giấy Tạm Vắng</a>
    <a class="dropdown-item" href="listGKSCB?id=${to}">Nhân Khẩu</a>
    <a class="dropdown-item" href="listSTTCB?id=${to}">Giấy Tạm Trú</a>
  </div>
</div>
                    
                    
                       
                        <div class="nav-item__line"></div>
                    </li>
          <!--           <li class="nav-item">
                        <a class="nav-link" href="thudientu.html">THÔNG BÁO</a>
                        <div class="nav-item__line"></div>
                    </li> -->
                 <%--    <li class="nav-item">
                     <a class="nav-link" data-toggle="dropdown" id="dropdownMenuButton" aria-haspopup="true" aria-expanded="false" >THÊM MỚI</a>
                    
                    <div class="dropdown">

  <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
    <a class="dropdown-item" href="addCMND">CMND</a>
    <a class="dropdown-item" href="addNKTT">Nhân Khẩu</a>
    <a class="dropdown-item" href="listSTVCB?id=${to}">Hộ Khẩu</a>
    <a class="dropdown-item" href="listGKSCB?id=${to}">Giấy Khai Sinh</a>
  </div>
</div>
                    
                    
                       
                        <div class="nav-item__line"></div>
                    </li> --%>
                    <li class="nav-item">
                        <a class="nav-link" href="addTinTuc?id=${tte.username}">TIN TỨC</a>
                        <div class="nav-item__line"></div>
                    </li>
                   <c:choose>
                   <c:when test="${tte!=null}">
	<li class="nav-item "><a class="nav-link" href="thoatTT">Thoát</a>
		<li class="nav-item "><a class="nav-link" href="view?id=${tte.id_NK.id_NK}">View</a>
	</c:when>
	</c:choose>
	<li class="nav-item "><a class="nav-link" onclick="history.go(-1);" >Quay lại </a>
                </ul>
            </div>
        </div>
    </nav>