package jdbc_demo;
import java.util.Scanner;
import java.sql.*;

public class Test {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("loaded");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql1","root","root");
			System.out.println("connection done");
			int choice;
			int count=0;
			int rollno,sub1,sub2,sub3;
			String name;
			Scanner sc=new Scanner(System.in);
				while(count<10)
			{
				System.out.println("1.Insert"+" "+"2.Update"+" "+"3.Delete"+" "+"4.Display particular"+" "+"5.Display all");
				choice=sc.nextInt();
				switch(choice)
				{
				case 1:	System.out.println("Enter student details");
						rollno=sc.nextInt();
						name=sc.next();
						sub1=sc.nextInt();
						sub2=sc.nextInt();
						sub3=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement("insert into Student values(?,?,?,?,?)");
						ps.setInt(1, rollno);
						ps.setString(2,name);
						ps.setInt(3,sub1);
						ps.setInt(4,sub2);
						ps.setInt(5,sub3);
						ps.executeUpdate();
						break;
						
				case 2: System.out.println(" Enter the details which is to be updated");
						rollno=sc.nextInt();
						Statement stmt=conn.createStatement();
						stmt.executeUpdate("update Student set sub1=500 where rollno=1");
						break;
						
				case 3: System.out.println(" Enter the details which is to be deleted");
						rollno=sc.nextInt();
						Statement stmt1=conn.createStatement();
						stmt1.executeUpdate("Delete from Student where rollno=3");
						break;
						
				case 4: System.out.println("Enter row to be displayed");
						rollno=sc.nextInt();
						 Statement stmt2=conn.createStatement();
						 ResultSet rs=stmt2.executeQuery("select * from Student where rollno=2");
						 while(rs.next())
							{
							System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getInt(5));	
							}
						 break;
						 
				case 5: System.out.println("Display all");
						Statement stmt3=conn.createStatement();
						ResultSet rs1=stmt3.executeQuery("select * from Student");
						while(rs1.next())
						{
						System.out.println(rs1.getInt(1)+" "+rs1.getString(2)+" "+rs1.getInt(3)+" "+rs1.getInt(4)+" "+rs1.getInt(5));	
						}
						break;
				}
				}
			count++;
			conn.close();
			} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
