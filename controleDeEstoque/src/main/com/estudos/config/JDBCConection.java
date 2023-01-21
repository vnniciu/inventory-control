package main.com.estudos.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConection {

    public static Connection conectar(){
        try {
        return DriverManager.getConnection(
        "jdbc:mysql://192.168.56.90/controleDeEstoque", "usuarioTeste", "Teste12&");
        } catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }

}

