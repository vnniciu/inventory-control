package main.com.estudos.repository;

import main.com.estudos.config.JDBCConection;
import main.com.estudos.domain.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemRepository {

    static Connection connection = JDBCConection.conectar();

    public void salvarItem(Item item) throws SQLException {
        String sql = "INSERT INTO item" +
            "(nome, descricao, dataEntrada, constaEmEstoque) " +
            "VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, item.getNomeDoItem());
        stmt.setString(2, item.getDescricao());
        stmt.setString(3, item.getDataEntrada().toString());
        stmt.setString(4, item.getConstaEmEstoque());

        stmt.execute();
        stmt.close();

        connection.close();
    }

}
