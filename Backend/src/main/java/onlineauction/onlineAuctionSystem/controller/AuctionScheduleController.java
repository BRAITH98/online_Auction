package onlineauction.onlineAuctionSystem.controller;


import onlineauction.onlineAuctionSystem.entity.AuctionSchedule;
import onlineauction.onlineAuctionSystem.entity.Payments;
import onlineauction.onlineAuctionSystem.service.AuctionScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class AuctionScheduleController {

    @Autowired
    private AuctionScheduleService auctionScheduleService;

    public AuctionScheduleController(AuctionScheduleService auctionScheduleService) {
        this.auctionScheduleService = auctionScheduleService;
    }
    @PostMapping("/auctionSchedule")
    public ResponseEntity<AuctionSchedule> addAuctionSchedule(@RequestBody AuctionSchedule auctionSchedule){

        return new ResponseEntity<AuctionSchedule>(auctionScheduleService.addAuctionSchedule(auctionSchedule), HttpStatus.CREATED);
    }

    @GetMapping("/getAuctionSchedule")
    public List<AuctionSchedule> getAllAuctionSchedule(){
        return auctionScheduleService.getAllAuctionSchedule();
    }

    @PutMapping("/update{id}")
    public ResponseEntity<AuctionSchedule> updateAuctionSchedule(@PathVariable("id") int id
            , @RequestBody AuctionSchedule auctionSchedule) {
        return new ResponseEntity<>(auctionScheduleService.updateAuctionSchedule(auctionSchedule), HttpStatus.OK);
    }
}
