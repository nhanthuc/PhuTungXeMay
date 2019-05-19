package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabase {
	 public static Connection getConnecttion() throws SQLException {
		Connection conn = null;
		 try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connURL="jdbc:sqlserver://DESKTOP-SR1RUQB:1433;databaseName=QUAN_LY_BAN_HANG;integratedSecurity=true";
			conn=DriverManager.getConnection(connURL," sa","Abc12345");
			System.out.println("ket noi thanh cong");
			
		} 
		 catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			 System.out.println("ket noi fail!!!!");
			System.err.println(e.getMessage()+"\n"+e.getClass()+"\n"+e.getCause());
		}
		return conn;
	 }
public static void main(String[] args) throws SQLException {
	System.out.println(getConnecttion());
}
}
