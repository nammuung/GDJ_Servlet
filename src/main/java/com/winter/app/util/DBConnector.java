package com.winter.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConnector {

	public static Connection getConnector() throws Exception {
		String user = "user01";
		String password = "user01";
		String url = "jdbc:oracle:thin:@52.79.235.165:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		// 1.driver 메모리 로딩(객체 생성)
		Class.forName(driver);
		// 2. DB connection
		Connection con = DriverManager.getConnection(url, user, password);

		return con;
	}

	public static void disConnect(ResultSet rs, PreparedStatement st, Connection con) throws Exception {
		rs.close();
		st.close();
		con.close();
	}

}
