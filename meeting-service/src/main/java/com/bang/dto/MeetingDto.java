package com.bang.dto;

import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCounterOffer() {
        return counterOffer;
    }

    public void setCounterOffer(String counterOffer) {
        this.counterOffer = counterOffer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTakerId() {
        return takerId;
    }

    public void setTakerId(Long takerId) {
        this.takerId = takerId;
    }

    public Long getGiverId() {
        return giverId;
    }

    public void setGiverId(Long giverId) {
        this.giverId = giverId;
    }

    public Integer getGiversRate() {
        return giversRate;
    }

    public void setGiversRate(Integer giversRate) {
        this.giversRate = giversRate;
    }

    public Integer getTakersRate() {
        return takersRate;
    }

    public void setTakersRate(Integer takersRate) {
        this.takersRate = takersRate;
    }
}
