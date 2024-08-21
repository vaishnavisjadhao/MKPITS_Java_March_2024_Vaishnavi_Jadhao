

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            printWriter.println("Driver loaded...");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "Pass@123");
            printWriter.println("Connection Establish ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from students");
            printWriter.println("<table border='1' align='center'>");
            while (resultSet.next()){
            	printWriter.println("<tr>");
            	printWriter.println("<td>"+resultSet.getString(1)+"</td>");
            	printWriter.println("<td>"+resultSet.getString(2)+"</td>");
            	printWriter.println("<td>"+resultSet.getString(3)+"</td>");
            	printWriter.println("<td>"+resultSet.getString(4)+"</td>");
            	printWriter.println("<td>"+resultSet.getString(5)+"</td>");
            	printWriter.println("</tr>");
            }
            printWriter.println("</table>");
        }catch (ClassNotFoundException e) {
        	 printWriter.println(e);
        } catch (SQLException e) {
        	 printWriter.println(e);
        }
		catch (Exception e) {
            printWriter.println(e);
        } 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
