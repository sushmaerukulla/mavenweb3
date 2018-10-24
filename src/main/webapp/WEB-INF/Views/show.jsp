<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
<%@include file="userheader.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<title>Bootstrap Example</title>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
p.sansserif {
    font-family: Arial, Helvetica, sans-serif;
}
p{
    font-size: 20px;
}

</style>
</head>
<body>
<div class="container-fluid">
<div class="col-sm-6">

<img src="resources/${product.id }.jpg">
\<form action="addtocart">
<input type="hidden" name="id" value="${product.id}">
<p>Enter Quantity:</p><input type="text" name="quantity">

<input type="submit" value="Add to Cart">

</form>
</div>
<div class="col-sm-6">
 <p> ${product.proname}<p><br>
 <p>Rs:${product.proprice}<p>
  <p>Select size:</p>
  <input type="radio" value="small"  checked>Small
<input type="radio" value="medium"  >Medium
<input type="radio" value="large"  >Large

  </div>
 </div>
</body>
</html>