 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
 <!-- FOOTER -->
        <footer class="mt-5"> 
            <div class="footer-detail">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4 footer__about-us mb-3 mb-md-0">
                            <h2>Giới thiệu</h2>
                            <p>Giấy phép: 612/GP-STTTT cấp ngày 21 tháng 10 năm 2016 <br>
                                Trưởng ban Ban biên tập: Lê Trung Chinh, Phó Chủ tịch UBND thành phố
                            </p>
                        </div>
                        <div class="col-md-4 footer__news mb-3 mb-md-0">
                            <h2>Website Các Đơn Vị</h2>
                            <p>
                                <i class="fa fa-long-arrow-right"></i>
                                <span><a href="#">Sở Y Tế</a></span>
                            </p>
                            <p>
                                <i class="fa fa-long-arrow-right"></i>
                                <span><a href="#">Sở Nội Vụ</a></span>
                            </p>
                            <p>
                                <i class="fa fa-long-arrow-right"></i>
                                <span><a href="#">Sở Tư Pháp</a></span>
                            </p>
                            <p>
                                <i class="fa fa-long-arrow-right"></i>
                                <span><a href="#">Chi Cục Thuế</a></span>
                            </p>
                            <p>
                                <i class="fa fa-long-arrow-right"></i>
                                <span><a href="">Sở Xây Dựng</a></span>
                            </p>
                            <p>
                                <i class="fa fa-long-arrow-right"></i>
                                <span><a href="">Sở Tài Nguyên Và Môi Trường</a></span>
                            </p>
                        </div>
                        <div class="col-md-4 footer__contact mb-3 mb-md-0">
                            <h2>Liên Hệ</h2>
                            <p>
                                <i class="fa fa-map-marker"></i>
                                <span>255 Ngũ Hành Sơn ,Hòa Hải,tp Đà Nẵng</span>
                            </p>
                            <p>
                                <i class="fa fa-envelope-o"></i>
                                <span>toasoan@hoahainhs.gov.vn</span>
                            </p>
                            <p>
                                <i class="fa fa-phone"></i>
                                <span>(+84.236) 3.893.777</span>
                            </p>
                        </div>
                    </div>
                    <div class="row footer__form mt-md-5 ">
                        <div class="col-md-5 col-lg-4">
                            <h2 class="text-left text-md-right">Nhận thông báo  qua Email</h2>
                        </div>
                        <div class="col-md-7 col-lg-">
                            <input  type="email" name="email" placeholder="Vui lòng nhập địa chỉ Email">
                            <button class="btn btn-footer-submit  text-white">GỬI </button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="copy-right py-3 text-center text-white">
                <p class="mb-0">
                    © 2020 COPY CONTENT BY https://danang.gov.vn | Design by <span> UBND HH-NHS-DN</span>
                </p>
            </div>
        </footer>
       <!-- .......... -->
	 <!-- ---------------------------THƯ VIỆN JQUERY & JAVASCRIPT----------------------------- -->
        <!-- THƯ VIỆN JQUERY -->
        <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
        <!-- THƯ VIỆN POPUP -->
        <script src="<c:url value='/resources/js/popper.min.js'/>"></script>
        <!-- THƯ VIỆN OWL CAROUSEL -->
        <script src="<c:url value='/resources/js/owl.carousel.min.js'/>"></script>
        <script>
            $('.owl-carousel').owlCarousel({
            	loop: true,
            	margin: 10,
            	nav: false,
            	// hiện nút next và nút prev
            	autoplay: true,
            	autoplayTimeout: 2000,
            	autoplayHoverPause: true,
            	responsiveClass: true,
            	responsive: {
            		0: {
            			items: 1
            		},
            		600: {
            			items: 2
            		},
            		1000: {
            			items: 3,
            			loop: true
            		}
            	}
            })

        </script>
         <script> 
        //  thẻ ul
        var mainNav = document.getElementById("mainNav");
        //các thẻ con li
        var listNav = mainNav.getElementsByTagName("li");
        for(var i = 0; i < listNav.length; i++){
            listNav[i].addEventListener("click", function(){
                //tìm thẻ đang được gắn class active
                var current = document.querySelector("#mainNav .active");
                //xóa class active của thẻ đang được gắn
                current.className = current.className.replace("active"," ");
                //thêm class active vào cho thẻ li được click
                this.className +="active";

            });
        }
    </script>
        <!-- THƯ VIỆN BOOTSTRAP JS -->
        <script src="<c:url value='/resources/js/bootstrap.min.js'/>"></script>
        <!-- THƯ VIỆN WAYPOINTS JQUERY -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js"></script>
        <script src="<c:url value='https://cdnjs.cloudflare.com/ajax/libs/waypoints/4.0.1/jquery.waypoints.min.js'/>"></script>
        <!-- THƯ VIỆN ĐẾM SỐ -->
        <script src="<c:url value='/resources/js/jquery.countup.js'/>"></script>
        <script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
         <script src="<c:url value='/resources/js/checkForm.js'/>"></script>
        <script>
            $('.counter').countUp();
        </script>