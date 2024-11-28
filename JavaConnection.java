package week3_Assignment;

//Concrete class: JavaConnection implements the DatabaseConnection interface
public class JavaConnection implements DatabaseConnection {
 
 // Concrete implementation of the connect method
 public void connect() {
     System.out.println("Connecting to the database...");
 }
 
 // Concrete implementation of the disconnect method
 public void disconnect() {
     System.out.println("Disconnecting from the database...");
 }
 
 // Concrete implementation of the executeUpdate method
 public void executeUpdate(String query) {
     System.out.println("Executing update query: " + query);
 }

 // Main method to execute the class functionality
 public static void main(String[] args) {
     // Create an instance of JavaConnection (Concrete class)
     DatabaseConnection dbConnection = new JavaConnection();
     
     // Call the implemented methods
     dbConnection.connect(); // Connecting to the database
     dbConnection.executeUpdate("UPDATE users"); // Execute an update query
     dbConnection.disconnect(); // Disconnecting from the database
 }
}
