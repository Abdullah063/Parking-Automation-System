package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {
        static String userName="root";
        static String password="alttun0";
        static String dbUrl="jdbc:mysql://localhost:3306/otoparkdb";
        
        public Connection getConnection() throws SQLException
        {
                return (Connection) DriverManager.getConnection(dbUrl,userName,password);
        }
        public void ShowEror(SQLException e)
        {
                System.out.println("EROR : "+e.getMessage());
                System.out.println("EROR CODE : "+e.getErrorCode());
        }

       
}
