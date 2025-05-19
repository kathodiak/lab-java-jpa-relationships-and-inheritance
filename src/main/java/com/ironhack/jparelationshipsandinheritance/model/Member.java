package com.ironhack.jparelationshipsandinheritance.model;

import com.ironhack.jparelationshipsandinheritance.model.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private Division division;
    @Enumerated(EnumType.STRING)
    private Status status;
    private LocalDate renewalDate;

    public Member() {}

    public Member(String name, Division division, Status status, LocalDate renewalDate) {
        this.name = name;
        this.division = division;
        this.status = status;
        this.renewalDate = renewalDate;
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

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(LocalDate renewalDate) {
        this.renewalDate = renewalDate;
    }
}