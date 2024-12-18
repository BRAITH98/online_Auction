package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Payments;

import java.util.List;

public interface PaymentImpl {

    Payments addPayments(Payments payments);

    List<Payments> getAllPayments();
    Payments updatePayments(Payments payments);
}
