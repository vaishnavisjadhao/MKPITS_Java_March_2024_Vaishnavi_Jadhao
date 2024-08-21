//package myServlets;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//@WebServlet("/submit_registration") // Ensure this URL matches the form's action
//public class RegistrationServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public RegistrationServlet() {
//        super();
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    private void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter printWriter = response.getWriter();
//
//        String userId = request.getParameter("UserId");
//        String password = request.getParameter("Password");
//        String name = request.getParameter("Name");
//        String address = request.getParameter("Address");
//        String city = request.getParameter("City");
//        double amount = Double.parseDouble(request.getParameter("Amount"));
//
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//
//        try {
//            // Load the JDBC driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            printWriter.println("Driver loaded...");
//
//            // Establish a connection
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyWebProject", "root", "Pass@123");
//            printWriter.println("Connection established...");
//
//            // Prepare SQL query
//            String sql = "INSERT INTO AccountMaster (UserId, Password, Name, Address, City, Balance) VALUES (?, ?, ?, ?, ?, ?)";
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, userId);
//            preparedStatement.setString(2, password);
//            preparedStatement.setString(3, name);
//            preparedStatement.setString(4, address);
//            preparedStatement.setString(5, city);
//            preparedStatement.setDouble(6, amount);
//
//            // Execute the insert command
//            int rowsInserted = preparedStatement.executeUpdate();
//            if (rowsInserted > 0) {
//                printWriter.println("<html><body><b>Successfully Inserted</b></body></html>");
//            } else {
//                printWriter.println("<html><body><b>Insert failed</b></body></html>");
//            }
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//            printWriter.println("Error: " + e.getMessage());
//        } finally {
//            // Close resources
//            try {
//                if (preparedStatement != null) preparedStatement.close();
//                if (connection != null) connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
