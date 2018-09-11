<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sptags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jscore" %>
<%@include file="adminheader.jsp" %> 
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>

<div class="container" style="background-color:lavender;">
  <h2>Category form</h2>
  <sptags:form class="form-horizontal" action="addCategory" method="post" commandName="pro">
    <div class="form-group">
      <label class="control-label col-sm-2" for="catid">CategoryId</label>
      <div class="col-sm-10">
        <sptags:input path="catid" class="form-control" placeholder="catid"/>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="catname">CategoryName</label>
      <div class="col-sm-10"style="background-color:lavender;">          
        <sptags:input path="catname" class="form-control" placeholder="catname"/>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="catdes">CategoryDescription</label>
      <div class="col-sm-10"> 
      <p class="bg-primary text-white"></p>         
        <sptags:input path="catdes" class="form-control" placeholder="catdes"/>
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
  <table class="table table-dark table-striped table-bordered">
    <thead>
      <tr>
        <th>Categoryid</th>
        <th>CategoryName</th>
        <th>CategoryDescription</th>
        <th>Edit</th>
        <th>Delete</th>
      </tr>
    </thead>
    <tbody>
     <jscore:forEach items="${v3}" var="c">
      <tr>
        <td>${c.catid}</td>
        <td>${c.catname}</td>
        <td>${c.catdes}</td>
        <td><a href="#">edit</a></td>
        <td><a href="deletecat?catid=${c.catid}">delete</a></td>
      </tr>
      </jscore:forEach>
    </tbody>
  </table>
</div>
  
 

</body>
</html>
