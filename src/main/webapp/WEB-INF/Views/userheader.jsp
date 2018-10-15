<%@page import="java.math.BigInteger"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
 
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
p.sansserif {
    font-family: Arial, Helvetica, sans-serif;
}
p{
    font-size: 20px;
 
}

</style>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<nav class="navbar navbar-default" style="background-color:rgb(180, 180, 180);">
  <div class="container-fluid">
    <div class="navbar-header">
     
    </div>
    <ul class="nav navbar-nav">
     <a class="navbar-brand" href="home.jsp"><p>Home</p></a>
    <li><a href="user.html"><p>Products</p></a>
         <li> <a href="register.html"><p>SignUp</p></a></li>   
     <li> <a href="login.html"><p>SignIn</p></a></li>   
     <li><a href="perform_logout"><p>Logout</p></a></li> 
     <% BigInteger
     s=(BigInteger)session.getAttribute("rows");
     out.print(s);%> 
     <li><a href="cart1.html"><img src="resources/download.png" width=50px; height=50px></a></li>   

 </ul>
  </div>
</nav>
</body>
</html>