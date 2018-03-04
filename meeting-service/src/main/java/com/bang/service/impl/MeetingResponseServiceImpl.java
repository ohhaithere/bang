package com.bang.service.impl;

import com.bang.model.MeetingResponse;
import com.bang.repository.MeetingResponseRepository;
import com.bang.service.MeetingResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingResponseServiceImpl implements MeetingResponseService{

    @Autowired
    MeetingResponseRepository meetingResponseRepository;

    @Override
    public MeetingResponse createMeetingResponse(MeetingResponse meetingResponse) {
        return meetingResponseRepository.save(meetingResponse);
    }

    @Override
    public MeetingResponse updateMeetingResponse(MeetingResponse meetingResponse) {
        return meetingResponseRepository.save(meetingResponse);
    }

    @Override
    public MeetingResponse getMeetingResponse(Long id) {
        return meetingResponseRepository.findOne(id);
    }

    @Override
    public Iterable<MeetingResponse> getAllMeetingResponses() {
        return meetingResponseRepository.findAll();
    }

    @Override
    public void deleteMeetingResponse(Long id) {
        meetingResponseRepository.delete(id);
    }
}
