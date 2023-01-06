package mySqlConnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) throws SQLException  {
		// 1. create a connection
		// 2. create a statement
		//  3. Execute queries
		// 4. close connection		
				
		//Step 1:  Connection
		// Connection is an interface from java.sql package, it creates connection with any database
        // Drivermanager is class from java.sql package, it manages drivers 		
	
		Connection obj= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "1234");				
		//Step 2. Create a Statement		
		Statement st = obj.createStatement();			
		String a = "insert  into student_table values (120, 'Ricky', 1234567, 'France' )";
		String b = "insert  into student_table  values (122, 'Clarke', 7654321, ' Portugal')";
				
		// Step 3: Execute queries		
		st.execute(a);   // execute is predefined method 
		st.execute(b);	
		// step 4 close connection		
		obj.close();		
		System.out.println("  I thinks records are inserted successfully.............  ");
	}
}
