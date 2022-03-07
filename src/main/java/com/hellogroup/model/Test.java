package com.hellogroup.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name="test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Participant1> participant1;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<MeetingDetails> meetingDetails;
}
