<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sptags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
<%@include file="userheader.jsp" %>
<html lang="en">
<head>
   <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
table {
    border-collapse: collapse;
    width: 100%;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

th {
    background-color: rgb(0, 0, 0);
    color: white;
}
</style>
</head>
<body>


 
<div class="container" >
     
  <table class="table table-striped table-bordered">
    <thead>
      <tr>
        <th>Productid</th>
        <th>ProductName</th>
        <th>ProductPrice</th>
        <th>ProductCategory</th>
        <th>Product Supplier</th>
        <th>Image</th>
        <th>showmoredetails</th>
      </tr>
    </thead>
    <tbody>
     <jscore:forEach items="${product}" var="p">
      <tr>
        <td>${p.id}</td>
        <td>${p.proname}</td>
        <td>${p.proprice}</td>
        <td>${p.procat}</td>
        <td>${p.prosup}</td>
   <td><img src="resources/${p.id }.jpg" width=75px;height=75px></td>
        <td><a href="showmoredetails?id=${p.id}"><img src="resources/${p.id }.jpg" width=75px; height=75px></a></td>
      </tr>
      </jscore:forEach>
    </tbody>
  </table>
</div>


</body>
</html>
