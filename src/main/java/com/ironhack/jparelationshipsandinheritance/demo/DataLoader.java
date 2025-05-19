package com.ironhack.jparelationshipsandinheritance.demo;

import com.ironhack.jparelationshipsandinheritance.model.*;
import com.ironhack.jparelationshipsandinheritance.model.enums.Status;
import com.ironhack.jparelationshipsandinheritance.repository.AssociationRepository;
import com.ironhack.jparelationshipsandinheritance.repository.DivisionRepository;
import com.ironhack.jparelationshipsandinheritance.repository.MemberRepository;
import com.ironhack.jparelationshipsandinheritance.repository.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
@Profile("dev")
public class DataLoader implements CommandLineRunner {
    private final AssociationRepository associationRepository;
    private final DivisionRepository divisionRepository;
    private final MemberRepository memberRepository;
    private final TaskRepository taskRepository;

    public DataLoader(AssociationRepository associationRepository, DivisionRepository divisionRepository, MemberRepository memberRepository, TaskRepository taskRepository) {
        this.associationRepository = associationRepository;
        this.divisionRepository = divisionRepository;
        this.memberRepository = memberRepository;
        this.taskRepository = taskRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Loading data...");

        // Associations and Divisions

        var association1 = new Association("Nurses Association");
        var association2 = new Association("Doctors Association");
        associationRepository.saveAll(List.of(association1, association2));
        System.out.println("Two associations saved.");

        var division1 = new Division("Royal Division", "Westminster", "Queen Elizabeth", association1);
        var division2 = new Division("Victoria Division", "Victoria", "Queen Victoria", association1);
        var division3 = new Division("Balmoral Division", "Scotland", "King Charles III", association1);
        var division4 = new Division("Nightingale Division", "Nightingale", "Knight Guard", association1);
        var division5 = new Division("Yorkshire Division", "Yorkshire", "Yorkshire Terrier", association1);
        var division6 = new Division("Windsor Division", "Windsor", "Princess Margaret", association1);
        var division7 = new Division("Celtic Division", "Celtic Lands", "Celtic Shaman", association1);
        divisionRepository.saveAll(List.of(division1, division2, division3, division4, division5, division6, division7));
        System.out.println("Seven divisions saved.");

        var member1 = new Member("Queen Elizabeth", division1, Status.LAPSED, LocalDate.of(2021, 12, 12));
        var member2 = new Member("Queen Victoria", division2, Status.ACTIVE, LocalDate.of(2019, 9, 9));
        var member3 = new Member("King Charles III", division3, Status.ACTIVE, LocalDate.of(2030, 8, 19));
        var member4 = new Member("Knight Guard", division4, Status.ACTIVE, LocalDate.of(2031, 1, 17));
        var member5 = new Member("Yorkshire Terrier", division5, Status.ACTIVE, LocalDate.of(2022, 5, 22));
        var member6 = new Member("Princess Margaret", division6, Status.ACTIVE, LocalDate.of(2027, 8, 21));
        var member7 = new Member("Celtic Shaman", division7, Status.ACTIVE, LocalDate.of(2025, 8, 1));
        memberRepository.saveAll(List.of(member1, member2, member3, member4, member5, member6, member7));
        System.out.println("Seven members saved.");

        // Task Management

        var task1 = new Task("Sleeping", LocalDate.of(2025, 05, 17), true);
        var task2 = new Task("Eating", LocalDate.of(2025, 05, 18), true);
        var task3 = new Task("Watching the sunset", LocalDate.of(2025, 05, 19), true);
        taskRepository.saveAll(List.of(task1, task2, task3));
        System.out.println("Tasks saved.");
    }
}
