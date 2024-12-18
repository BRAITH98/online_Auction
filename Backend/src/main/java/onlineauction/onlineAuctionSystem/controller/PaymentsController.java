package onlineauction.onlineAuctionSystem.controller;


import onlineauction.onlineAuctionSystem.entity.Payments;
import onlineauction.onlineAuctionSystem.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class PaymentsController {

    @Autowired
    private PaymentService paymentService;

    public PaymentsController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/addPayment")
    public ResponseEntity<Payments> addPayment(@RequestBody Payments payments) {

        return new ResponseEntity<Payments>(paymentService.addPayments(payments), HttpStatus.CREATED);
    }

    @GetMapping("/getPayments")
    public List<Payments> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @PutMapping("{id}")
    public ResponseEntity<Payments> updatePayments(@PathVariable("id") int id
            , @RequestBody Payments payments) {
        return new ResponseEntity<>(paymentService.updatePayments(payments), HttpStatus.OK);
    }
}
