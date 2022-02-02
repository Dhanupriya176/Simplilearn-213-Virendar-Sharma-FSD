<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  	<jsp:useBean id="data" class="practice.programs.Info" scope = "session"/>
	
	Record:<br>  
	<jsp:getProperty property="ID" name="data"/><br>  
	<jsp:getProperty property="name" name="data"/><br>  
	<jsp:getProperty property="age" name="data" /><br> 
	<jsp:getProperty property="dept" name="data" /><br> 
	
</body>
</html>