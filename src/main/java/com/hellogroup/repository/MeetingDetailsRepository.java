package com.hellogroup.repository;

import com.hellogroup.model.MeetingDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingDetailsRepository extends JpaRepository<MeetingDetails, Long> {
}
