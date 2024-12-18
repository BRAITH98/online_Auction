package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Auction;
import onlineauction.onlineAuctionSystem.entity.User;
import onlineauction.onlineAuctionSystem.repository.AuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuctionService implements AuctionImpl{

    @Autowired
    private final AuctionRepository auctionRepository;

    public AuctionService(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }


    @Override
    public Auction addAuction(Auction auction) {
        return auctionRepository.save(auction);
    }

    @Override
    public List<Auction> getAllAuctions() {
        return auctionRepository.findAll();
    }

    @Override
    public Auction findById(int id) {
        Optional<Auction> auction = auctionRepository.findById(id);

        if (auction.isPresent()) {
            return auction.get();

        }else{
            throw new IllegalStateException("Auction with id:  " + id + " already exists");
        }
    }
    @Override
    public void deleteAuction(int id) {
        auctionRepository.findById(id).orElseThrow();
        new IllegalStateException("Auction with id: "+id+" does not exist");
        auctionRepository.deleteById(id);
    }
}
