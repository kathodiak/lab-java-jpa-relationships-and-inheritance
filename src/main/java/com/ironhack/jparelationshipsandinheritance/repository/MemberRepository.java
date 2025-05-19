package com.ironhack.jparelationshipsandinheritance.repository;

import com.ironhack.jparelationshipsandinheritance.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
