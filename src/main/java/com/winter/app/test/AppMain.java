package com.winter.app.test;

import com.winter.app.util.DBConnector;

public class AppMain {
	public static void main(String[] args) {
		
		DBConnector dbConnector = new DBConnector();
		dbConnector.getConnector();
	}
}
