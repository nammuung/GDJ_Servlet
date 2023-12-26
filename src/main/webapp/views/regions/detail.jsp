<%@page import="com.winter.app.regions.RegionDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.winter.app.regions.RegionDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%
	RegionDAO dao = new RegionDAO();
	RegionDTO regionDTO = new RegionDTO();
	String n = request.getParameter("region_id");
	int num = Integer.parseInt(n);
	regionDTO.setRegion_id(num);
	regionDTO = dao.getDetail(regionDTO);	
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>Regions Detail</h1>
		<h3><%= regionDTO.getRegion_name() %></h3>
		<input id="rID" type="hidden" value="<%= regionDTO.getRegion_id()%>">
		<button id="btn">수정</button>
		
		<script type="text/javascript">
		 let btn = document.getElementById("btn");
		 let v = document.getElementById("rID");
		btn.addEventListener("click", function() {
			alert(v.value);
			location.href="./update.jsp?region_id="+v.value;
			
			
		});
		 
		</script>
</body>
</html>