package dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {

    public Connection getConnection() throws IOException,
            ClassNotFoundException, SQLException {
        Properties prop = new Properties();
        prop.load(new FileReader("database.properties"));
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(prop.getProperty("url"));
    }

    public static void main(String[] args){
        ConnectionFactory cf = new ConnectionFactory();
        try {
            if(cf.getConnection() != null){
                System.out.println("Conectado");
            }else{
                System.out.println("Falha");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
