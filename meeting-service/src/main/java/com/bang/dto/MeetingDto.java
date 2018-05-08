package com.bang.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MeetingDto {

    Long id;
    String status;
    Date creationDate;
    String counterOffer;
    String description;
    Long takerId;
    Long giverId;
    Integer giversRate;
    Integer takersRate;
}
