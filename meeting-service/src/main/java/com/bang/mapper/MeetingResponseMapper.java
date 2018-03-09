package com.bang.mapper;

import com.bang.dto.MeetingResponseDto;
import com.bang.model.MeetingReply;
import fr.xebia.extras.selma.Mapper;

@Mapper
public interface MeetingResponseMapper {

    MeetingResponseDto asMeetingResponseDto(MeetingReply in);

}
