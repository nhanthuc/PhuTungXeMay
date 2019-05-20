

<%@page import="java.text.DecimalFormat"%>
<%@page import="model.User"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>header</title>
    </head>
    <body>
    <% 
            
       
        User user = null;
        if(session.getAttribute("user") != null){
            user = (User) session.getAttribute("user");
        }
        
        
            %>
        
       
        	<div class="header">
			<div class="header-grid">
					<div class="container">
				<div class="header-left animated wow fadeInLeft" data-wow-delay=".5s">
					<ul>
					<li><i class="glyphicon glyphicon-headphones"></i><a href="#">Hỗ trợ 24/7</a></li>
						<li><i class="glyphicon glyphicon-envelope" ></i><a href="mailto:phutungxemay@gmail.com">phutungxemay@gmail.com</a></li>
						<li><i class="glyphicon glyphicon-earphone" ></i>0904929010</li>
						
					</ul>
				</div>
				<div class="header-right animated wow fadeInRight" data-wow-delay=".5s">
				<div class="header-right1 ">
					<ul>
                       <%if(user!=null){ %>
		
						<li><i class="glyphicon glyphicon-user" ></i><a href="navigate.jsp">Xin Chào <%=user.getUsename() %></a></li>
						<% } %>
                                                <%if(user==null){ %>
		
						<li><i class="glyphicon glyphicon-log-in" ></i><a href="navigate.jsp">My Account</a></li>
						<% } %>
					               
					</ul>
				</div>
				<div class="header-right2">
                                    
					<div class="cart box_1">
                                           
                                            
						<a href="checkout.jsp">
							<h3> <div class="total">
                                                                
                                 <span class="last_price" ></span> VNĐ <span></span>
                                 </div>
								 <img src="images/cart.png" alt="" />
							</h3>
						</a>
                                                                      
						
                        <a href="javascript:;" class="simpleCart_empty"></a>
						<div class="clearfix"> </div>
					</div>	
                                       
				</div>
				<div class="clearfix"> </div>
				</div>
				<div class="clearfix"> </div>
			</div>
			</div>
			<div class="container">
			<div class="logo-nav">
				
					<nav class="navbar navbar-default">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header nav_2">
						<button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
							<span class="sr-only">Toggle navigation</span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
							<span class="icon-bar"></span>
						</button>
						 <div class="navbar-brand logo-nav-left ">
							<h1 class="animated wow pulse" data-wow-delay=".5s"><a href="index.jsp">Phụ Tùng Xe Máy <span> FI-PRO</span></a></h1>
						</div>

					</div> 
					<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
						<ul class="nav navbar-nav">
							<li class="active"><a href="index.jsp" class="act">Trang Chủ</a></li>	
							<!-- Mega Menu -->
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Sản Phẩm <b class="caret"></b></a>
								<ul class="dropdown-menu multi">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h4>FI-PRO SHOP</h4>
												
												<li><a href="products.jsp?category="></a></li>
											</ul>
										</div>
										
										<div class="clearfix"></div>
									</div>
									<div class="row-top">
										<div class="col-sm-6 row1">
											<h6>ĐỒ CHƠI XE MÁY</h6>
											<a href="dochoixemay.jsp"><img src="images/dochoixe.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class="col-sm-6 row1">
											<h6>VỎ XE MÁY (LỐP XE)</h6>
											<a href="guitar.jsp"><img src="images/voxe.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class=" col-sm-6 row2">
											<h6>NHỚT XE MÁY</h6>
											<a href="piano.jsp"><img src="images/dau-nhot-xe-may.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class="col-sm-6 row1">
											<h6>PHỤ KIỆN CHO BIKER</h6>
											<a href="guitar.jsp"><img src="images/phukien.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class=" col-sm-6 row2">
											<h6>PHỤ TÙNG THAY THẾ</h6>
											<a href="piano.jsp"><img src="images/phutungthaythe.jpg" alt="" class="img-responsive"></a>
										</div>
										
										<div class=" col-sm-6 row2">
											<h6>PHỤ TÙNG THEO XE</h6>
											<a href="piano.jsp"><img src="images/phutungchinhhang.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class="clearfix"></div>
									</div>
								</ul>
							</li>
						<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Hãng Xe <b class="caret"></b></a>
								<ul class="dropdown-menu multi">
									<div class="row">
										<div class="col-sm-4">
											<ul class="multi-column-dropdown">
												<h4>FI-PRO Shop</h4>                                            
												<li><a href="productbrand.jsp?brand="></a></li>
											</ul>
										</div>
										
										<div class="clearfix"></div>
									</div>
									<div class="row-top">
										
										<div class=" col-sm-6 row2">
											<a href="productbrand.jsp?brand=1"><img src="images/yamaha.png" alt="" class="img-responsive"></a>
										</div>
										<div class="col-sm-6 row1">
											<a href="productbrand.jsp?brand=2"><img src="images/suzuki.png" alt="" class="img-responsive"></a>
										</div>
										<div class=" col-sm-6 row2">
											<a href="productbrand.jsp?brand=3"><img src="images/kawasaki.png" alt="" class="img-responsive"></a>
										</div>
										<div class="col-sm-6 row1">
											<a href="productbrand.jsp?brand=4"><img src="images/ducati.png" alt="" class="img-responsive"></a>
										</div>
										<div class=" col-sm-6 row2">
											<a href="productbrand.jsp?brand=5"><img src="images/ktm.png" alt="" class="img-responsive"></a>
										</div>
										<div class="col-sm-6 row1">
											<a href="productbrand.jsp?brand=6"><img src="images/benelli.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class="col-sm-6 row2">
											<a href="productbrand.jsp?brand=7"><img src="images/honda.png" alt="" class="img-responsive"></a>
										</div>
										<div class=" col-sm-6 row1">
											<a href="productbrand.jsp?brand=8"><img src="images/hangkhac.jpg" alt="" class="img-responsive"></a>
										</div>
										<div class="clearfix"></div>
									</div>
								</ul>
							</li>	
						
							<li><a href="navigate.jsp">Tài Khoản</a></li>
							<li><a href="contact.jsp">Liên Hệ</a></li>
						</ul>
					</div>
					</nav>
				</div>
				
		</div>
	</div>
    </body>
</html>
