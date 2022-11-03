package main.com.estudos;

import main.com.estudos.domain.Item;
import main.com.estudos.service.ItemService;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {
        ItemService itemService = new ItemService();
        Item item = new Item();
        item.setNomeDoItem("Caneta");
        item.setDataEntrada(LocalDate.now());
        item.setDescricao("Caneta bic");
        item.setConstaEmEstoque(true);
        itemService.salvarItem(item);
    }
}