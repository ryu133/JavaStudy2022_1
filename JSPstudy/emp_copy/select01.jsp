<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB의 내용 출력하기</title>
</head>
<body>
<%
	//변수 초기화
	Connection conn = null; //DB를 연결하는 객체
	String driver = "oracle.jdbc.driver.OracleDriver"; //oracle driver에 접속		
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	
	Class.forName(driver); //오라클 드라이버 로드함.
	conn=DriverManager.getConnection(url,"hr","hr");
%>
	
	<table width="700" border="1">
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>직책</th>
			<th>직속상관</th> 
			<th>입사일</th>
			<th>월급</th>			
			<th>보너스</th>			
			<th>부서번호</th>			
		</tr>
		
		<%
			ResultSet rs=null; //ResultSet 객체는 DB의 테이블을 Select 해서 나온 결과 레코드셋을 담는 객체
			Statement stmt=null; //SQL 쿼리를 담아서 실행하는 객체
			
			try{
				String sql="SELECT * FROM emp_copy";
				stmt =conn.createStatement(); //connection객체의 createStatement()로 stmt를 활성화
				rs=stmt.executeQuery(sql);
					//stmt.executeQuery(sql) : select 한 결과를 ResultSet 객체에 저장해야 함.
					//stmt.executeUpdate(sql) : insert,update,delete
					
					while(rs.next()){
						int eno=rs.getInt("eno");
						String ename=rs.getString("ename");
						String job=rs.getString("job");
						String manager=rs.getString("manager");
						String hiredate=rs.getString("hiredate");
						int salary=rs.getInt("salary");
						int commission=rs.getInt("commission");
						int dno=rs.getInt("dno");

						%>
						<tr>
							<td><%= eno %></td>
							<td><%= ename %></td>
							<td><%= job %></td>
							<td><%= manager %></td> 
							<td><%= hiredate %></td>
							<td><%= salary %></td>			
							<td><%= commission %></td>			
							<td><%= dno %></td>			
						</tr>						
						<% 
					}
				
			}catch(Exception ex){
				out.println("테이블 호출에 실패하였습니다.");
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
	</table>

</body>
</html>