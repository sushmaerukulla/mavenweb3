<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sptags"%>
<%@include file="userheader.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
p1.double {border-style: double;}
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
  <h2>  <p class="sansserif"><p>Registration form</p></p></h2></p1>
<p1 class="double">  <sptags:form name="myform" class="form-horizontal" action="addregister" method="post" commandName="reg" onsubmit="return myFunction()">
</p1>    <div class="form-inline" >
      <label class="control-label col-sm-2" for="username">Set UserName:</label>
      <div class="col-sm-10">          
        <sptags:input path="username" class="form-control" placeholder="username" name="username" />
      </div>
    </div>
    <div class="form-inline">
      <label class="control-label col-sm-2" for="productImg" >Set Password:</label>
      <div class="col-sm-10">          
        <sptags:input type="password" path="password" class="form-control" placeholder="password" name="password"/>
      </div>
    </div>
    <div class="form-inline">
      <label class="control-label col-sm-2" for="productImg" >Confirm Password:</label>
      <div class="col-sm-10">          
        <input type="password" path="password" class="form-control" placeholder="password" name="conpassword"/>
      </div>
    </div>
    <div class="form-inline">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10"> 
      <p class="bg-primary text-white"></p>         
        <sptags:input type="email" path="email" class="form-control" placeholder="email"/>
      </div>
    </div>
     <div class="form-inline">
      <label class="control-label col-sm-2" for="phoneno">Phoneno:</label>
      <div class="col-sm-10"> 
      <p class="bg-primary text-white"></p>         
        <sptags:input path="phoneno" class="form-control" placeholder="Phonenumber"/>
      </div>
    </div>
    <div class="form-inline">
      <label class="control-label col-sm-2" for="address" >Address:</label>
      <div class="col-sm-10">          
        <sptags:input type="address" path="address" class="form-control" placeholder="address"/>
      </div>
    </div>
    
    <div class="form-inline">        
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
 <script type="text/javascript">
 function myFunction()
 {
	 var username=document.myform.username.value;
	 var password=document.myform.password.value;
	 var conpassword=document.myform.conpassword.value;

	 if(username.length>6 && password.length>6 && password==conpassword)
		 {  
		return true;
		 }
	 else
		 {
		 alert("username should have atleast 6 characters");
		 alert("password is short");
		 alert("check your password")
		 return false;
		 }
 }
 </script>
</body>
</html>