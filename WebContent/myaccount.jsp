


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>QUẢN LÝ TÀI KHOẢN - FI-PRO SHOP</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Classic Style Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- js -->
<script src="js/jquery.min.js"></script>
<!-- //js -->
<!-- cart -->
<script src="js/simpleCart.min.js"></script>
<!-- cart -->
<!-- for bootstrap working -->
<script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
<!-- //for bootstrap working -->
<!-- animation-effect -->
<link href="css/animate.min.css" rel="stylesheet"> 
<script src="js/wow.min.js"></script>
<script>
 new WOW().init();
</script>
<!-- //animation-effect -->
<link href='//fonts.googleapis.com/css?family=Cabin:400,500,600,700' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Lato:400,100,300,700,900' rel='stylesheet' type='text/css'>
    </head>
    <body>
       
        <jsp:include page="header.jsp"></jsp:include>
         <div class="banner-top">
	<div class="container">
		<h2 class="animated wow fadeInLeft" data-wow-delay=".5s">QUẢN LÝ TÀI KHOẢN</h2>
		<h3 class="animated wow fadeInRight" data-wow-delay=".5s"><a href="index.jsp">Trang Chủ</a><label>/</label>Quản Lý Tài Khoản</h3>
		<div class="clearfix"> </div>
	</div>
</div>
         <div class="login">
		<div class="container">
         <!--nav-->
       <div class="page-header wow fadeInUp animated" data-wow-delay=".5s">
        <h3></h3>
       
      <ul class="nav nav-pills" role="tablist">
        <li role="presentation" class="active"><a href="myaccount.jsp"><i class="glyphicon glyphicon-user" ></i>Tài Khoản</a></li>
        <li role="presentation"><a href="checkout.jsp"><i class="glyphicon glyphicon-shopping-cart" ></i>Giỏ Hàng</a></li>
        <li role="presentation"><a href="/MusicShop/LogoutServlet"><i class="glyphicon glyphicon-log-out" ></i>Đăng Xuất</a></li>
      </ul>
      </div>
        <!--//nav-->
        <div class="page-header">
        <h3>THAY ĐỔI THÔNG TIN</h3>
      </div>
        <form action="UserServlet" method="POST">
			<div class="col-md-6 login-do1 animated wow fadeInLeft" data-wow-delay=".5s">
				<div class="login-mail">
                                    <input type="hidden" name="user_id" value="">
					<input type="text" name="username" id="name" value="">
                                        
					<i class="glyphicon glyphicon-user"></i>
                               <span id="user-result"></span>
				</div>
                            <div class="login-mail">
					<input type="text" name="useremail" id="email" value="">
                                        <input type="hidden" name="role"  value="0">
					<i class="glyphicon glyphicon-envelope"></i>
                               <span id="user-result"></span>
				</div>
                            <div class="login-mail">
					<input type="text" name="phone" id="phone" value="">
                                               
                                        
					<i class="glyphicon glyphicon-phone"></i>
                               <span id="user-result"></span>
				</div>
    
				<div class="login-mail">
					<input type="password" name="pass" id="pass" value="">
                                        
					<i class="glyphicon glyphicon-lock"></i>
                                        <span></span>
				</div>
                            
                            <div class="login-mail">
					<input type="password" name="confirm_pass" id="confirm_pass" value="">
                                        
                                        <script>$('#pass, #confirm_pass').on('keyup', function () {
    if ($('#pass').val() == $('#confirm_pass').val()) {
        $('#message').html('Trùng khớp').css('color', 'green');
    } else 
        $('#message').html('Không trùng khớp').css('color', 'red');
});
                                        
                                        </script>
                                        
                                        
					<i class="glyphicon glyphicon-lock"></i>
                                        <span></span><span id='message'></span>
				</div>
                            

				 
	
			</div>
			
                                    <input type="hidden" value="update" name="command">
					<input type="submit" class="btn btn-lg btn-info" value="Cập Nhật Thông Tin">
				

					
			<div class="clearfix"> </div>
			</form>
        <!--table-->
	 <div class="page-header">
        <h3>LỊCH SỬ MUA HÀNG</h3>
      </div>
  
  <div class="bs-example wow fadeInRight animated" data-wow-delay=".5s" data-example-id="simple-table">
    <table class="table">
      <caption>Đây là danh sách lịch sử mua hàng của bạn.</caption>
      <thead>
        <tr>
          <th>#</th>
          <th>Mã Hóa Đơn</th>
          <th>Tổng Hóa Đơn</th>
          <th>Thanh Toán</th>
          <th>Địa Chỉ</th>
          <th>Ngày Mua</th>
        </tr>
      </thead>
       
      <tbody>
        <tr>
          <th scope="row"></th>
          <td></td>
          <td> VNĐ</td>
          <td></td>
          <td></td>
          <td></td>
        </tr>
      </tbody>
      
    </table>
  </div><!-- /example -->
	<!--//table-->
         <div class="clearfix"> </div>
         </div>
	</div> 
         <div class="clearfix"> </div>
         
        
       
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

