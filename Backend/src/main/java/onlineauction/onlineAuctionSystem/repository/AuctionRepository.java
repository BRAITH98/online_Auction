package onlineauction.onlineAuctionSystem.repository;

import onlineauction.onlineAuctionSystem.entity.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends JpaRepository<Auction,Integer> {
}
