package com.bang.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Meeting")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
