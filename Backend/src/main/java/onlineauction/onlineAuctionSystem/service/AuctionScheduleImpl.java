package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.AuctionSchedule;

import java.util.List;

public interface AuctionScheduleImpl {

        AuctionSchedule addAuctionSchedule(AuctionSchedule auctionSchedule);
        List<AuctionSchedule> getAllAuctionSchedule();
    AuctionSchedule updateAuctionSchedule(AuctionSchedule auctionSchedule);
    }


