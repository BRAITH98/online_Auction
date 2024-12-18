package onlineauction.onlineAuctionSystem.controller;


import onlineauction.onlineAuctionSystem.entity.Item;
import onlineauction.onlineAuctionSystem.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ItemController {

    @Autowired
    private ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping("/addItem")
    public ResponseEntity<Item> addItem(@RequestBody Item item){

        return new ResponseEntity<Item>(itemService.addItem(item), HttpStatus.CREATED);
    }

    @GetMapping("/getAllItems")
    public List<Item>getAllItems(){
        return itemService.getAllItems();
    }

    @GetMapping("/getItem{id}")
    public ResponseEntity<Item> getItemById(@PathVariable("id") int id) {
        return new ResponseEntity<>(itemService.getItemById(id), HttpStatus.OK);
    }
    @DeleteMapping("/deleteItem{id}")
    public ResponseEntity<String> deleteItem(@PathVariable("id") int id){
        itemService.deleteItem(id);
        return new ResponseEntity<>("Item deleted successfully",HttpStatus.OK);
    }
}
