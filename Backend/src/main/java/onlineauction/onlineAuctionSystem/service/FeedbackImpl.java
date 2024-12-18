package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Feedback;

import java.util.List;

public interface FeedbackImpl {

    Feedback addFeedback(Feedback feedback);
    List<Feedback> getAllFeedback();
}
