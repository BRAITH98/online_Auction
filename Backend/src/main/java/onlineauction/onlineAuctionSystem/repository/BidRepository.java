package onlineauction.onlineAuctionSystem.repository;

import onlineauction.onlineAuctionSystem.entity.Bid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BidRepository extends JpaRepository<Bid,Integer> {
}
