<%@page import="java.util.concurrent.CountDownLatch"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*,java.util.*,java.text.*"  %>
<% request.setCharacterEncoding("EUC-KR"); %>
<%@ include file="dbconn_oracle.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>폼의 값을 받아서 DataBase에 값을 넣어주는 파일</title>
</head>
<body>
<%
	String na=request.getParameter("name");
	String em=request.getParameter("email");
	String sub=request.getParameter("subject");
	String cont=request.getParameter("content");
	String pw=request.getParameter("password");
	
	int id=1; //db에 id컬럼에 저장할 값
	
	int pos=0;
	if(cont.length()==1){
		cont=cont+" ";
	}
	
	//oracle db에  따옴표(')를 저장 시 content (text area)에 처리(\')해야 함
 	while((pos=cont.indexOf("\'",pos))!=-1){ //값이 존재하지 않을 때까지
		String left=cont.substring(0,pos);
// 		out.println("pos "+pos+"<p>");
// 		out.println("left "+left+"<p>");
		String right=cont.substring(pos,cont.length());
// 		out.println("right "+right+"<p>");
		
		cont=left+"\'"+right;
		pos+=2;
	} 
	//if(true) return;
	
	//현재 날짜 처리하기
	java.util.Date yymmdd=new java.util.Date();
	SimpleDateFormat myFormat=new SimpleDateFormat("yy-MM-d h:mm a");
	String ymd=myFormat.format(yymmdd);
	
	String sql=null;
	//Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	int cnt=0; //insert가 잘 되었는지 확인하는 변수
	
	try{
		
		//값을 저장하기 전에 최신 글번호(max(id))를 가져와서 +1을 적용한다.
		//conn (Connection) : Auto commit;이 작동된다.
			//commit을 명시하지 않아도 insert,update,delete가 자동 커밋된다.
		
		st=conn.createStatement();
		sql="select max(id) from freeboard";
		rs=st.executeQuery(sql);
		
		if(!(rs.next())){ //rs의 값이 비어있을 때
			id=1;
		} else { //rs의값이 존재할 때
			id=rs.getInt(1)+1; 
		}
		
		sql="insert into freeboard (id,name,password,email,subject, ";
		sql=sql+"content,inputdate,masterid,readcount,replynum,step)";
		sql=sql+" values ("+id+",'"+na+"','"+pw+"','"+em;
		sql=sql+"','"+sub+"','"+cont+"','"+ymd+"',"+id+",";
		sql=sql+"0,0,0)";
		
// 		out.println(sql);
// 		if(true) return;
		
		cnt=st.executeUpdate(sql); //cnt>0 이라면 insert 성공
		
		if(cnt>0){
			out.println("데이터가 성공적으로 입력 되었습니다.");
		}else{
			out.println("데이터가 입력되지 않았습니다.");
		}
		
	} catch(Exception ex) {
		out.println(ex.getMessage());
	} finally{
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(conn!=null)
			conn.close();
	}
	

	//response.sendRedirect("freeboard_list.jsp?go="+request.getParameter("page"));
%>

<jsp:forward page="freeboard_list.jsp"/>

<!-- 
	페이지 이동
	jsp:foward : 서버단에서 페이지 이동, 클라이언트의 기존의 URL 정보가 바뀌지 않는다
	response.sendRedirect : 클라이언트에서 페이지를 재요청으로 페이지 이동, 이동하는 페이지로 URL 정보가 바뀐다.
-->

</body>
</html>