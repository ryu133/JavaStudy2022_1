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
		
		
		//폼에서 request 객체의 getParameter로 폼에서 넘긴 변수의 값을 받는다.
		
		String id=request.getParameter("id");
		String passwd=request.getParameter("passwd");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		
		Statement stmt=null;  //statement 객체: sql 쿼리 구문을 담아서 실행하는 객체
		ResultSet rs=null; //select한 결과를 담는 객체, select 한 레코드셋을 담고 있다.
		String sql=null;
		
		//폼에서 넘겨받은 id와 passwd를 DB에서 가져온 ID,PASSWD를 확인해서 같으면 업데이트 실행,다르면 업데이트하지 않음
		
		try{
			//폼에서 넘겨받은 id를 조건으로 DB의 값을 가져옴(select)
			sql = "SELECT id,pass from mbTb1 where id='"+id+"'";
			stmt=conn.createStatement(); //conn의 createStatement()를 사용해서 stmt 객체를 활성화
			rs=stmt.executeQuery(sql);
				//stmt.executeUpdate(sql): insert,update,delete
				//stmt.executeQuery(sql): select한 결과를 ResultSet 객체로 값을 반환
				
			if(rs.next()){ //DB에 폼에서 넘긴 ID가 존재하면 => 폼에서 넘긴 패스워드와 DB의 Password가 일치하는지 확인
				//out.println(id+": 해당 아이디가 존재합니다.");
			
				//DB에서 값을 가지고 온 ID와 Pass를 변수에 할당
				String rID=rs.getString("id");
				String rPassword=rs.getString("pass");
				
				//폼에서 넘겨준 값과 DB에서 가죠온 값이 일치하는지 확인
				if(id.equals(rID)&&passwd.equals(rPassword)){
					//DB에서 가져온 Password와 폼에서 넘긴 패스워드가 일치할 때 update한다
					//sql 변수 재사용
					sql="update mbtb1 set name='"+name+"',email='"+email+"' where id='"+id+"'";
					stmt=conn.createStatement();
					stmt.executeUpdate(sql);
					out.println("테이블의 내용이 잘 수정되었습니다.");
					
					
					out.println(sql);
					
				}else { //패스워드가 일치하지 않을 때
					out.println("패스워드가 일치하지 않습니다.");
				}
			
			}else { //DB에 폼에서 넘긴 ID가 존재하지 않으면
				out.println(id+" : 해당 아이디가 데이터 베이스에 존재하지 않습니다.");
			}
				
				
			//out.println(sql);
			
		}catch(Exception ex){
			out.println(ex.getMessage());
			//out.println(sql);
		}finally{
			if(rs!=null)
				rs.close();
			if(stmt!=null)
				stmt.close();
			if(conn!=null)
				conn.close();
		}

		
		
		
	%>
<%-- 	<p> <p> <p> 
	<%= id %> <p> 
	<%= passwd %><p>
	<%= name %><p>
	<%= email %><p>
	
	<%= sql %><p> <!-- html 블록에서 출력할 때 -->
	<% out.println(sql); %><p>	<!-- jsp 블록에서 출력할 떄 --> --%>


</body>
</html>