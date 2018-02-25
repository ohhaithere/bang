package com.bang.service;

import com.bang.model.Meeting;

import java.util.ArrayList;

public interface MeetingService {

    Meeting createMeeting(Meeting meeting);

    Meeting updateMeeting(Meeting meeting);

    Meeting getMeeting(Long id);

    Iterable<Meeting> getAllMeetings();

    void deleteMeeting(Long id);

}
