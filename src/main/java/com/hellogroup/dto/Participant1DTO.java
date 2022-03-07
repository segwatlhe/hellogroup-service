package com.hellogroup.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class Participant1DTO {
    private String firstName;
    private String surname;
    private String email;
    private String participantID;
}
