package com.example.programs.repository;

import com.example.programs.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramRepository extends JpaRepository<Program, Long> {

    Program findByProgramId(Long programId);
}
