package onlineauction.onlineAuctionSystem.controller;


import onlineauction.onlineAuctionSystem.entity.Feedback;
import onlineauction.onlineAuctionSystem.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }
    @PostMapping("/addFeedback")
    public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback){

        return new ResponseEntity<Feedback>(feedbackService.addFeedback(feedback), HttpStatus.CREATED);
    }

    @GetMapping("/getFeedback")
    public List<Feedback> getAllFeedback(){
        return feedbackService.getAllFeedback();
    }
}
