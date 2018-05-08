package com.bang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MeetingReply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long meetingId;
    private String reward;
    private String status;
    private Long userId;

}
