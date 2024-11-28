package week3_Assignment;

//Interface: DatabaseConnection
public interface DatabaseConnection {
 // Abstract method to establish a connection
 void connect();
 
 // Abstract method to disconnect from the database
 void disconnect();
 
 // Abstract method to execute an update query
 void executeUpdate(String query);
}

