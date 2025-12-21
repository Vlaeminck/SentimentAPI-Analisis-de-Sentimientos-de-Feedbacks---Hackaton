package com.sentiment.sentiment_api.service;

import com.sentiment.sentiment_api.dto.SentimentRequest;
import com.sentiment.sentiment_api.dto.SentimentResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SentimentService {

    private static final Logger logger = LoggerFactory.getLogger(SentimentService.class);

    public SentimentResponse analyze(SentimentRequest request) {
        // Logging input
        logger.info("Texto recibido: {}", request.getText());

        // Mock logic (Phase 1)
        String prevision = "Positivo";
        double probabilidad = 0.82;

        // Logging output
        logger.info("Resultado devuelto: prevision={}, probabilidad={}", prevision, probabilidad);

        return new SentimentResponse(prevision, probabilidad);
    }
}
