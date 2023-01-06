package mySqlConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class PreparedStatementExample {
   public static void main(String args[]) throws SQLException {
      
      //Getting the connection
	   Connection obj= DriverManager.getConnection("jdbc:mysql://localhost:3306/newbatch21", "root", "1234");				
      	   
	   
	   //Creating a Prepared Statement
      String query = "INSERT INTO Employees(Name, Salary, Location) VALUES (?, ?, ?)";
      PreparedStatement pstmt = obj.prepareStatement(query);

      pstmt.setString(1, "Bhuvanya");
      pstmt.setInt(2, 3000);
      pstmt.setString(3, "Rome");
           
     
      int num = pstmt.executeUpdate();
      System.out.println("Rows inserted ....");
   }
}
