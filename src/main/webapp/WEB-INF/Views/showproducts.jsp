<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sptags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
<%@include file="adminheader.jsp" %>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
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
p.one {
    border-style: solid;
    border-color: red;
}
p.sansserif {
    font-family: Arial, Helvetica, sans-serif;
}

</style>

</head>
<body>

<div class="container" style="background-color:rgb(180, 180, 180);">
  <h2><p class="sansserif">Product form</p></h2>
  <sptags:form class="form-horizontal" action="addProduct" method="post" commandName="prod" enctype="multipart/form-data" >

    <div class="form-group">
      <label class="control-label col-sm-2" for="proname">ProductName</label>
      <div class="col-sm-10">          
        <sptags:input path="proname" class="form-control" placeholder="ProductName"/>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="proprice">ProductPrice</label>
      <div class="col-sm-10"> 
      <p class="bg-primary text-white"></p>         
        <sptags:input path="proprice" class="form-control" placeholder="ProductPrice"/>
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="procat">ProductCategory</label>
      <div class="col-sm-10"> 
      <p class="bg-primary text-white"></p>         
       <sptags:select path="procat" class="form-control">
                        <jscore:forEach items="${category}" var="c">
                            <option value="${c.catname}">${c.catname}</option>

                        </jscore:forEach>
                    </sptags:select>
      </div>
    </div>
     <div class="form-group">
      <label class="control-label col-sm-2" for="prosup">ProductSupplier</label>
      <div class="col-sm-10"> 
      <p class="bg-primary text-white"></p>                
       <sptags:select path="prosup" class="form-control">
                        <jscore:forEach items="${supplier}" var="s">
                            <option value="${s.supname}">${s.supname}</option>

                        </jscore:forEach>
                    </sptags:select>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="productImg" >ProductImage</label>
      <div class="col-sm-10">          
        <sptags:input type="file" path="productImg" class="form-control" placeholder="ProductImg"/>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <div class="checkbox">
          <label><input type="checkbox" name="remember"> Remember me</label>
        </div>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </sptags:form>
 
<div class="container"style="background-color:hsl(0, 60%, 50%)"; >
     
  <table class="table table-dark table-striped table-bordered">
    <thead>
      <tr>
        <th>Productid</th>
        <th>ProductName</th>
        <th>ProductPrice</th>
        <th>Product Category</th>
        <th>Product Supplier</th>
        <th>ProductImage</th>
        <th>edit</th>
        <th>delete</th>
      
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
        <td><a href="editpro?id=${p.id}">edit</a></td>
        <td><a href="deletepro?id=${p.id}">delete</a>
      
      </tr>
      </jscore:forEach>
    </tbody>
  </table>
</div>


</body>
</html>
