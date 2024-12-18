package onlineauction.onlineAuctionSystem.repository;

import onlineauction.onlineAuctionSystem.entity.AuctionSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionScheduleRepository extends JpaRepository<AuctionSchedule,Integer> {
}
