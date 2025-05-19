package com.ironhack.jparelationshipsandinheritance.repository;

import com.ironhack.jparelationshipsandinheritance.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
