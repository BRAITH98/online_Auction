package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Bid;
import onlineauction.onlineAuctionSystem.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BidService implements BidImpl {

    @Autowired
    private BidRepository bidRepository;

    public BidService(BidRepository bidRepository) {
        this.bidRepository = bidRepository;
    }

    @Override
    public Bid addBid(Bid bid) {
        return bidRepository.save(bid);
    }

    @Override
    public List<Bid> getAllBids() {
        return bidRepository.findAll();
    }

    @Override
    public Bid getBidById(int id) {
        Optional<Bid> bid = bidRepository.findById(id);

        if (bid.isPresent()) {
            return bid.get();

        }else{
            throw new IllegalStateException("Bid with id:  " + id + " already exists");
        }
    }

    @Override
    public void deleteBid(int id) {
        bidRepository.findById(id).orElseThrow();
        new IllegalStateException("Bid with id: "+id+" does not exist");
        bidRepository.deleteById(id);
    }
}
