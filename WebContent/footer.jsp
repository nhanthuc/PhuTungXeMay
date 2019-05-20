
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>footer</title>
    </head>
    <body>
        <div class="footer">
		<div class="container">
		<div class="footer-top">
		<div class="col-md-9 footer-top1">
		<h4>Hợp tác kinh doanh cùng FI-PRO Shop </h4>
		<p>Nếu bạn muốn trở thành một trong chuỗi hệ thống FI-PRO Shop trong việc kinh doanh Phụ Tùng Xe Máy  thì hãy liên hệ với chúng tôi ngay để được hỗ trợ.</p>
		</div>
		<div class="col-md-3 footer-top2">
		<a href="contact.jsp">Liên hệ chúng tôi</a>
		</div>
		<div class="clearfix"> </div>
		</div>
			<div class="footer-grids">
				<div class="col-md-4 footer-grid animated wow fadeInLeft" data-wow-delay=".5s">
					<h3>Giới Thiệu</h3>
					<p></span></p>
				</div>
				<div class="col-md-4 footer-grid animated wow fadeInLeft" data-wow-delay=".6s">
					<h3>Thông Tin Liên Hệ</h3>
					<ul>
						<li><i class="glyphicon glyphicon-map-marker" ></i>475A, Điện Biên Phủ, P.24, <span>Q.Bình Thạnh, TP. Hồ Chí Minh.</span></li>
						<li class="foot-mid"><i class="glyphicon glyphicon-envelope" ></i><a href="mailto:phutungchinhhang.com">phutungchinhhang.com</a></li>
					</ul>
				</div>
				<div class="col-md-4 footer-grid animated wow fadeInLeft" data-wow-delay=".7s">
				<h3>Đăng ký theo dõi qua Email </h3>
                                <form action="NewsletterServlet" method="post">
					<input type="text" placeholder="Hãy nhập Email của bạn" name="email" required="">
                                        <input type="hidden" name="command" value="insert">
					<input type="submit" value="Gửi">
				</form>
			
				</div>
			
				<div class="clearfix"> </div>
			</div>
			
			<div class="copy-right animated wow fadeInUp" data-wow-delay=".5s">
				<p>&copy 2017 FI-PRO Shop.</p>
			</div>
		</div>
	</div>
    </body>
</html>
