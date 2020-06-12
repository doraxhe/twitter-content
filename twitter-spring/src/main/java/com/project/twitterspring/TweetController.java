package com.project.twitterspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // consume data via REST APIs, enabling the cross-domain communication
@RequestMapping() // map web requests to Spring Controller methods
public class TweetController {

    @Autowired // resolve and inject collaborating beans into your bean
    private TweetRepository tweetRepository;

    // Request: GET /tweets
    // Response: Tweet[]
    @GetMapping("/tweets")
    public List<Tweet> getAllTweets() {
        return tweetRepository.findAll();
    }

    // Request: GET /tweet/{id}
    // Response: Tweet
    @GetMapping("/tweet/{id}")
    public Tweet getTweetById(@PathVariable int id) {
        return tweetRepository.findById(id);
    }
}
