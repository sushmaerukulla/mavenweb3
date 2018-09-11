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
  
</head>
<body>
<div class="container" style="background-color:rgb(240, 240, 240)"; >
     
  <table class="table table-dark table-striped table-bordered">
    <thead>
      <tr>
        <th>cartid</th>
        <th>quantity</th>
        <th>ProductName</th>
        <th>ProductPrice</th>
        <th>Cart user</th>
        <th>Total Price</th>
      
      </tr>
    </thead>
    <tbody>
     <jscore:forEach items="${cart}" var="c">
      <tr>
        <td>${c.cartId}</td>
        <td>${c.quantity}</td>
        <td>${c.productname}</td>
        <td>${c.productprice}</td>
        <td>${c.cartUser}</td>
        <td>${c.totalprice}</td>
  
       
      
      </tr>
      </jscore:forEach>
    </tbody>
  </table>
</div>
</body>
</html>