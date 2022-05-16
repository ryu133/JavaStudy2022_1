<%@page import="com.mysql.cj.x.protobuf.MysqlxSql.StmtExecute"%>
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

		int eno=Integer.parseInt(request.getParameter("eno"));
		String ename=request.getParameter("ename");
		String job=request.getParameter("job");
		int manager=Integer.parseInt(request.getParameter("manager"));
		String hiredate=request.getParameter("hiredate");
		int salary=Integer.parseInt(request.getParameter("salary"));
		int commission=Integer.parseInt(request.getParameter("commission"));
		int dno=Integer.parseInt(request.getParameter("dno"));
		
		Statement stmt=null;  //statement 객체: sql 쿼리 구문을 담아서 실행하는 객체
		ResultSet rs=null;
		String sql=null;
		
		try{
			sql = "select eno from emp_copy where eno='" + eno + "'";
			
			stmt=conn.createStatement(); //connection 객체를 통해서 statment 객체 생성
			rs=stmt.executeQuery(sql); //statment 객체를 통해서 sql을 실행함
				//stmt.executeUpdate(sql) : sql <= insert,update,delete 문이 온다.
				//stmt.executeQuery(sql) : sql <= select 문이 오면서 결과를 Resulteset 객체로 변환
			if(rs.next()){
				int reno=Integer.parseInt(rs.getString("eno"));
				String rename=rs.getString("ename");
				
				if(rename.equals(ename)){
				sql="delete emp_copy where eno='"+eno+"'";
				stmt.executeUpdate(sql);
				out.println("테이블에서 "+eno+"가 삭제 되었습니다.");	
				out.println(sql);
				}else { 
					out.println("사원이름이 일치하지 않습니다.");
				}
			
			}else { //DB에 폼에서 넘긴 데이터가 존재하지 않으면
				out.println(eno+" : 해당 사원번호가 존재하지 않습니다.");
			}
				
			
		}catch(Exception ex){
			out.println("emp_copy 테이블 삭제에 실패 했습니다.");
			out.println(ex.getMessage());
		}finally{
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		}
	%>
<%-- 	<%= eno %> <p> 
	<%= ename %><p>
	<%= job %><p>
	<%= manager %><p>
	<%= hiredate %><p>
	<%= salary %><p>
	<%= commission %><p>
	<%= dno %> --%>

</body>
</html>