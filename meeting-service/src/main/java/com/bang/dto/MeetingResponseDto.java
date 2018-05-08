package com.bang.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MeetingResponseDto {

    Long id;
    Long meetingId;
    String reward;
    String status;
    Long userId;

}
