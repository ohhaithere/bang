package com.bang.controller;

import com.bang.dto.MeetingDto;
import com.bang.mapper.MeetingMapper;
import com.bang.model.Meeting;
import com.bang.service.MeetingService;
import fr.xebia.extras.selma.Selma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/api/v1/meeting")
public class MeetingController {

    @Autowired
    private MeetingService meetingService;

    @PostMapping
    public @ResponseBody MeetingDto createMeeting(@RequestBody Meeting meeting) {
        Meeting newMeeting = meetingService.createMeeting(meeting);
        MeetingMapper mapper = Selma.builder(MeetingMapper.class).build();
        return mapper.asMeetingDto(newMeeting);
    }

    @GetMapping
    public @ResponseBody
    Iterable<Meeting> getAllMeetings() {
        return meetingService.getAllMeetings();
    }

    @GetMapping("/{id}")
    public @ResponseBody Meeting getMeetingById(@PathVariable Long id) {
        return meetingService.getMeeting(id);
    }

    @DeleteMapping
    public @ResponseBody String deleteMeeting(@RequestParam  Long id) {
        meetingService.deleteMeeting(id);
        return "Deleted\n";
    }

    @PutMapping
    public @ResponseBody MeetingDto updateMeeting(@RequestBody Meeting meeting) {
        Meeting updatedMeeting = meetingService.updateMeeting(meeting);
        MeetingMapper mapper = Selma.builder(MeetingMapper.class).build();
        return mapper.asMeetingDto(updatedMeeting);
    }

}
