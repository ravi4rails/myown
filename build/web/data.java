


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class data extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String name=request.getParameter("name");
        String query=request.getParameter("query");
        String email=request.getParameter("email");
        
        try {
             
            Class.forName("com.mysql.jdbc.Driver");
            System.out.print("1");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/data","root","root");
            System.out.print("1");
            Statement st= con.createStatement();
            System.out.print("1");
            int x=st.executeUpdate("insert into imp values('"+name+"','"+email+"','"+query+"')");
            System.out.print("1");
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }

   

}
