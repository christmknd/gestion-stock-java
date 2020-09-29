package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	
	 public void connexion() {
	        try{
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection conn = null;
	            conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root", "");
	            System.out.print("Database is connected !");
	            conn.close();
	        }
	        catch(Exception e){
	            System.out.print("Do not connect to DB - Error:"+e);
	        }
	    }

}
