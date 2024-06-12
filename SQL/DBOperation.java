import java.sql.*;

//here execute sql query
public class DBOperation {
    public static void displayAllData(String table) {
        Connection connection = DBConnection.dbConnect();
        try{
            Statement statement = connection.createStatement();
            String sqlQuery = "select * from " +table;

            ResultSet resultSet = statement.executeQuery(sqlQuery);
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            int columnCount = resultSetMetaData.getColumnCount();

            while (resultSet.next()){
                for (int i=1; i<=columnCount; i++){
                    System.out.println(resultSet.getString(i));
                }
                System.out.println();
//                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }


//    createStatement() is use in a simple query[EX:- select * from film]
//    createStaement() return an object of Statement

//    public static void displayFilmbyId(int id){
//        Connection connection = DBConnection.dbConnect();
//        try {
//            Statement statement = connection.createStatement();
//            String sqlQuery = "select * from film where film_id = "+id;
//            ResultSet resultSet = statement.executeQuery(sqlQuery);
//            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
//            int count = resultSetMetaData.getColumnCount();
//            if(resultSet.next()){
//                for (int i=1; i<=count; i++){
//                    System.out.println(resultSetMetaData.getColumnName(i)+"a: "+resultSet.getString(i));
//                }
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }


//    prepareStatement() is use in prepare Sql query [EX:-select * from film where film_id = ?]
//    prepareStatement() is return an object of PreparedStatement[is a interface]
        public static void displayFilmbyId(int id){
        Connection connection = DBConnection.dbConnect();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from film where film_id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int count = resultSetMetaData.getColumnCount();
            if(resultSet.next()){
                for (int i=1; i<=count; i++){
                    System.out.println(resultSetMetaData.getColumnName(i)+"a: "+resultSet.getString(i));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void insertStudentRecord(String rn, String nm, String add, String cty){
        Connection connection = DBConnection.dbConnect();
//        int result = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(("insert into Studentdetails values (?,?,?,?)"));
            preparedStatement.setString(1,rn);
            preparedStatement.setString(2,nm);
            preparedStatement.setString(3,add);
            preparedStatement.setString(4,cty);

            preparedStatement.executeUpdate();
        }
        catch (Exception e){
            System.out.println(e);
        }
//        return result;
    }

    public static void updateRecord(){
        Connection connection = DBConnection.dbConnect();
        try{
            PreparedStatement preparedStatement= connection.prepareStatement("update MarkDetails set Maths = 67 where roll_no = 105");
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
