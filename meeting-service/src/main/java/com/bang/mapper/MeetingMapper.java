package com.bang.mapper;

import com.bang.dto.MeetingDto;
import com.bang.model.Meeting;
import fr.xebia.extras.selma.Field;
import fr.xebia.extras.selma.Mapper;

@Mapper
public interface MeetingMapper {

    MeetingDto asMeetingDto(Meeting in);

}
