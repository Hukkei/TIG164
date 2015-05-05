import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DbConnection {
	Connection c; 
	
	void createConnection() {

	try {
		{
		Class.forName("org.sqlite.JDBC");
		c = DriverManager.getConnection("jdbc:sqlite:" + paneInput.SendPaneToBase());
		}
	} catch (SQLException e) {
	    System.out.println("Kan inte skapa ett DB-objekt korrekt" + e);
	} catch (ClassNotFoundException e) {
	    System.out.println("Kan inte skapa ett DB-objekt korrekt" + e);
	}
 
    }

    public Connection getConnection() {
	return c;
    }

}
