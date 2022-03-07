package com.hellogroup.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class MeetingDetailsDTO {
    private Boolean mandatory;
    private Boolean organiser;
}
