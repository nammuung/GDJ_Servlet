<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <% 
   DepartmentDAO dao = new DepartmentDAO();
   DepartmentDTO departmentDTO = new DepartmentDTO();
   String b = request.getParameter("department_id");
   int num = Integer.parseInt(b);
   departmentDTO.setDepartment_id(b); 
   departmentDTO = dao.getdao(departmentDTO);
   %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>departments_detail</h1>
		<h3><%= departmentDTO.getDepartment_id() %></h3>
		<button>수정</button>
</body>
</html>