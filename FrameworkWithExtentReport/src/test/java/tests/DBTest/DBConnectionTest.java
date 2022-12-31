package tests.DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utilities.DatabaseUtils;


public class DBConnectionTest {

	public static void main(String[] args) throws SQLException {
		
		ResultSet rs = DatabaseUtils.getDBConnectionResult("select * from emp ORDER BY id ASC");


		try {
			while(rs.next()) {
				System.out.println(rs.getString("ID")+": "+rs.getString("NAME")+": "+rs.getString("OCCUPATION")+":"+rs.getString("AGE"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(rs);
		
		
		
	}
	
	
}
