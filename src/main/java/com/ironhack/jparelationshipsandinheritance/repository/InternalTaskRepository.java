package com.ironhack.jparelationshipsandinheritance.repository;

import com.ironhack.jparelationshipsandinheritance.model.InternalTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternalTaskRepository extends JpaRepository<InternalTask, Long> {
}
