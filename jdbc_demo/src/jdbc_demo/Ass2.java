package jdbc_demo;

import java.net.ConnectException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Ass2 {
	public static void main(String[] args) throws SQLException {
		int rollno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll no for which average is need");
		rollno=sc.nextInt();
		String procedure="{call calcAverage(?,?)}";
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1","root","root");
		CallableStatement cstmt=conn.prepareCall(procedure);
		cstmt.setInt(1,rollno);
		cstmt.registerOutParameter(2,java.sql.Types.DOUBLE);
		cstmt.execute();
		System.out.println("Average is" +cstmt.getDouble(2));
		conn.close();
	}

}
