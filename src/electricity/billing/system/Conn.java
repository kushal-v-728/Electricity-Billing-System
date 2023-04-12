package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
        	Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///miniproject","root","JTISMEP@016");
            s =c.createStatement(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
