package com.ironhack.jparelationshipsandinheritance.controller;

import com.ironhack.jparelationshipsandinheritance.model.Association;
import com.ironhack.jparelationshipsandinheritance.model.Division;
import com.ironhack.jparelationshipsandinheritance.model.Member;
import com.ironhack.jparelationshipsandinheritance.service.NurseAssociationDivisionService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/divisions")
public class NursesAssociationDivisionServiceController {
    private final NurseAssociationDivisionService nurseAssociationDivisionService;

    public NursesAssociationDivisionServiceController(NurseAssociationDivisionService nurseAssociationDivisionService) {
        this.nurseAssociationDivisionService = nurseAssociationDivisionService;
    }

    @PostMapping("/associations")
    @ResponseStatus(HttpStatus.CREATED)
    public Association createAssociation(@RequestBody Association association) {
        return nurseAssociationDivisionService.createAssociation(association);
    }

    @PostMapping("/divisions")
    @ResponseStatus(HttpStatus.CREATED)
    public Division createDivision(@RequestBody Division division) {
        return nurseAssociationDivisionService.createDivision(division);
    }

    @PostMapping("/members")
    @ResponseStatus(HttpStatus.CREATED)
    public Member createMember(@RequestBody Member member) {
        return nurseAssociationDivisionService.createMember(member);
    }

    @GetMapping("/associations")
    public List<Association> findAllAssociations() {
        return nurseAssociationDivisionService.findAllAssociations();
    }

    @GetMapping("/divisions")
    public List<Division> findAllDivisions() {
        return nurseAssociationDivisionService.findAllDivisions();
    }

    @GetMapping("members")
    public List<Member> findAllMembers() {
        return nurseAssociationDivisionService.findAllMembers();
    }

    @GetMapping("/associations/{associationId}/divisions")
    public List<Division> getDivisionsByAssociation(@PathVariable Long associationId) {
        return nurseAssociationDivisionService.findDivisionsByAssociationId(associationId);
    }
}
