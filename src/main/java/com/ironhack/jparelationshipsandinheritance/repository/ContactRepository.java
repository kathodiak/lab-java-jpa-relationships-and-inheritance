package com.ironhack.jparelationshipsandinheritance.repository;

import com.ironhack.jparelationshipsandinheritance.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
