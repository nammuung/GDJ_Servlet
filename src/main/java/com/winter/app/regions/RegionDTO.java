package com.winter.app.regions;

public class RegionDTO {

	// DTO 만드는 규칙
	//1. 모든 멤버변수의 접근지정자는 private로 지정 해줘야함
	//2. 모든 멤버변수의 getters,setters 생성
	//3. 생성자는 여러개 가능하지만, 기본생성자는 필수로 가져가야함
	//4. 멤버변수의 이름과 DataType은 databases의 Table의 coulm_name과 DataType 일치
	
	private int region_id;
	private String region_name;
	
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	
	
	
	
}
