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

    private Long id;
    private Long meetingId;
    private String reward;
    private String status;
    private Long userId;

}
