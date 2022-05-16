
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*,java.util.*,java.text.*"  %>
<% request.setCharacterEncoding("euc-kr"); %>
<%@ include file="dbconn_oracle.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>save</title>
</head>
<body>
<%
	String na=request.getParameter("name");
	String em=request.getParameter("email");
	String sub=request.getParameter("subject");
	String cont=request.getParameter("content");


	
	int pos=0;
	if(cont.length()==1){
		cont=cont+" ";
	}
	
	//oracle db에  따옴표(')를 저장 시 content (text area)에 처리(\')해야 함
 	while((pos=cont.indexOf("\'",pos))!=-1){ //값이 존재하지 않을 때까지
		String left=cont.substring(0,pos);
		String right=cont.substring(pos,cont.length());
		cont=left+"\'"+right;
		pos+=2;
	} 
	
	//현재 날짜 처리하기
	java.util.Date yymmdd=new java.util.Date();
	SimpleDateFormat myFormat=new SimpleDateFormat("yyyy.M.d a h:mm:ss");
	String ymd=myFormat.format(yymmdd);
	
	String sql=null;
	//Connection con=null;
	Statement st=null;
	ResultSet rs=null;
	int cnt=0; //insert가 잘 되었는지 확인하는 변수
	
	try{
		

		sql="insert into guestboard (name,email,inputdate,subject, ";
		sql=sql+"content)";
		sql=sql+" values ('"+na+"','"+em;
		sql=sql+"','"+ymd+"','"+sub+"','"+cont+"')";
		
		st=conn.createStatement();
		
// 		out.println(sql);
// 		if(true) return;
		
		st.executeUpdate(sql); //cnt>0 이라면 insert 성공
		
		out.println("데이터가 성공적으로 입력 되었습니다.");
		
		
	} catch(Exception ex) {
		out.println(ex.getMessage());
			out.println("데이터가 입력되지 않았습니다.");
	} finally{
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(conn!=null)
			conn.close();
	}
	

%>
<%-- <jsp:forward page="dbgb_write.htm"/> --%>


</body>
</html>