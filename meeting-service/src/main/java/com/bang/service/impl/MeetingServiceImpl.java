package com.bang.service.impl;

import com.bang.model.Meeting;
import com.bang.repository.MeetingRepository;
import com.bang.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MeetingServiceImpl implements MeetingService{

    @Autowired
    MeetingRepository meetingRepository;

    @Override
    public Meeting createMeeting(Meeting meeting) {
        meeting.setCreationDate(new Date());
        return meetingRepository.save(meeting);
    }

    @Override
    public Meeting updateMeeting(Meeting meeting) {
        return meetingRepository.save(meeting);
    }

    @Override
    public Meeting getMeeting(Long id) {
        return meetingRepository.findOne(id);
    }

    @Override
    public Iterable<Meeting> getAllMeetings() {
        return meetingRepository.findAll();
    }

    @Override
    public void deleteMeeting(Long id) {
        meetingRepository.delete(id);
    }
}
