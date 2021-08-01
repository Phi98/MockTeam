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
	rel="shortcut icon" type="text/css" media="all" />
<link href="<c:url value='/resources/images/logo.png' />" rel="stylesheet" type="text/css" media="all"/>
<!-- BOOTSTRAP 4 -->
<link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet" type="text/css" media="all"/>

<!-- FONTAWESOME -->
<link href="<c:url value='/resources/css/font-awesome.css' />" rel="stylesheet" type="text/css" media="all"/>
<!-- OWL CAROUSEL -->
<link href="<c:url value='/resources/css/owl.carousel.css' />" rel="stylesheet" type="text/css" media="all"/>
<link href="<c:url value='/resources/css/owl.theme.default.css' />" rel="stylesheet" type="text/css" media="all"/>
<!-- MAIN CSS -->
<link href="<c:url value='/resources/css/index.css' />" rel="stylesheet" type="text/css" media="all"/>
</head>
<body>

	<%@include file="/includes/header.jsp"%>
	<div class="carousel slide" data-ride="carousel" id="carousel-slider">
		<!-- data-ride="carousel" hình tự động đổi không cần nhấn -->
		<!-- nút chuyển các slide bên dưới -->
		<ol class="carousel-indicators carousel-indicators--config">
			<li class="active" data-target="#carousel-slider" data-slide-to="0"></li>
			<li data-target="#carousel-slider" data-slide-to="1"></li>
			<li data-target="#carousel-slider" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="<c:url value="/resources/images/slide11.jpg"></c:url>" class=" w-100  ">
				<!-- caption trên từng slide -->
				<div class="carousel-caption carousel-caption--config">
					<h1>
						<b>ĐÀ NẴNG RA CHỈ THỊ PHÒNG CHỐNG DỊCH COVID 19</b>
					</h1>
					<p>Ngày 1/8, Chủ tịch UBND TP. Đà Nẵng Huỳnh Đức Thơ ban hành
						Chỉ thị yêu cầu các sở, ban, ngành, các tổ chức đoàn thể, UBND
						quận, huyện, phường, xã quyết liệt thực hiện các biện pháp phòng,
						chống dịch COVID-19 trong tình hình mới.</p>
					<a
						class="btn btn-outline-light py-1 px-2 py-sm-2 px-sm-4 btn--read-more "
						href="https://www.24h.com.vn"> <b> ĐỌC THÊM</b> <i
						class="fa fa-angle-double-right"></i>
					</a>
				</div>
			</div>
			<div class="carousel-item">
				<img src="<c:url value="/resources/images/binhdinh.jpg"></c:url>" class=" w-100">
				<!-- caption trên từng slide -->
				<div class="carousel-caption carousel-caption--config">
					<h1>
						<b>Đà Nẵng 'cầu viện' Hải Phòng, Bình Định hỗ trợ chống dịch</b>
					</h1>
					<p>Chủ tịch UBND TP Đà Nẵng Huỳnh Đức Thơ có văn bản gửi TP Hải
						Phòng và Bình Định mong nhận được sự hỗ trợ y bác sĩ cùng khống
						chế dịch COVID-19.</p>
					<a
						class="btn btn-outline-light py-1 px-2 py-sm-2 px-sm-4 btn--read-more"
						href="https://www.24h.com.vn/"> ĐỌC THÊM <i
						class="fa fa-angle-double-right"></i>
					</a>
				</div>
			</div>
			<div class="carousel-item">
				<img src="<c:url value="/resources/images/dnbg3.png"></c:url>" class="w-100">
				<!-- caption trên từng slide -->
				<div class="carousel-caption carousel-caption--config">
					<h1>
						<b>Đà Nẵng tiếp nhận hơn 22 tỷ đồng hỗ trợ chống dịch</b>
					</h1>
					<p>Chiều 31/7, Ủy ban MTTQ Việt Nam TP. Đà Nẵng đã
						tiếp nhận tiền và hàng ủng hộ công tác phòng,
						chống dịch COVID-19 từ các tổ chức, cơ quan, đơn vị,
						doanh nghiệp, cá nhân trị giá hơn 22 tỷ đồng.</p>
					<a
						class="btn btn-outline-light py-1 px-2  py-sm-2 px-sm-4 btn--read-more"
						href="https://www.24h.com.vn"> ĐỌC THÊM <i
						class="fa fa-angle-double-right"></i>
					</a>
				</div>
			</div>
		</div>
		<!-- 2 nút next  và prev 2 bên -->
		<a href="#carousel-slider" data-slide="prev"
			class="carousel-control-prev"> <span
			class="carousel-control-prev-icon"></span>
		</a> <a href="#carousel-slider" data-slide="next"
			class="carousel-control-next"> <span
			class="carousel-control-next-icon"></span>
		</a>
	</div>
	<!-- EDUCATION -->
	<section class="container welcome-section">
	<div class="row">
		<div class="col text-center welcome-title">
			<h1>HỆ THỐNG GOV HÒA HẢI</h1>
			<span>Tin tức - sự kiện - tra cứu - thông báo - phản hồi</span>
			<div class="welcome-title__line mx-auto mt-3 mb-2 mb-sm-5"></div>
			<p class="m-auto ">Từ ngày 1/1/2020 chính quyền phường HÒA HẢI áp
				dụng hệ thống GOV HÒA HẢI vào công tác quản lí cũng như tra cứu các
				dịch vụ cộng đồng cho mọi người dân thuộc địa bàn như : xem thông
				báo trực tiếp từ chính quyền, tra cứu thông tin cá nhân (giấy khai
				sinh,sổ hộ khẩu),khai báo tạm trú tạm vắng - làm giấy khai sinh -
				tạm trú tạm vắng - báo tử ...Dịch Vụ công,thủ tục hành chính</p>
		</div>
	</div>
	<div class="row mt-5">
		<div class="col-12">
			<div class="card-group">
				<div class="col-sm card border-dark">
					<div class="card-body education-course">
						<i class="fa fa-search"></i>
						<h2>TRA CỨU HỒ SƠ</h2>
						<h3>TRA CỨU HỘ KHẨU</h3>
						<p>Tra cứu hộ khẩu gia đình,thành viên</p>
						<h3>TRA CỨU NHÂN KHẨU</h3>
						<p>kiểm tra :Tạm Trú ,tạm vắng..</p>
						<h3>KIỂM TRA THÔNG TIN CÁ NHÂN</h3>
						<p>CMND,quê quán,học vấn,tạm trú...</p>
					</div>
				</div>
				<div class="col-sm card border-dark">
					<div class="card-body education-course">
						<i class="fa fa-book"></i>
						<h2>TRA CỨU THỦ TỤC</h2>
						<h3>- THỦ TỤC ĐĂNG KÍ KHAI SINH</h3>
						<h3>- THỦ TỤC ĐĂNG KÍ TẠM TRÚ</h3>
						<h3>- THỦ TỤC ĐĂNG KÍ KẾT HÔN</h3>
						<h3>- THỦ TỤC LÀM HỘ CHIẾU</h3>
						<h3>- THỦ TỤC PHẢN ÁNH KIẾN NGHỊ</h3>
						<h3>- THỦ TỤC ĐĂNG KÍ THÀNH LẬP DOANH NGHIỆP</h3>
						<h3>
							... <a href="">Thêm</a>
						</h3>
					</div>
				</div>
				<div class="col-sm card border-dark">
					<div class="card-body education-course">
						<i class="fa fa-envelope-o"></i>
						<h2>THƯ & PHẢN HỒI</h2>
						<h3>HỆ THỐNG THƯ ĐIỆN TỬ</h3>
						<p>Mọi người dân có thể gửi những ý kiến thông qua kênh điện
							tử</p>
						<h3>GỬI PHẢN HỒI DỊCH VỤ CÔNG</h3>
						<p>Đăng kí gửi phản hồi sữa đổi thông tin,thủ tục hành chính
							...</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<!-- OUR START -->
	<section class="star-section">
	<div class="container">
		<div class="row">
			<div class="col start-title text-center">
				<h1>THỐNG KÊ</h1>
				<span>Thống kê hộ gia đình,dân số,tạm trú, doanh nghiệp trên
					địa bàn HÒA HẢI</span>
				<div
					class="start-title__line welcome-title__line mx-auto mt-3 mb-2 mb-sm-5"></div>
			</div>
		</div>
		<div class="row">
			<div class="col-12 col-sm-6 col-md-3 start-detail mb-md-0 mb-3">
				<i class="fa fa-home"></i>
				<h2>Hộ Gia Đình</h2>
				<p class="counter">5000</p>
			</div>
			<div class="col-12 col-sm-6 col-md-3 start-detail mb-md-0 mb-3">
				<i class="fa fa-user"></i>
				<h2>DÂN SỐ</h2>
				<p class="counter">100000</p>
			</div>
			<div class="col-12 col-sm-6 col-md-3 start-detail mb-md-0 mb-3">
				<i class="fa fa-users"></i>
				<h2>TẠM TRÚ</h2>
				<p class="counter">3000</p>
			</div>
			<div class="col-12 col-sm-6 col-md-3 start-detail">
				<i class="fa fa-building"></i>
				<h2>DOANH NGHIỆP</h2>
				<p class="counter">1000</p>
			</div>
		</div>
	</div>
	</section>
	<!-- OFFER -->
	<div class="container offer-section">
		<div class="row">
			<div class="col offer-title text-center">
				<h1>THÔNG BÁO</h1>
				<span>Thông báo mới nhất của Phường Hòa Hải</span>
				<div
					class="start-title__line welcome-title__line mx-auto mt-3 mb-2 mb-sm-5"></div>
			</div>
		</div>
		<div class="row text-center">
			<div class="col-12 col-sm-6  ">
				<div class="offer-item  text-left">
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="">Tổ chức
								phòng chống ,truy lùng các đối tượng khống chế không chịu khai
								báo y tế</a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="">Thu
								hồi, hủy bỏ Quyết định Công nhận kết quả lựa chọn tổ chức đấu
								giá tài sản</a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="#">Khiển
								khai tháng hành động an toàn,vệ sinh lao động 2020 </a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="#">Bổ
								sung Danh mục CNC được ưu tiên đầu tư phát triển</a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="#">Kế
								hoạch triển khai hỗ trợ người dân gặp khó khăn do đại dịch
								Covid-19</a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="#"> Tiền
								lương khi người lao động bị cách ly tập trung</a></span>
					</p>
				</div>
			</div>
			<div class="col-12 col-sm-6  ">
				<div class="offer-item  text-left">
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="#">Gia
								hạn thời gian nhận hồ sơ xét tuyển viên chức BQL Tòa nhà TT hành
								chính năm 2020</a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="#">Số
								điện thoại đường dây nóng để tiếp nhận và xử lý kịp thời thông
								tin phản ánh các vấn đề liên quan đến các vi phạm về đầu cơ, găm
								hàng; nâng giá quá mức quy định</a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="#">Tạm
								dừng việc xét tuyển viên chức Ban Quản lý dự án đầu tư xây dựng
								các công trình nông nghiệp và phát triển nông thôn Đà Nẵng năm
								2020 </a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="#">Tìm
								kiếm người vắng mặt tại nơi cư trú</a></span>
					</p>
					<p>
						<i class="fa fa-bullhorn"></i> <span><a href="">Lịch
								tiếp công dân của các vị đại biểu HĐND thành phố trong tháng 7
								năm 2020</a></span>
					</p>
				</div>
			</div>
		</div>
	</div>
	<!-- NEW  AND EVENTS -->
	<section class="container event-section">
	<div class="row">
		<div class="col text-center event-title">
			<h1>SỰ KIỆN</h1>
			<span>Top những sự kiện Đà Nẵng 2020 nổi bật nhất</span>
			<div
				class="event-title__line welcome-title__line mx-auto mt-3 mb-2 mb-sm-5"></div>
		</div>
	</div>
	<div class="row">
		<div class="col-sm-6 col-md-5 event-img">
			<img src="<c:url value="/resources/images/countdown.jpg"></c:url>" class="img-fluid" alt="">
		</div>
		<div class="col-sm-6 col-md-7 event-info">
			<h2>Sự kiện đếm ngược Countdown Đà Nẵng 2020</h2>
			<span>2/2/2020</span>
			<p>Sự kiện đếm ngược Countdown luôn là sự kiện Đà Nẵng được các
				bạn trẻ mong chờ để chào đón năm mới. Với những tiết mục âm nhạc sôi
				động và nhiều chương trình nghệ thuật hấp dẫn, đây thực sự là món ăn
				tinh thần không thể thiếu vào ngày cuối năm. Hàng năm, sự kiện
				countdown đón năm mới tại Đà Nẵng thường được tổ chức tại quãng
				trường 29-03 đường 02-09.</p>
		</div>
		<div class="event-section-spacing"></div>
		<div class="col-sm-6 col-md-7 event-info">
			<h2>Sự kiện Hội sách Hải Châu Đà Nẵng năm 2020</h2>
			<span>20/03/2020</span>
			<p>Hội sách Hải Châu Đà Nẵng trong những năm gần đây luôn được tổ
				chức thường niên nhằm mang đến một không gian tri thức thật bổ ích
				đến với cộng đồng. Sự kiện hội sách Hải Châu thương được diễn ra vào
				tháng 04 hàng năm nhân dịp ngày sách Việt Nam 21/04. Năm 2019, hội
				sách Hải Châu được tổ chức ở khuôn viên Cầu Rồng (khu vực bở Tây Cầu
				Rồng). Hội sách Hải Châu là sự kiện Đà Nẵng thu hút được sự tham gia
				và hưởng ứng từ các bạn trẻ, học sinh và sinh viên tại Đà Nẵng.</p>
		</div>
		<div class="col-sm-6 col-md-5 event-img">
			<img src="<c:url value="/resources/images/hoisach.jpg"></c:url>" class="img-fluid" alt="">
		</div>
		<div class="event-section-spacing"></div>
		<div class="col-sm-6 col-md-5 event-img">
			<img src="<c:url value="/resources/images/dulichbien.jpg"></c:url>" class="img-fluid" alt="">
		</div>
		<div class="col-sm-6 col-md-7 event-info">
			<h2>Sự kiện khai trương mùa du lịch biển Đà Nẵng năm 2020</h2>
			<span>6/8/2020</span>
			<p>Chương trình “Khai trương mùa du lịch biển” là chương trình
				được UBND thành phố Đà Nẵng cho phép Ban quản lý tổ chức thường niên
				vào tháng 4 hàng năm, chương trình đã trở thành một sự kiện văn hóa,
				thể thao và du lịch thu hút hàng ngàn người dân và du khách tham
				gia. Năm 2018, sự kiện Đà Nẵng này sẽ diễn ra từ ngày 27/4/2018 đến
				ngày 01/5/2018 tại Công viên Biển Đông, các bãi biển du lịch Đà Nẵng
				và bán đảo Sơn Trà với các hoạt động như: Tuyên truyền bảo vệ môi
				trường, quảng bá du lịch tại bán đảo Sơn Trà và các bãi biển du lịch
				Đà Nẵng.</p>
		</div>
	</div>
	</section>

	<%@include file="/includes/footer.jsp"%>
	
</body>
</html>