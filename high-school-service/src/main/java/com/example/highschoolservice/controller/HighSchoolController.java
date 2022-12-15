package com.example.highschoolservice.controller;

import com.example.highschoolservice.VO.ResponseTemplateVO;
import com.example.highschoolservice.entity.HighSchool;
import com.example.highschoolservice.service.HighSchoolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("highschools")
@Slf4j
public class HighSchoolController {

    @Autowired
    private HighSchoolService highSchoolService;

    @PostMapping("/")
    public HighSchool saveHighSchool(@RequestBody HighSchool highSchool) {
        log.info("Inside saveHighSchool of HighSchoolController");
        return highSchoolService.saveHighSchool(highSchool);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getHighSchoolWithProgram(@PathVariable("id") Long highSchoolId) {
        log.info("Inside getHighSchoolWithProgram of HighSchoolController");
        return highSchoolService.getHighSchoolWithProgram(highSchoolId);
    }

}
