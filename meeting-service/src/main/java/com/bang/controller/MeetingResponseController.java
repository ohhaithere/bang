package com.bang.controller;

import com.bang.dto.MeetingResponseDto;
import com.bang.mapper.MeetingResponseMapper;
import com.bang.model.MeetingResponse;
import com.bang.service.MeetingResponseService;
import fr.xebia.extras.selma.Selma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/api/v1/meetingResponse")
public class MeetingResponseController {

    @Autowired
    MeetingResponseService meetingResponseService;

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    MeetingResponseDto createMeetingResponse(@RequestBody MeetingResponse meetingResponse) {
        MeetingResponse newMeetingResponse = meetingResponseService.createMeetingResponse(meetingResponse);

        MeetingResponseMapper mapper = Selma.builder(MeetingResponseMapper.class).build();
        MeetingResponseDto meetingResponseDto = mapper.asMeetingResponseDto(newMeetingResponse);

        return meetingResponseDto;
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Iterable<MeetingResponse> getAllMeetingResponses() {
        return meetingResponseService.getAllMeetingResponses();
    }

    @RequestMapping("/{id}")
    public @ResponseBody MeetingResponse getMeetingResponseById(@PathVariable Long id) {
        return meetingResponseService.getMeetingResponse(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public @ResponseBody String deleteMeetingResponse(@RequestParam  Long id) {
        meetingResponseService.deleteMeetingResponse(id);
        return "Deleted\n";
    }

    @RequestMapping(method = RequestMethod.PUT)
    public @ResponseBody MeetingResponseDto updateMeetingResponse(@RequestBody MeetingResponse meetingResponseeeting) {
        MeetingResponse updatedMeetingResponse = meetingResponseService.updateMeetingResponse(meetingResponseeeting);

        MeetingResponseMapper mapper = Selma.builder(MeetingResponseMapper.class).build();
        MeetingResponseDto meetingResponseDto = mapper.asMeetingResponseDto(updatedMeetingResponse);

        return meetingResponseDto;
    }

}
