package onlineauction.onlineAuctionSystem.controller;


import onlineauction.onlineAuctionSystem.entity.Auction;
import onlineauction.onlineAuctionSystem.entity.User;
import onlineauction.onlineAuctionSystem.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AuctionController {
    @Autowired
    private AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }
    @PostMapping("/newAuction")
    public ResponseEntity<Auction> addAuction(@RequestBody Auction auction){

        return new ResponseEntity<Auction>(auctionService.addAuction(auction), HttpStatus.CREATED);
    }
    @GetMapping("/getAuctions")
    public List<Auction> getAllAuctions(){
        return auctionService.getAllAuctions();
    }

    @GetMapping("/auction{id}")
    public ResponseEntity<Auction> findAuctionById(@PathVariable("id") int id) {
        return new ResponseEntity<>(auctionService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAuction(@PathVariable("id") int id){
        auctionService.deleteAuction(id);
        return new ResponseEntity<>("Auction deleted successfully",HttpStatus.OK);
    }
}
