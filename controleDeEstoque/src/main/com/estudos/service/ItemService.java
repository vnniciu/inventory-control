package main.com.estudos.service;

import main.com.estudos.repository.ItemRepository;
import main.com.estudos.domain.Item;

import java.sql.SQLException;
import java.util.List;

public class ItemService {

    ItemRepository itemRepository = new ItemRepository();

    public void salvarItem(Item item) throws SQLException {
        itemRepository.salvarItem(item);
    }


    public List<Item> buscarItem() throws SQLException {
        return itemRepository.buscarItens();
    }

}
