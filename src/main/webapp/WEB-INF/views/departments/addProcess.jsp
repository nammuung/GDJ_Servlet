<%@page import="com.winter.app.departments.DepartmentDAO"%>
<%@page import="com.winter.app.departments.DepartmentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    DepartmentDTO departmentDTO = new DepartmentDTO();
    DepartmentDAO departmentDAO = new DepartmentDAO();
    String deartment_id = request.getParameter("department_id");
	String deartment_name = request.getParameter("department_name");
	String manager_id = request.getParameter("manager_id");
	String location_id = request.getParameter("location_id");
	
	departmentDTO.setDepartment_id(Integer.parseInt(deartment_id));
	departmentDTO.setDepartment_name(deartment_name);
	departmentDTO.setManager_id(Integer.parseInt(manager_id));
	departmentDTO.setLocation_id(Integer.parseInt(location_id));
	
	int result = departmentDAO.add(departmentDTO);
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Add Process</h1>
	<script type="text/javascript">
	let result='<%= result%>';
	if(result>0){
		alert('등록 성공');
	}else{
		alert('등록 실패');
	}
	/* a태그랑 다르게 자동으로 가짐 */
	window.location.href="./list.jsp";
	</script>
</body>
</html>