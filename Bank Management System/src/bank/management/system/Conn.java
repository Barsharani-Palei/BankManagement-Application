package bank.management.system;
import java.sql.*;
/*creating connection class once so that it can be called from any other classes */
public class Conn {
     Connection c;
     Statement s;
     public Conn() {
    	 try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","Barsha@645");
    	 s=c.createStatement();  	 
    	 }
    	 catch(Exception e){
    		 System.out.println(e);
    	 }
     }
}
