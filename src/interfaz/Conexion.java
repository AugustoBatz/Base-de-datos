package interfaz;
import java.sql.*;

public class Conexion {
    
    Connection cn;
    Statement st;
    
    public Connection conexion()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/inventario", "root", "1234");
            System.out.println("Conecto");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cn;
    }
    
    Statement createStatement()
    {
        throw new UnsupportedOperationException("No soportado");
    }
    
}

