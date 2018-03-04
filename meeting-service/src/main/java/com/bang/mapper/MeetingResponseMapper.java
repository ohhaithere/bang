package com.bang.mapper;

import com.bang.dto.MeetingResponseDto;
import com.bang.model.MeetingResponse;
import fr.xebia.extras.selma.Mapper;

@Mapper
public interface MeetingResponseMapper {

    MeetingResponseDto asMeetingResponseDto(MeetingResponse in);

}
