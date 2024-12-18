package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Bid;

import java.util.List;

public interface BidImpl {

    Bid addBid(Bid bid);
    List<Bid> getAllBids();
    Bid getBidById(int id);
    void deleteBid(int id);
}
