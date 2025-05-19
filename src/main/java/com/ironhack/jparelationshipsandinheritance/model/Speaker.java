package com.ironhack.jparelationshipsandinheritance.model;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int presentationDurantion;

    public Speaker() {}

    public Speaker(String name, int presentationDurantion) {
        this.name = name;
        this.presentationDurantion = presentationDurantion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresentationDurantion() {
        return presentationDurantion;
    }

    public void setPresentationDurantion(int presentationDurantion) {
        this.presentationDurantion = presentationDurantion;
    }
}