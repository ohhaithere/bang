package com.bang.service;

import com.bang.model.MeetingReply;
import org.springframework.stereotype.Service;

@Service
public interface MeetingResponseService {

    MeetingReply createMeetingResponse(MeetingReply meetingReply);

    MeetingReply updateMeetingResponse(MeetingReply meetingReply);

    MeetingReply getMeetingResponse(Long id);

    Iterable<MeetingReply> getAllMeetingResponses();

    void deleteMeetingResponse(Long id);

}
