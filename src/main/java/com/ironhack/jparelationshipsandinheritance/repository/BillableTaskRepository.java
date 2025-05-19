package com.ironhack.jparelationshipsandinheritance.repository;

import com.ironhack.jparelationshipsandinheritance.model.BillableTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillableTaskRepository extends JpaRepository<BillableTask, Long> {
}
