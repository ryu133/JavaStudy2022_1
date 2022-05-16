<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.sql.*,java.util.*,java.text.*"%>
<%@ include file="dbconn_oracle.jsp"%>
<% request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show</title>
</head>
<body>
<center>
	<%
	//Vector: 멀티 스레드 환경에서 사용, 모든 메소드가 동기화 처리되어 있음
	Vector name = new Vector(); //DB의 name 값만 저장하는 벡터
	Vector inputdate = new Vector();
	Vector email = new Vector();
	Vector subject = new Vector();
	Vector content = new Vector();

	//페이징 처리 시작 부분
	int where = 1;

	int totalgroup = 0; //출력할 페이지의 그룹 최대 개수
	int maxpages = 3; //최대 페이지 개수 (화면에 출력될 페이지 개수)
	int startpage = 1; //처음 페이지
	int endpage = startpage + maxpages - 1; //마지막 페이지
	int wheregroup = 1; //현재 위치하는 그룹


	if (request.getParameter("go") != null) { //go 변수의 값을 가지고 있을 때
		where = Integer.parseInt(request.getParameter("go")); //현재 페이지 번호를 담은 변수
		wheregroup = (where - 1) / maxpages + 1; //현재 위치한 페이지의 그룹
		startpage = (wheregroup - 1) * maxpages + 1;
		endpage = startpage + maxpages - 1;

		//gogroup 변수를 넘겨받아서 startpage,endpage,where(페이지 그룹의 첫번째 페이지)
	} else if (request.getParameter("gogroup") != null) { //gogroup 변수의 값을 가져올 때
		wheregroup = Integer.parseInt(request.getParameter("gogroup"));
		startpage = (wheregroup - 1) * maxpages + 1;
		where = startpage;
		endpage = startpage + maxpages - 1;
	}
	int nextgroup = wheregroup + 1; //다음 그룹 : 현재 그룹 +1
	int priorgroup = wheregroup - 1; //이전 그룹 : 현재 그룹 -1

	int nextpage = where + 1; //다음 페이지 : 현재 페이지 +1
	int priorpage = where - 1; //이전 페이지 : 현재 페이지 -1
	int startrow = 0; //하나의 page에서 레코드 시작 번호
	int endrow = 0; //하나의 page에서 레코드 마지막 번호
	int maxrows = 2; //출력할 레코드의 수 
	int totalrows = 0; //총 레코드 개수
	int totalpages = 0; //총 페이지 개수

	//페이징 처리 마지막 부분
	
	int id=0;

	
	//Connection con= null;
	String sql = null;
	Statement st = null;
	ResultSet rs = null;

	try {
		sql = "select * from guestboard ";
		st = conn.createStatement();
		rs = st.executeQuery(sql);

// 		out.println(sql);
// 		if(true) return; //프로그램 종료

		if (!(rs.next())) {
			out.println("게시판에 올린 글이 없습니다");
		} else {
			//database의 값을 가져와서 각각의 vector에 저장
		do {
		//rs의 컬럼의 값을 가져와서 vector에 저장
		name.addElement(rs.getString("name"));
		email.addElement(rs.getString("email"));
		String idate = rs.getString("inputdate");
		//idate = idate.substring(0, 8);
		inputdate.addElement(idate);
		subject.addElement(rs.getString("subject"));
		content.addElement(rs.getString("content"));
		}while(rs.next());
		
			totalrows = name.size(); //name vector에 저장된 값의 개수, 총 레코드 수 
			totalpages = (totalrows - 1) / maxrows + 1;
			startrow = (where - 1) * maxrows; //현재 페이지의 시작 레코드 번호
			endrow = startrow + maxrows - 1; //현재 페이지의 마지막 레코드 번호

			if (endrow >= totalrows)
		endrow = totalrows - 1;
			totalgroup = (totalpages - 1) / maxpages + 1; //페이지의 그룹

			//out.println("페이지 그룹 수: "+totalgroup+"<p>");

			if (endpage > totalpages)
		endpage = totalpages;
	 		
			//현재 페이지에서 시작 레코드, 마지막 레코드까지 순환하면서 출력
		for (int j = startrow; j <= endrow; j++) {
			String temp=(String)email.elementAt(j);
		if ((temp == null) || ((temp.equals("")))) { 
			temp = (String)email.elementAt(j);
		} else {
			temp = "<A href=mailto: " + temp + ">" + email.elementAt(j) + "</A>";
		}

		id= totalrows-j;
		
		out.println("<table width='600' cellspacing='0' cellpadding='2' align='center'>");
		out.println("<tr>");
		out.println("<td height='22'>&nbsp;</td></tr>");
		out.println("<tr align='center'>");
		out.println("<td height='1' bgcolor='#1F4F8F'></td>");
		out.println("</tr>");
		out.println("<tr align='center' bgcolor='#DFEDFF'>");
		out.println("<td class='button' bgcolor='#DFEDFF'>");
		out.println("<div align='left'><font size='2'>" + subject.elementAt(j) + "</div> </td>");
		out.println("</tr>");
		out.println("<tr align='center' bgcolor='#FFFFFF'>");
		out.println("<td align='center' bgcolor='#F4F4F4'>");
		out.println("<table width='100%' border='0' cellpadding='0' cellspacing='4' height='1'>");
		out.println("<tr bgcolor='#F4F4F4'>");
		out.println("<td width='13%' height='7'></td>");
		out.println("<td width='22%' height='7'>글쓴이 : " + name.elementAt(j) + "</td>");
		out.println("<td width='32%' height='7'>E-mail : "+temp+"</td>");
		out.println("<td width='13%' height='7'></td>");
		out.println("</tr>");
		out.println("<tr bgcolor='#F4F4F4'>");
		out.println("<td width='13%'></td>");
		out.println("<td width='51%'>작성일 : " + inputdate.elementAt(j) + "</td>");
		out.println("<td width='11%'></td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr align='center'>");
		out.println("<td bgcolor='#1F4F8F' height='1'></td>");
		out.println("</tr>");
		out.println("<tr align='center'>");
		out.println("<td style='padding:10 0 0 0'>");
		out.println("<div align='left'><br>");
		out.println("<font size='3' color='#333333'><PRE>" + content.elementAt(j) + "</PRE></div>");
		out.println("<br>");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr align='center'>");
		out.println("<td class='button' height='1'></td>");
		out.println("</tr>");
		out.println("<tr align='center'>");
		out.println("<td bgcolor='#1F4F8F' height='1'></td>");
		out.println("</tr>");
			}
			rs.close();
		} //else 블록 끝
		out.println("</TABLE>");
		st.close();
		conn.close();
		
	} catch (java.sql.SQLException e) {
		out.println(e);
	}
	

	if (wheregroup > 1) { //현재 나의 그룹이 1 이상일 때
		out.println("[<A href=dbgb_show.jsp?gogroup=1>처음</A>]");
		out.println("[<A href=dbgb_show.jsp?gogroup=" + priorgroup + ">이전</A>]");
	} else {//현재 나의 그룹이 1이상이 아닐 때
		out.println("[처음]");
		out.println("[이전]");
	}
	if (name.size() != 0) {
		for (int jj = startpage; jj <= endpage; jj++) {
			if (jj == where)
		out.println("[" + jj + "]");
			else
		out.println("[<A href=dbgb_show.jsp?go=" + jj + ">" + jj + "</A>]");
		}
	}
	if (wheregroup < totalgroup) {
		out.println("[<A href=dbgb_show.jsp?gogroup=" + nextgroup + ">다음</A>]");
		out.println("[<A href=dbgb_show.jsp?gogroup=" + totalgroup + ">마지막</A>]");
	} else {
		out.println("[다음]");
		out.println("[마지막]");
	}
	out.println(wheregroup+"/" + totalgroup);
	%>

<p>
	<TABLE border=0 width=600 cellpadding=0 cellspacing=0>
		<TR>
			<TD align="center" valign=bottom width="117"><A
				href="dbgb_write.htm"><img src="image/write.gif" border="0"></A></TD>
		</TR>
	</TABLE>

</center>

</body>
</html>