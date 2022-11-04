package main.com.estudos.repository;

import main.com.estudos.config.JDBCConection;
import main.com.estudos.domain.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository {



    public void salvarItem(Item item) throws SQLException {
        Connection connection = JDBCConection.conectar();
        try{
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
        } catch (SQLException e) {

        }finally {
            connection.close();
        }

    }

    public List<Item> buscarItens() throws SQLException {
        Connection connection = JDBCConection.conectar();
        PreparedStatement stmt = connection.prepareStatement("SELECT * FROM item");
        ResultSet rs = stmt.executeQuery();
        List<Item> itens = new ArrayList<Item>();
        while (rs.next()) {
            Item item = new Item();
            item.setId(rs.getLong("id"));
            item.setNomeDoItem(rs.getString("nome"));
            item.setDescricao(rs.getString("descricao"));
            item.setDataEntrada(rs.getDate("dataEntrada").toLocalDate());
            item.setDataSaida(rs.getDate("dataSaida")== null ? null : rs.getDate("dataSaida").toLocalDate());
            item.setConstaEmEstoque(rs.getString("constaEmEstoque"));
            itens.add(item);
        }
        rs.close();
        stmt.close();
        return itens;
    }

}
