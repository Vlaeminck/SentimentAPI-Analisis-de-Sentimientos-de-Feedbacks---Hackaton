package com.sentiment.sentiment_api.controller;

import com.sentiment.sentiment_api.dto.SentimentRequest;
import com.sentiment.sentiment_api.dto.SentimentResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sentiment")
public class SentimentController {

    private final com.sentiment.sentiment_api.service.SentimentService sentimentService;

    public SentimentController(com.sentiment.sentiment_api.service.SentimentService sentimentService) {
        this.sentimentService = sentimentService;
    }

    @PostMapping
    public SentimentResponse analyzeSentiment(@jakarta.validation.Valid @RequestBody SentimentRequest request) {
        return sentimentService.analyze(request);
    }
}
