package onlineauction.onlineAuctionSystem.repository;

import onlineauction.onlineAuctionSystem.entity.Payments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentsRepository extends JpaRepository<Payments,Integer> {
}
