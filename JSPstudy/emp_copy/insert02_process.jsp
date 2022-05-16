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
<%@ include file="dbconn_mssql.jsp" %> 
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
		
		try{
			String sql =
					"INSERT INTO emp_copy ( eno,ename,job,manager,hiredate,salary,commission,dno) Values ('" + eno + "','"+  ename + "','" + job+"','" + manager+"','" + hiredate+"','" + salary+"','" + commission+"','" + dno + "') ";

			//String sql="INSERT INTO mbtb1 (idx,id,pass,name,email) values (seq_mbtb1_idx.nextval,'"+id+"','"+passwd+"','"+name+"','"+email+"')"; // ' 하나 빼먹어서 추가함
			
			stmt=conn.createStatement(); //connection 객체를 통해서 statment 객체 생성
			stmt.executeUpdate(sql); //statment 객체를 통해서 sql을 실행함
				//stmt.executeUpdate(sql) : sql <= insert,update,delete 문이 온다.
				//stmt.executeQuery(sql) : sql <= select 문이 오면서 결과를 Resulteset 객체로 변환
				
				out.println("테이블 삽입에 성공 했습니다.");	
			
		}catch(Exception ex){
			out.println("emp_copy 테이블 삽입을 실패 했습니다.");
			out.println(ex.getMessage());
		}finally{
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		}
	%>
	<%= eno %> <p> 
	<%= ename %><p>
	<%= job %><p>
	<%= manager %><p>
	<%= hiredate %><p>
	<%= salary %><p>
	<%= commission %><p>
	<%= dno %>

</body>
</html>