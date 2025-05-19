package com.ironhack.jparelationshipsandinheritance.service;


import com.ironhack.jparelationshipsandinheritance.model.Association;
import com.ironhack.jparelationshipsandinheritance.model.Division;
import com.ironhack.jparelationshipsandinheritance.model.Member;
import com.ironhack.jparelationshipsandinheritance.repository.AssociationRepository;
import com.ironhack.jparelationshipsandinheritance.repository.DivisionRepository;
import com.ironhack.jparelationshipsandinheritance.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseAssociationDivisionService {
    private final AssociationRepository associationRepository;
    private final DivisionRepository divisionRepository;
    private final MemberRepository memberRepository;

    public NurseAssociationDivisionService(AssociationRepository associationRepository, DivisionRepository divisionRepository, MemberRepository memberRepository) {
        this.associationRepository = associationRepository;
        this.divisionRepository = divisionRepository;
        this.memberRepository = memberRepository;
    }

    public Association createAssociation(Association association) {
        return associationRepository.save(association);
    }

    public Division createDivision(Division division) {
        return divisionRepository.save(division);
    }

    public Member createMember(Member member) {
        return memberRepository.save(member);
    }

    public List<Association> findAllAssociations() {
        return associationRepository.findAll();
    }

    public List<Division> findAllDivisions() {
        return divisionRepository.findAll();
    }

    public List<Member> findAllMembers() {
        return memberRepository.findAll();
    }

    public List<Division> findDivisionsByAssociationId(Long associationId) {
        return divisionRepository.findByAssociationId(associationId);
    }
}