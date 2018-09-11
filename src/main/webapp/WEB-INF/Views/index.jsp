
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Logo</a>
    </div>
    <ul class="nav navbar-nav">
    
      <li><a href="home1.html">Product</a></li>
      <li><a href="category.html">Category</a></li>
      <li><a href="supplier.html">Supplier</a></li>
   <li><a href="perform_logout">Logout</a></li>
    </ul>
  </div>
</nav>

<div class="container mt-3">

<h2>Carousel</h2>
<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="200" data-keyboard="true" data-pause="hover" data-wrap="false">

 <!-- Indicators -->
 <ul class="carousel-indicators">
   <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
   <li data-target="#myCarousel" data-slide-to="1"></li>
   <li data-target="#myCarousel" data-slide-to="2"></li>
 </ul>

 <!-- The slideshow -->
 <div class="carousel-inner">
   <div class="carousel-item active">
     <img src="resources/pic1.jpg" alt="Los Angeles" width="1100" height="500">
   </div>
   <div class="carousel-item">
     <img src="resources/pic2.jpg" alt="Chicago" width="1100" height="500">
   </div>
   <div class="carousel-item">
     <img src="resources/pic3.jpg" alt="New York" width="1100" height="500">
   </div>
 </div>

 <!-- Left and right controls -->
 <a class="carousel-control-prev" href="#myCarousel" data-slide="prev">
   <span class="carousel-control-prev-icon"></span>
 </a>
 <a class="carousel-control-next" href="#myCarousel" data-slide="next">
   <span class="carousel-control-next-icon"></span>
 </a>
</div>

</div>
</body>
</html>

