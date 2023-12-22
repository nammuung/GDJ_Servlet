package com.winter.app.views;

import java.util.List;

import javax.swing.plaf.synth.Region;

import com.winter.app.departments.DepartmentDTO;
import com.winter.app.regions.RegionDTO;

public class View {

	public void DepartmentView(List<DepartmentDTO> ar) {
		for(DepartmentDTO departmentDTO:ar) {
			System.out.println(departmentDTO.getDepartment_id()+" : "+departmentDTO.getDepartment_name()+" : "+departmentDTO.getLocation_id()+" : "+departmentDTO.getManager_id());
		}
	}
	
	
	//Regions출력 메소드
	public void regionView(List<RegionDTO> ar) {
		for(RegionDTO regionDTO:ar) {
			System.out.println(regionDTO.getRegion_id()+" : "+ regionDTO.getRegion_name());
		}
	
	}
	
	
}
