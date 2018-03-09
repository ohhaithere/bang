package com.bang.service.impl;

import com.bang.model.MeetingReply;
import com.bang.repository.MeetingResponseRepository;
import com.bang.service.MeetingResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingResponseServiceImpl implements MeetingResponseService{

    @Autowired
    MeetingResponseRepository meetingResponseRepository;

    @Override
    public MeetingReply createMeetingResponse(MeetingReply meetingReply) {
        return meetingResponseRepository.save(meetingReply);
    }

    @Override
    public MeetingReply updateMeetingResponse(MeetingReply meetingReply) {
        return meetingResponseRepository.save(meetingReply);
    }

    @Override
    public MeetingReply getMeetingResponse(Long id) {
        return meetingResponseRepository.findOne(id);
    }

    @Override
    public Iterable<MeetingReply> getAllMeetingResponses() {
        return meetingResponseRepository.findAll();
    }

    @Override
    public void deleteMeetingResponse(Long id) {
        meetingResponseRepository.delete(id);
    }
}
