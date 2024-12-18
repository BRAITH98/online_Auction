package onlineauction.onlineAuctionSystem.repository;

import onlineauction.onlineAuctionSystem.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Integer> {

}
