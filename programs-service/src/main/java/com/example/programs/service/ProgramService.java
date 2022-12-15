package com.example.programs.service;

import com.example.programs.entity.Program;
import com.example.programs.repository.ProgramRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    public Program saveProgram(Program program) {
        log.info("saveProgram of ProgramService");
        return programRepository.save(program);
    }

    public Program findProgramById(Long programId) {

        return programRepository.findByProgramId(programId);
    }
}
