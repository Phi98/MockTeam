<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Customer Manager</title>
</head>
<body>
   <h1>${hello}</h1>
  <s:form method="post" commandName="shk" action="login">
 SHK <input name="shk"/>
 <br>
 soCMND <input name="soCMND"/>
 &nbsp;<input type="submit" value="login">

   </s:form>

     <div> <a href="totruong">Tổ Trưởng</a></div>
         <div> <a href="hello">XXXXXX</a></div>
         
</body>
</html>