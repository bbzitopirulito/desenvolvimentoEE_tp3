package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

public class Conexao {

    private Connection conn = null;
        
    public void conectar() {
        System.out.println("Conectando ao banco...");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp3?useTimezone=true&serverTimezone=UTC", "root", "root");            
            //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp3?useTimezone=true&serverTimezone=UTC", "root", "root");            
            System.out.println("Conectado!");
        } catch (ClassNotFoundException e) {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAA ERRRRROOOOOOOOOOOOOOO");
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        } catch(SQLException e) {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAA ERRRRROOOOOOOOOOOOOOO");
            System.out.println(e);
        }
    }
    
    public Connection getConexao() {
        
        
        return conn;
    }
     
}
