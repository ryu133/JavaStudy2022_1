<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MSSQL DB Connection</title>
</head>
<body>
	<%
		Connection conn = null;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";     
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=myDB"; 

		Class.forName(driver);
		conn= DriverManager.getConnection (url, "sa", "1234");
	%>
</body>
</html>