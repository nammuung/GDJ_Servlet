package com.winter.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnector {

	public void getConnector() {
		String user="user01";
		String password ="user01";
		String url="jdbc:oracle:thin:@52.79.235.165:1521:xe";
		String driver="oracle.jdbc.driver.OracleDriver";
		
		//1.driver 메모리 로딩(객체 생성)
		try {
			Class.forName(driver);
			
			//2. DB connection
			Connection con = DriverManager.getConnection(url, user, password);
			
			//3. sql 생성 
			String sql = "select * from regions";
			
			//4. sql 미리 전송
			// DB가 쿼리문을 받아서 실행할 준비를 함
			PreparedStatement st = con.prepareStatement(sql);
			
			//5.  현재 기준 생략
			
			//6. 최종 전송 및 결과 처리  //// 실행이라 보면댐
			ResultSet rs = st.executeQuery();
			
			// 로우(가로) 데이터가 null일때까지 읽음 boolean타입 
			while(rs.next()){
				//rs = 1, Europe
//				int n = rs.getInt("REGION_ID");
//				String name = rs.getString("REGION_NAME");
				int n = rs.getInt(1);
				String name = rs.getString(2);
				System.out.println(n+" : "+name);
				System.out.println("======================");
			}
			
			
			System.out.println(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}		

	
	
}
