package com.restdojo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GiveAnswerPayload {
    private int askedBy;
    private Question question;
}
