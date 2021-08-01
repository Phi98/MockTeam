
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<title>jQuery Pagination plugin</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.4/css/bootstrap.min.css" />
<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<!-- JS tạo nút bấm di chuyển trang start -->
<script
	src="http://1892.yn.lt/blogger/JQuery/Pagging/js/jquery.twbsPagination.js"
	type="text/javascript"></script>
<!-- JS tạo nút bấm di chuyển trang end -->

<style>
// /** CSS căn id pagination ra giữa màn hình **/
//
#pagination {
	display: flex;
	display: -webkit-flex; /* Safari 8 */
	flex-wrap: wrap;
	-webkit-flex-wrap: wrap; /* Safari 8 */
	justify-content: center;
	-webkit-justify-content: center;
}
</style>
</head>
<body style="width: 500px; margin: auto;">
	<!-- Hiên thị nút bấm -->



	<c:forEach items="${list}" var="list">
		<div class="row">
			<div class="col-4 contentPage">
				<a href="noidungTT?id=${list.id_TT}">${list.tieuDe}</a>
			</div>
			<div class="col-4 contentPage">${list.noiDungNgan}</div>
			<div class="col-4 contentPage">${list.ngayDang}</div>
		</div>
	</c:forEach>
	<ul id="pagination"></ul>
	
	<script type="text/javascript">
            $(function () {
                var pageSize = 9; // Hiển thị 6 sản phẩm trên 1 trang
                showPage = function (page) {
                    $(".contentPage").hide();
                    $(".contentPage").each(function (n) {
                        if (n >= pageSize * (page - 1) && n < pageSize * page)
                            $(this).show();
                    });
                }
                showPage(1);
                ///** Cần truyền giá trị vào đây **///
                var totalRows = ${total*3}; // Tổng số sản phẩm hiển thị
                var btnPage = 3; // Số nút bấm hiển thị di chuyển trang
                var iTotalPages = Math.ceil(totalRows / pageSize);

                var obj = $('#pagination').twbsPagination({
                    totalPages: iTotalPages,
                    visiblePages: btnPage,
                    onPageClick: function (event, page) {
                        console.info(page);
                        showPage(page);
                    }
                });
                console.info(obj.data());
            });
        </script>
</body>
</html>