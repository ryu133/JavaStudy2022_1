<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
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
		
		PreparedStatement pstmt=null;  //statement 객체: sql 쿼리 구문을 담아서 실행하는 객체
		ResultSet rs=null; //select한 결과를 담는 객체, select 한 레코드셋을 담고 있다.
		String sql=null;
		
		//폼에서 넘겨받은 id와 passwd를 DB에서 가져온 ID,PASSWD를 확인해서 같으면 업데이트 실행,다르면 업데이트하지 않음
		
		try{
			//레코드 삭제, 폼에서 넘긴 id,Passwd와 DB의 ID와 Passwd가 일치할 때 레코드 제거, id(primary key) 기준으로
			sql="delete mbtb1 where id=?";
			pstmt=conn.prepareStatement(sql); //conn의 createStatement()를 사용해서 stmt 객체를 활성화
			pstmt.setString(1, id);
			//out.println(sql); 출력 결과 확인
			rs=pstmt.executeQuery(sql);
				
			if(rs.next()){ //ID가 존재할 떄
				//rs의 결과 레코드를 변수에 할당
				String rID=rs.getString("id");
				String rPassword=rs.getString("pass");
				
				//패스워드가 일치하는지 확인
				if(passwd.equals(rPassword)){ //폼의 패스워드와 DB의 패스워드가 일치할 때
					sql="delete mbtb1 where id=?";
					pstmt.setString(1, id);
					pstmt.executeUpdate(sql);
					
					out.println("테이블에서 해당 아이디 : "+id+"가 잘 삭제되었습니다.");
					//out.println(sql);
					
				}else { //폼의 패스워드와 DB의 패스워드가 일치하지 않을 때
					out.println("패스워드가 일치하지 않습니다.");
				}
			
			}else { //ID가 존재하지 않으면
				out.println(id+" : 해당 아이디가 존재하지 않습니다.");
			}
		}catch(Exception ex){
			out.println(ex.getMessage());
			//out.println(sql);
		}finally{
			if(rs!=null)
				rs.close();
			if(pstmt!=null)
				pstmt.close();
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