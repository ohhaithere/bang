package com.bang.service;

import com.bang.model.MeetingResponse;
import org.springframework.stereotype.Service;

@Service
public interface MeetingResponseService {

    MeetingResponse createMeetingResponse(MeetingResponse meetingResponse);

    MeetingResponse updateMeetingResponse(MeetingResponse meetingResponse);

    MeetingResponse getMeetingResponse(Long id);

    Iterable<MeetingResponse> getAllMeetingResponses();

    void deleteMeetingResponse(Long id);

}
