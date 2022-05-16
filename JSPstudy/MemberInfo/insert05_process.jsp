<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폼에서 넘겨받은 값을 DB에 저장하는 파일</title>
</head>
<body>
	<%@ include file="dbconn_oracle.jsp" %> 
	<%
		request.setCharacterEncoding("UTF-8"); //폼에서 넘긴 한글을 처리하기 위함.
		//request.setCharacterEncoding("EUC-KR");
		
		
		
		String id=request.getParameter("id");
		String passwd=request.getParameter("passwd");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		PreparedStatement pstmt=null;  //PreparedStatement 객체: sql 쿼리 구문을 담아서 실행하는 객체
		String sql=null;
		
		try{
			sql =
					"INSERT INTO mbTb1 ( idx, id, pass, name, email ) Values (seq_mbTb1_idx.nextval,?,?,?,?) ";
			
			pstmt=conn.prepareStatement(sql); //PreparedStatement 객체 생성 시에 sql 문을 넣는다.
			pstmt.setString(1, id);
			pstmt.setString(2, passwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.executeUpdate(sql); //statment 객체를 통해서 sql을 실행함
				//stmt.executeUpdate(sql) : sql <= insert,update,delete 문이 온다.
				//stmt.executeQuery(sql) : sql <= select 문이 오면서 결과를 Resulteset 객체로 변환
				
				out.println("테이블 삽입에 성공 했습니다.");
				out.println("<p><p>");
				out.println(sql);
			
		}catch(Exception ex){
			out.println("mbTb1 테이블 삽입을 실패 했습니다.");
			out.println(ex.getMessage());
			out.println("<br><p>");
			//out.println(sql);
			
		}finally{
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		}
	%>
	<p> <p> <p> 
	<%= id %> <p> 
	<%= passwd %><p>
	<%= name %><p>
	<%= email %><p>
	
	<%= sql %><p> <!-- html 블록에서 출력할 때 -->
	<% out.println(sql); %><p>	<!-- jsp 블록에서 출력할 떄 -->


</body>
</html>