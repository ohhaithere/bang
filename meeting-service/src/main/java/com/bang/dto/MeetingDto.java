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

    private Long id;
    private String status;
    private Date creationDate;
    private String counterOffer;
    private String description;
    private Long takerId;
    private Long giverId;
    private Integer giversRate;
    private Integer takersRate;
}
