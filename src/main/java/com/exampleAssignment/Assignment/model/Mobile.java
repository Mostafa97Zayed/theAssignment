package com.exampleAssignment.Assignment.model;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity

public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String priceEur;

    private String simEu;

    private String  announceDate;

    public Mobile() {
    }

    public Mobile(Long id, String priceEur, String sim, String  announceDate) {
        this.id = id;
        this.priceEur = priceEur;
        this.simEu = sim;
        this.announceDate = announceDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPriceEur() {
        return priceEur;
    }

    public void setPriceEur(String priceEur) {
        this.priceEur = priceEur;
    }

    public String getSim() {
        return simEu;
    }

    public void setSim(String sim) {
        this.simEu = sim;
    }

    public String getAnnounceDate() {
        return announceDate;
    }

    public void setAnnounceDate(String announceDate) {
        this.announceDate = announceDate;
    }
}
