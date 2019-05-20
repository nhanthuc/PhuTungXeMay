
<%@page import="java.text.DecimalFormat"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hãng Xe FI-PRO Shop</title>
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
		<h2 class="animated wow fadeInLeft" data-wow-delay=".5s">Sản Phẩm</h2>
		<h3 class="animated wow fadeInRight" data-wow-delay=".5s"><a href="index.html">Trang Chủ</a><label>/</label>Sản Phẩm<label></label></h3>
		<div class="clearfix"> </div>
	</div>
</div>
        
        		<div class="product">
			<div class="container">
						<div class="col-md-3 product-bottom">
			<!--categories-->
			<div class="categories animated wow fadeInUp animated" data-wow-delay=".5s" >
					<h3>Loại Sản Phẩm</h3>
					<ul class="cate">
                                            
						<li><i class="glyphicon glyphicon-menu-right" ></i><a href="products.jsp?category="></a></li>	
					          </ul>
				</div>
		<!--//menu-->
		<!--price-->
				<div class="price animated wow fadeInUp animated" data-wow-delay=".5s" >
					<h3>Khoảng Giá</h3>
					<div class="price-head">
					<div class="col-md-6 price-head1">
                                        <div class="price-top1">
                                            <span class="price-top">$</span>
                                            <input type="text"  value="0">
                                        </div>
                                    </div>
									<div class="col-md-6 price-head2">
                                        <div class="price-top1">
                                            <span class="price-top">$</span>
                                            <input type="text"  value="500">
                                        </div>
                                    </div>
									<div class="clearfix"></div>
                                    </div>
                                    </div>
			<!--//price-->
			<!--colors-->
			<div class="colors animated wow fadeInLeft animated" data-wow-delay=".5s" >
					<h3>Màu Sắc</h3>

                                        <div class="color-top">
                                            <ul>
												<li><a href="#"><i></i></a></li>
												<li><a href="#"><i class="color1"></i></a></li>
												<li><a href="#"><i class="color2"></i></a></li>
												<li><a href="#"><i class="color3"></i></a></li>
												<li><a href="#"><i class="color4"></i></a></li>
												<li><a href="#"><i class="color5"></i></a></li>
												<li><a href="#"><i class="color6"></i></a></li>
												<li><a href="#"><i class="color7"></i></a></li>
											</ul>
                                        </div>
                                    </div>
									
                                 
			<!--//colors-->
			<div class="sellers animated wow fadeInUp" data-wow-delay=".5s">
					
								<h3 class="best">Bán Chạy Nhất</h3>
					<div class="product-head">
                                            
						<div class=" fashion-grid">
									<a href="single.jsp?productID="><img class="img-responsive " src=">" alt=""></a>
									
								</div>
							<div class=" fashion-grid1">
								<h6 class="best2"><a href="single.jsp?productID="></a></h6>
								<span class=" price-in1"> VNĐ</span>
								<p><a href="CartServlet?command=plus&productID=" data-text="Thêm vào giỏ" class="but-hover1 item_add">Thêm vào giỏ</a></p>
							</div>
								
							<div class="clearfix"> </div>
							</div>
                                                               
							
							</div>
				</div>
				<!---->
 	</div>
                    
                            
		
                                <div class="col-md-9 animated wow fadeInRight" data-wow-delay=".5s">  

			<div class="mid-popular">
                            
				<div class="col-sm-4 item-grid item-gr  simpleCart_shelfItem">
                                    
							<div class="grid-pro">
								<div  class=" grid-product " >
									<figure>		
										<a href="single.jsp?productID=">
											<div class="grid-img">
												<img  src="" class="img-responsive" alt="">
											</div>
											<div class="grid-img">
												<img  src="" class="img-responsive"  alt="">
											</div>			
										</a>		
									</figure>	
								</div>
								<div class="women">
									<a href="#"><img src="" alt=""></a>
									<h6><a href="single.jsp?productID="></a></h6>
                                    <p ><em class="item_price">VNĐ</em></p>
                                    <a href="CartServlet?command=plus&productID=" data-text="Thêm vào giỏ" class="but-hover1 item_add">Thêm vào giỏ</a>
								</div>
							</div>
						</div>

					<div class="clearfix"> </div>
				</div>
			</div>
		
		<div class="clearfix"> </div>
		<div class="social animated wow fadeInUp" data-wow-delay=".1s">
	
                            </div>	
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>

