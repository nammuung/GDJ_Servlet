package com.winter.app.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.Region;

import com.winter.app.regions.RegionDTO;
import com.winter.app.util.DBConnector;

public class DepartmentDAO {

	public DepartmentDTO getdao(DepartmentDTO departmentDTO) throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "SELECT * FROM DEPARTMENTS WHERE DEPARTMENT_ID=?";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, departmentDTO.getDepartment_id());
		ResultSet rs = st.executeQuery();
		DepartmentDTO resultDTO=null; 
		if(rs.next()) {
			resultDTO = new DepartmentDTO();
			resultDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			resultDTO.setDepartment_id(rs.getInt("MANAGER_ID"));
		}
		return resultDTO;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public List<DepartmentDTO> connector() throws Exception{
		Connection con = DBConnector.getConnector();
		String sql = "SELECT * FROM DEPARTMENTS";
		PreparedStatement st =con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		List<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();
			
		
		while(rs.next()) {
		DepartmentDTO DepartmentDTO = new DepartmentDTO();
		DepartmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID")); 
		DepartmentDTO.setDepartment_name(rs.getNString("DEPARTMENT_NAME"));
		DepartmentDTO.setLocation_id(rs.getInt("manager_id"));
		DepartmentDTO.setManager_id(rs.getInt("location_id"));
		ar.add(DepartmentDTO);
		}
		DBConnector.disConnect(rs, st, con);
		return ar;
	}

}