package com.restdojo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class InformPayload {
    private int askedBy;
    private Question question;
    private int answeredBy;
    // private Card answer;
}