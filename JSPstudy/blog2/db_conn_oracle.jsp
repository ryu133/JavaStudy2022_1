<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
		//insert,update,select,delete <= include해서 사용(수정사항이 생겼을 때)
		
	Connection conn = null; 
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	
	Class.forName(driver); 
	conn=DriverManager.getConnection(url,"hr2","1234");
%>
</body>
</html>