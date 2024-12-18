package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Item;

import java.util.List;

public interface ItemImpl {

    Item addItem(Item  item);
    List<Item> getAllItems();
    Item getItemById(int id);
    void deleteItem(int id);
}
