package database.mysql;
import java.sql.*;
import java.util.Scanner;
public class MyDb {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uppena","root","root");
			
			
System.out.println("connected "+con);
Scanner sc = new Scanner(System.in);
Statement st = con.createStatement();
System.out.println("ente rthe no,marks and name");
int num = sc.nextInt();
String name = sc.next();
int marks = sc.nextInt();
int res = st.executeUpdate("update student set sname ="+"'"+name+"',marks = "+marks+"where sno ="+num);
System.out.println(res +"inserted secuues"); 
//st.executeUpdate("insert into student values (1, 'ramu',78)");
//System.out.println("table is created");
System.out.println("inserted successfully");
st.close();
sc.close();
con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
//create table student(sno int,sname varchar(20),marks int)");
