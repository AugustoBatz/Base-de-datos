package javamysqlbasic;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaMySQLBasic {
 
   
    public static void main(String[] args) 
    {
        try {
            JavaMySQLBasic javaMySQLBasic = new JavaMySQLBasic();
            Connection con = javaMySQLBasic.connectDatabase("prueba", "1234");
            
            Statement myStmt = null;
            ResultSet myRs = null;
            
            myStmt = con.createStatement();
            myRs = myStmt.executeQuery("select * from proyecto");
            
            while (myRs.next())
            {
                System.out.println(myRs.getString("NombreProyecto"));
                System.out.println("");
            }
            
            
            
//        Connection myConn = null;
//        Statement myStmt = null;
//        ResultSet myRs = null;
//
//        String user = "prueba";
//        String pass = "1234";
//
//        try {
//            // 1. Get a connection to database
//            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", user, pass);
//
//            // 2. Create a statement
//            myStmt = myConn.createStatement();
//
//            // 3. Execute SQL query
//            myRs = myStmt.executeQuery("select * from coordinador");
//
//            // 4. Process the result set
//            while (myRs.next()) {
//                System.out.println(myRs.getString("Nombres") + ": ");
//                System.out.println(myRs.getString("Apellidos"));
//                System.out.println(myRs.getInt("Telefono"));
//                System.out.println("");
//            }
//
//        } catch (Exception exc) {
//            exc.printStackTrace();
//        } finally {
//            if (myRs != null) {
//                try {
//                    myRs.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(JavaMySQLBasic.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//            if (myStmt != null) {
//                try {
//                    myStmt.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(JavaMySQLBasic.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//
//            if (myConn != null) {
//                try {
//                    myConn.close();
//                } catch (SQLException ex) {
//                    Logger.getLogger(JavaMySQLBasic.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        }
        } catch (SQLException ex) {
            Logger.getLogger(JavaMySQLBasic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    public Connection connectDatabase(String nom, String con) {
        try {
            // We register the MySQL (MariaDB) driver
            // Registramos el driver de MySQL (MariaDB)
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de MySQL: " + ex);
            }
            Connection connection = null;
            // Database connect
            // Conectamos con la base de datos
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydb",
                    nom, con);
            System.out.println("Si conecto");
            return connection;
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
            return null;
        }
    } 
    
}