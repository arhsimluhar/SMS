/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseConnectivity;

/**
 *
 * @author smvdu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert {

    public static void main(String[] argv) throws Exception {
        String driver = "com.mysql.jdbc.Driver";

        Class.forName(driver);
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
        System.out.println(con.toString());
        

        String name = "\"Abhishek\"";
        String roll = "\"10\"";
        String query = "INSERT into student VALUES(" + roll + "," + name + ");";

        System.out.println("Query :" + query);
        Statement st = con.createStatement();
        int val = st.executeUpdate(query);

        System.out.println("1 row affected");
        con.close();
    }
}
