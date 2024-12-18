package onlineauction.onlineAuctionSystem.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class AuctionSchedule {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int scheduleId;

        @ManyToOne
        @JoinColumn(name = "auction_id")
        private Auction auction;

        private LocalDateTime scheduledDate;
        private int rescheduleCount;
        private String status;

    public AuctionSchedule() {
    }

    public AuctionSchedule(int scheduleId, Auction auction, LocalDateTime scheduledDate,
                           int rescheduleCount, String status) {
        this.scheduleId = scheduleId;
        this.auction = auction;
        this.scheduledDate = scheduledDate;
        this.rescheduleCount = rescheduleCount;
        this.status = status;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Auction getAuction() {
        return auction;
    }

    public void setAuction(Auction auction) {
        this.auction = auction;
    }

    public LocalDateTime getScheduledDate() {
        return scheduledDate;
    }

    public void setScheduledDate(LocalDateTime scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public int getRescheduleCount() {
        return rescheduleCount;
    }

    public void setRescheduleCount(int rescheduleCount) {
        this.rescheduleCount = rescheduleCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AuctionSchedule{" +
                "scheduleId=" + scheduleId +
                ", auction=" + auction +
                ", scheduledDate=" + scheduledDate +
                ", rescheduleCount=" + rescheduleCount +
                ", status='" + status + '\'' +
                '}';
    }
}
