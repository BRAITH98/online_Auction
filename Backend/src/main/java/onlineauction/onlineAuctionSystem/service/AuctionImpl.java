package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Auction;
import onlineauction.onlineAuctionSystem.entity.User;

import java.util.List;

public interface AuctionImpl {

    Auction addAuction(Auction auction);
    List<Auction> getAllAuctions();
    Auction findById(int id);
    void deleteAuction(int id);
}
