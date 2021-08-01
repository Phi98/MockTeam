<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!--HEADER-->
<header id="header" class="py-2">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-7 header-left pt-2 text-md-left text-center">
				<i class="fa fa-phone"></i> <span class="mr-3">(+84.236)
					3.893.777</span> <i class="fa fa-envelope-o"></i> <span>toasoan@hoahainhs.gov.vn</span>
			</div>
			<div
				class="col-md-5 header-right text-right text-md-right text-center mt-md-0 mt-2">
				<i class="fa fa-facebook"></i> <i class="fa fa-youtube"></i>
			</div>
		</div>
	</div>
</header>
<!--NAVBAR-->
<nav class="navbar navbar-expand-md navbar-light">
	<div class="container ">
		<a class="navbar-brand navbar-brand--logo text-center"
			href="mainhome">
			<h1 class="mb-0 ">
				<li class="fa fa-globe"></li> HÒA HẢI
			</h1>
			<p>Tra cứu & thông báo & dịch vụ</p>
		</a>
		<button class="navbar-toggler buttonMenu" data-toggle="collapse"
			data-target="#myMenu">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="myMenu">
			<ul class="navbar-nav ml-auto navbar-nav--menu " id="mainNav">
				<li class="nav-item"><a class="nav-link" href="mainhome">TRANG
						CHỦ</a>
					<div class="nav-item__line"></div></li>
			<c:if test="${sohokhau!=null }" ><li class="nav-item"><a class="nav-link" href="tintuc?id=${sohokhau}">TIN TỨC</a>  </c:if>	
					<div class="nav-item__line"></div></li>
				<li class="nav-item"><a class="nav-link" href="thudientu">THƯ
						ĐIỆN TỬ</a>
					<div class="nav-item__line"></div></li>
				<li class="nav-item "><a class="nav-link" data-toggle="modal"
					data-target="#modal-carousel" href="#">TRA CỨU <i class="fa fa-search"></i> </a>
					<div class="nav-item__line"></div></li>
					
					
		<!-- 		<li class="nav-item "><a class="nav-link" href="#">LỊCH
						CÔNG TÁ </a> -->
					<div class="nav-item__line"></div></li>
					<c:choose>
	<c:when test="${shke==null && tte==null}">
	<li class="nav-item "><a class="nav-link" href="totruong"> <i class="fa fa-user"></i> LOGIN CÁN BỘ </a>
	</c:when>
<c:when test="${shke!=null}">
	<li class="nav-item "><a class="nav-link" href="thoat">Thoát</a>
	<div class="nav-item__line"></div></li>
	
	</c:when>
	</c:choose>
		
	<li class="nav-item "><a class="nav-link"  onclick="history.go(-1)"; style="cursor: pointer;" >Quay lại </a>
					<div class="nav-item__line"></div></li>
			</ul>
		</div>
	</div>
</nav>

<!-- MODAL POPUP -->
<c:choose>
	<c:when test="${hello!='sai'}">
		<div class="modal fade " id="modal-carousel">
	</c:when>
	<c:when test="${hello=='sai'}">
		<div class="modal fade show " id="modal-carousel"
			style="display: block">
	</c:when>
</c:choose>

<div class="modal-dialog">
	<div class="modal-content modal-header--carousel">
		<div class="modal-header ">
			<h1>TRA CỨU THÔNG TIN</h1>
			<button class="close" data-dismiss="modal">&times;</button>
		</div>
		<div class="modal-body">

			<s:form method="post" commandName="shk" action="login">
				<div class="form-group">
					<label for="SHK">SỐ SỔ HỘ KHẨU</label> <input type="text"
						name="shk" class="form-control " id="SHK" required="">

				</div>
				<div class="form-group">
					<label for="cmndch">CMND CHỦ HỘ</label> <input type="text"
						class="form-control" name="soCMND" id="cmndch">

					<c:if test="${hello=='sai'}">
						<div class="invalid-feedback" style="display: block">
							Số sổ hộ khẩu không tồn tại
							<!-- báo lỗi cho người dùng khi dữ liệu khi invalid -->
						</div>
						<div class="invalid-feedback" style="display: block">
							CMND không tồn tại
							<!-- báo lỗi cho người dùng khi dữ liệu khi invalid -->
						</div>
					</c:if>
					<br>
				</div>
				<div class="modal-footer">
					<input value="Tra Cứu Thông Tin" type="submit"
						class="btn btn-primary btn-block" />
					<button data-dismiss="modal" class="btn btn-secondary">Thoát</button>
				</div>
				<!-- nếu check form thành công thêm class là is-valid để báo thành công ,nếu check form sai thêm class is-invalid vào để show ra lỗi -->
			</s:form>
		</div>
	</div>
</div>
</div>



<!-- CAROUSEL -->