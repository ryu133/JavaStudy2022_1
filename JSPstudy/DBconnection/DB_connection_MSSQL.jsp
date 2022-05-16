<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Oracle DB Connection</title>
</head>
<body>
	<%
		//변수 초기화
		Connection conn = null; //DB를 연결하는 객체
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";     
		String url = "jdbc:sqlserver://localhost:1433;DatabaseName=myDB"; 
		Boolean connect = false;		//접속이 잘 되는지 확인하는 변수

		try{
			Class.forName(driver);
			conn= DriverManager.getConnection (url, "sa", "1234");

			connect = true;
			conn.close();
		}catch(Exception e){
			connect=false;
			e.printStackTrace();
		}	
	%>

	<%
	if(connect==true){
		out.println("mssql DB에 잘 연결되었습니다.");
	}else{
		out.println("mssql DB연결에 실패 하였습니다.");
	}
	%>
</body>
</html>