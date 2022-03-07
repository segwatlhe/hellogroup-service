package com.hellogroup.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class TestDTO {
   // private Long id;
    private List<Participant1DTO> participant1;
    private List<MeetingDetailsDTO> meetingDetails;

    public TestDTO(List<Participant1DTO> participant1, List<MeetingDetailsDTO> meetingDetails) {
      //  this.id = id;
        this.participant1 = participant1;
        this.meetingDetails = meetingDetails;
    }
}
