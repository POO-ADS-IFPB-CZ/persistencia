package dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class ConnectionFactory {

    public Connection getConnection() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("database.properties"));
        System.out.println(prop.getProperty("url"));
        return null;
    }

    public static void main(String[] args){
        ConnectionFactory cf = new ConnectionFactory();
        try {
            cf.getConnection();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
