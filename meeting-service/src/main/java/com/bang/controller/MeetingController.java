package com.bang.controller;

import com.bang.model.Meeting;
import com.bang.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/v1/meeting")
public class MeetingController {

    @Autowired
    MeetingService meetingService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Meeting createMeeting(@RequestBody Meeting meeting) {
        Meeting newMeeting = meetingService.updateMeeting(meeting);
        return newMeeting;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Meeting> getAllMeetings() {
        return meetingService.getAllMeetings();
    }

    @RequestMapping("/{id}")
    public @ResponseBody Meeting getMeetingById(@PathVariable Long id) {
        return meetingService.getMeeting(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public @ResponseBody String deleteMeeting(
            @RequestParam  Long id
    ) {
        meetingService.deleteMeeting(id);

        return "Deleted\n";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody Meeting updateMeeting(@RequestBody Meeting Meeting) {
        Meeting updatedMeeting = meetingService.updateMeeting(Meeting);

        return updatedMeeting;
    }

}
