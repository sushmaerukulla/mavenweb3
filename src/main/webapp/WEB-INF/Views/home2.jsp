<!DOCTYPE html>
<html lang="en">
<head>
  <title>just women</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<center>
<h1><img src="resources/giphy.gif" width=80px height=80px>Just Women Clothing</h1></center>
<style>
body
{
    background-color: hsl(0, 100%, 90%);
}
</style>
</head>
<body>
<%@ include file="userheader.jsp" %>
<div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="1500">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
 
      <img src="resources/red.jpg" alt="Los Angeles" style="width:50%;"></a>
    
        <div class="carousel-caption">
        </div>
      </div>

      <div class="item">
        <img src="resources/black.jpg" alt="Chicago" style="width:50%;">
        <div class="carousel-caption">
          
        </div>
      </div>
    
      <div class="item">
        <img src="resources/6031.jpg" alt="New York" style="width:50%;">
        <div class="carousel-caption">
          
        </div>
      </div>
  
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>

</body>
</html>
