import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class RegistrationForm
 */
@WebServlet("/register")
public class RegistrationForm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        Connection connection = null;

        try {
            String UserId = request.getParameter("UserId");
            String Password = request.getParameter("Password");
            String Name = request.getParameter("Name");
            String Address = request.getParameter("Address");
            String City = request.getParameter("City");
            String Balance = request.getParameter("Amount");

            // Debug prints to check if parameters are received correctly
            printWriter.println("Received parameters:");
            printWriter.println("UserId: " + UserId);
            printWriter.println("Password: " + Password);
            printWriter.println("Name: " + Name);
            printWriter.println("Address: " + Address);
            printWriter.println("City: " + City);
            printWriter.println("Balance: " + Balance);

            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            printWriter.println("Driver loaded...");

            // Establish a connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyWebProject", "root", "Pass@123");
            printWriter.println("Connection established...");

            // Insertion of data
            PreparedStatement preparedStatement = connection.prepareStatement("insert into AccountMaster values (?, ?, ?, ?, ?, ?)");

            preparedStatement.setInt(1, Integer.parseInt(UserId));
            preparedStatement.setString(2, Password);
            preparedStatement.setString(3, Name);
            preparedStatement.setString(4, Address);
            preparedStatement.setString(5, City);
            preparedStatement.setBigDecimal(6, new java.math.BigDecimal(Balance));

            preparedStatement.executeUpdate();
            printWriter.println("Data inserted successfully...");

        } catch (Exception e) {
            printWriter.println(e);
        } 
    }
}
