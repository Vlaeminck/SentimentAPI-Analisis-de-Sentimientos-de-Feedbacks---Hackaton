package com.sentiment.sentiment_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SentimentRequest {
    @NotBlank(message = "El campo 'text' es obligatorio")
    @Size(min = 5, message = "El campo 'text' debe tener al menos 5 caracteres")
    private String text;
}
