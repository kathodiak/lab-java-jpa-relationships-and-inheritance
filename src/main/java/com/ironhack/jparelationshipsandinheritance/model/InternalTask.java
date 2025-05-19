package com.ironhack.jparelationshipsandinheritance.model;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class InternalTask extends Task{

    public InternalTask() {}

    public InternalTask(String title, LocalDate date, boolean completed) {
        super(title, date, completed);
    }


}
