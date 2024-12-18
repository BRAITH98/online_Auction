package onlineauction.onlineAuctionSystem.service;

import onlineauction.onlineAuctionSystem.entity.Payments;
import onlineauction.onlineAuctionSystem.repository.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService  implements PaymentImpl{

    @Autowired
    private PaymentsRepository paymentsRepository;

    public PaymentService(PaymentsRepository paymentsRepository) {
        this.paymentsRepository = paymentsRepository;
    }


    @Override
    public Payments addPayments(Payments payments) {
        return paymentsRepository.save(payments);
    }

    @Override
    public List<Payments> getAllPayments() {
        return paymentsRepository.findAll();
    }

    @Override
    public Payments updatePayments(Payments payments) {
        return paymentsRepository.save(payments);
    }
}
