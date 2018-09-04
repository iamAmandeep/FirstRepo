import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcExample {

	public static void main(String[] args) {
		
		String name, rollno;
		float marks;
	try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		name= sc.nextLine();
		System.out.println("Enter your roll number");
		rollno= sc.nextLine();
		System.out.println("Enter your marks");
		marks= sc.nextFloat();
		 
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/dbs","root","1234");  
			 
		String s = "INSERT into Student values('"+name+"', '"+rollno+"', '"+marks+"');";
			
		Statement stmt=con.createStatement();  
		stmt.execute(s);   
			
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
		
}


