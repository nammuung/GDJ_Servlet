<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    DepartmentDAO departmentDAO = new DepartmentDAO();
    DepartmentDTO departmentDTO = new DepartmentDTO();
    String id = request.getParameter("department_id");
	departmentDTO.setDepartment_id(Integer.parseInt(id));
   	departmentDTO = departmentDAO.getDetail(departmentDTO);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>departments update</h1>
</body>
</html>