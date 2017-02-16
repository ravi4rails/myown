
import java.sql.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ss
 */
public class database22 {
    public static void main(String[] args) {
        
    
    try {
             
             System.out.print("1");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/data","root","root");
            System.out.print("1");
            Statement st= con.createStatement();
            System.out.print("1");
            int x=st.executeUpdate("insert into imp values('abc','abc','abc')");
            System.out.print("1");
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }

}
