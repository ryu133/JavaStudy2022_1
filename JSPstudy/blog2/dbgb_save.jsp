<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*,java.util.*" %>   
<% request.setCharacterEncoding("utf-8"); %> <!-- form에서 넘겨주는 한글을 처리 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>form에서 넘겨받은 값을 db에 insert하는 페이지</title>
</head>
<body>
<%@ include file="db_conn_oracle.jsp" %> <!-- connection 객체 -->
<%
	String na=request.getParameter("name");
	String em=request.getParameter("eamil");
	String sub=request.getParameter("subject");
	String cont=request.getParameter("content");
	String ymd=(new java.util.Date()).toLocaleString(); //현재 시스템의 위치(한국)
	
	//폼에서 넘긴 변수가 잘 넘어오는지 확인하기
	//out.println(na+"<p>"+em+"<p>"+sub+"<p>"+cont+"<p>"+ymd+"<p>");
	
	String sql=null;
	PreparedStatement pst=null;
	
	int cnt=0; //insert,update,delete가 잘 적용되었는지 확인
			//cnt>0 :잘 입력됨
	
	try{
		sql="insert into guestboard2 (name,email,inputdate,subject,content)";
		sql=sql+" values (?,?,?,?,?)";
		pst=conn.prepareStatement(sql); 
		pst.setString(1, na);
		pst.setString(2, em);
		pst.setString(3, ymd);
		pst.setString(4, sub);
		pst.setString(5, cont);
		
		cnt=pst.executeUpdate();
	/* 	if(cnt>0){
		out.println("테이블 삽입에 성공했습니다.");
		}else{
		out.println("테이블 삽입에 실패했습니다.");
		} */
// 		out.println(sql);
// 		if(true) return;
		
		
	}catch(Exception ex){
		out.println(ex.getMessage());
	}finally{
		if(pst!=null)
			pst.close();
		if(conn!=null)
			conn.close();
		
	}
	
%>
<jsp:forward page="dbgb_show.jsp"></jsp:forward>
</body>
</html>