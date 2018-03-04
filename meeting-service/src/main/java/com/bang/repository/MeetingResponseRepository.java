package com.bang.repository;

import com.bang.model.MeetingResponse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingResponseRepository extends CrudRepository<MeetingResponse, Long> {
}
