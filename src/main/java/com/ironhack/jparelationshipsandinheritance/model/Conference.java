package com.ironhack.jparelationshipsandinheritance.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Conference extends Event{
    @OneToMany
    @JoinTable(
            name = "conference_speaker",
            joinColumns = @JoinColumn(name = "conference_id"),
            inverseJoinColumns = @JoinColumn(name = "speaker_id")
    )
    private List<Speaker> speakersList = new ArrayList<>();

    public Conference() {
        super();
    }

    public Conference(String title, LocalDateTime date, int duration, String location, List<Speaker> speakersList) {
        super(title, date, duration, location);
        this.speakersList = speakersList;
    }

    public List<Speaker> getSpeakersList() {
        return speakersList;
    }

    public void setSpeakersList(List<Speaker> speakersList) {
        this.speakersList = speakersList;
    }
}