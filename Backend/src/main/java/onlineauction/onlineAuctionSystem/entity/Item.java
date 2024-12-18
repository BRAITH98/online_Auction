package onlineauction.onlineAuctionSystem.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Item {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int itemId;

        @ManyToOne
        @JoinColumn(name = "auction_id")
        private Auction auction;

        private String name;
        private String description;
        private double  startingPrice;
        private   double currentBid;

        @ManyToOne
        @JoinColumn(name = "highest_bidder_id", nullable = true)
        private User highestBidder;

        private String status;
        private LocalDateTime addedDate;


    public Item() {
    }

    public Item(int itemId, Auction auction, String name, String description, double startingPrice, double currentBid,
                User highestBidder, String status, LocalDateTime addedDate) {
        this.itemId = itemId;
        this.auction = auction;
        this.name = name;
        this.description = description;
        this.startingPrice = startingPrice;
        this.currentBid = currentBid;
        this.highestBidder = highestBidder;
        this.status = status;
        this.addedDate = addedDate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getStartingPrice() {
        return startingPrice;
    }

    public void setStartingPrice(double startingPrice) {
        this.startingPrice = startingPrice;
    }

    public double getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(double currentBid) {
        this.currentBid = currentBid;
    }

    public User getHighestBidder() {
        return highestBidder;
    }

    public void setHighestBidder(User highestBidder) {
        this.highestBidder = highestBidder;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", auction=" + auction +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", startingPrice=" + startingPrice +
                ", currentBid=" + currentBid +
                ", highestBidder=" + highestBidder +
                ", status='" + status + '\'' +
                ", addedDate=" + addedDate +
                '}';
    }
}
