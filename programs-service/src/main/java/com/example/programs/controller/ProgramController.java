package com.example.programs.controller;

import com.example.programs.entity.Program;
import com.example.programs.service.ProgramService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/programs")
@Slf4j
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @PostMapping("/")
    public Program saveProgram(@RequestBody Program program) {
        log.info("Inside saveProgram of ProgramController");
        return programService.saveProgram(program);
    }

    @GetMapping("/{id}")
    public Program findProgramById(@PathVariable("id") Long programId) {
        log.info("Inside findProgramById of ProgramController");
        return programService.findProgramById(programId);
    }
}
