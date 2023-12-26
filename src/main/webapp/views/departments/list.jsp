<%@page import="java.util.List"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	/* DepartmentDTO departmentDTO = new DepartmentDTO; */
	DepartmentDAO departmentDAO = new DepartmentDAO();
	List<DepartmentDTO> ar = departmentDAO.connector();
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>DEPARTMENT_ID</th>
				<th>DEPARTMENT_NAME</th>
				<th>MANAGER_ID</th>
				<th>LOCATION_ID</th>
			</tr>
		</thead>
		<tbody>
			<%for(DepartmentDTO departmentDTO :ar){ %>
			<tr>
			<td><%= departmentDTO.getDepartment_id() %></td>
			<td><a href="./detail.jsp?getDepartment_name=<%= departmentDTO.getDepartment_name() %>"><%= departmentDTO.getDepartment_name()%></a></td>
			<td><%= departmentDTO.getManager_id() %></td>
			<td><%= departmentDTO.getLocation_id() %></td>
			</tr>
			<%}%>
		</tbody>
	</table>



</body>
</html>