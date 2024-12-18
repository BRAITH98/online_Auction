package onlineauction.onlineAuctionSystem.controller;

import onlineauction.onlineAuctionSystem.entity.Bid;
import onlineauction.onlineAuctionSystem.entity.User;
import onlineauction.onlineAuctionSystem.service.BidService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class BidController {

    private BidService bidService;

    public BidController(BidService bidService) {
        this.bidService = bidService;
    }

    @PostMapping("/newBid")
    public ResponseEntity<Bid> addBid(@RequestBody Bid bid){

        return new ResponseEntity<Bid>(bidService.addBid(bid), HttpStatus.CREATED);
    }

    @GetMapping("/bids")
    public List<Bid> getAllBids(){
        return bidService.getAllBids();
    }

    @GetMapping("/get{id}")
    public ResponseEntity<Bid> findBidById(@PathVariable("id") int id) {
        return new ResponseEntity<>(bidService.getBidById(id), HttpStatus.OK);
    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<String> deleteBid(@PathVariable("id") int id){
        bidService.deleteBid(id);
        return new ResponseEntity<>("Bid deleted successfully",HttpStatus.OK);
    }
}
