package main.com.estudos;

import main.com.estudos.domain.Item;
import main.com.estudos.service.ItemService;

import java.sql.SQLException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws SQLException {
        ItemService itemService = new ItemService();
        Item item = new Item();
        item.setNomeDoItem("Produto1");
        item.setDataEntrada(LocalDate.now());
        item.setDescricao("Descricao produto");
        item.setConstaEmEstoque("S");
        itemService.salvarItem(item);

        itemService.buscarItem().forEach(a -> System.out.println(a.getNomeDoItem()+ " " +a.getConstaEmEstoque()));
    }
}