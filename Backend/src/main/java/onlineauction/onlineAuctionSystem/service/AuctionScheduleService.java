package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.AuctionSchedule;
import onlineauction.onlineAuctionSystem.repository.AuctionScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionScheduleService implements AuctionScheduleImpl {

     @Autowired
     private final AuctionScheduleRepository auctionScheduleRepository;

    public AuctionScheduleService(AuctionScheduleRepository auctionScheduleRepository) {
        this.auctionScheduleRepository = auctionScheduleRepository;
    }


    @Override
    public AuctionSchedule addAuctionSchedule(AuctionSchedule auctionSchedule) {
        return auctionScheduleRepository.save(auctionSchedule);
    }

    @Override
    public List<AuctionSchedule> getAllAuctionSchedule() {
        return auctionScheduleRepository.findAll();
    }

    @Override
    public AuctionSchedule updateAuctionSchedule(AuctionSchedule auctionSchedule) {
        return auctionScheduleRepository.save(auctionSchedule);
    }
}
