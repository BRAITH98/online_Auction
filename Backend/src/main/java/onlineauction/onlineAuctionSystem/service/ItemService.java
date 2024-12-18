package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Item;
import onlineauction.onlineAuctionSystem.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService implements ItemImpl{
    @Autowired
    private ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item addItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public Item getItemById(int id) {
        Optional<Item> item = itemRepository.findById(id);

        if (item.isPresent()) {
            return item.get();

        }else{
            throw new IllegalStateException("Item with id:  " + id + " already exists");
        }
    }

    @Override
    public void deleteItem(int id) {
        itemRepository.findById(id).orElseThrow();
        new IllegalStateException("Item with id: "+id+" does not exist");
        itemRepository.deleteById(id);
    }
}
