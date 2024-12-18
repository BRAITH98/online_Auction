package onlineauction.onlineAuctionSystem.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Feedback {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int feedbackId;

        @ManyToOne
        @JoinColumn(name = "user_id")
        private User user;

        @ManyToOne
        @JoinColumn(name = "auction_id", nullable = true)
        private Auction auction;

        private int rating;
        private String comments;
        private LocalDateTime submittedDate;

    public Feedback() {
    }

    public Feedback(int feedbackId, User user, Auction auction, int rating,
                    String comments, LocalDateTime submittedDate) {
        this.feedbackId = feedbackId;
        this.user = user;
        this.auction = auction;
        this.rating = rating;
        this.comments = comments;
        this.submittedDate = submittedDate;
    }

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public LocalDateTime getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(LocalDateTime submittedDate) {
        this.submittedDate = submittedDate;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", user=" + user +
                ", auction=" + auction +
                ", rating=" + rating +
                ", comments='" + comments + '\'' +
                ", submittedDate=" + submittedDate +
                '}';
    }
}
