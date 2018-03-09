package com.bang.model;

import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    Integer id;
    @Column(name = "statusname")
    String statusName;

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
