import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DbConnection {
	Connection c; 
	Statement s;
	ResultSet rs;
	
	public Connection dbConnector() {

	try {
		{
		Class.forName("org.sqlite.JDBC");
		c = DriverManager.getConnection("jdbc:sqlite:db");
		JOptionPane.showMessageDialog(null, "Connection successful");
		return c;
		}
	} catch (SQLException e) {
	    System.out.println("Kan inte skapa ett DB-objekt korrekt" + e);
	} catch (ClassNotFoundException e) {
	    System.out.println("Kan inte skapa ett DB-objekt korrekt" + e);
	}
	return c;
 
    }
    
    public void userLogin(){
    	
    }
    
    public void roomGetsBooked(){
    	
    }




}
