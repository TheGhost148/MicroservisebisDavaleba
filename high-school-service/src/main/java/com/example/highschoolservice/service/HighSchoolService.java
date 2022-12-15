package com.example.highschoolservice.service;

import com.example.highschoolservice.VO.Program;
import com.example.highschoolservice.VO.ResponseTemplateVO;
import com.example.highschoolservice.entity.HighSchool;
import com.example.highschoolservice.repository.HighSchoolRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class HighSchoolService {
    @Autowired
    private HighSchoolRepository highSchoolRepository;

    @Autowired
    private RestTemplate restTemplate;

    public HighSchool saveHighSchool(HighSchool highSchool) {
        log.info("Inside saveHighSchool of HighSchoolService");
        return highSchoolRepository.save(highSchool);
    }

    public ResponseTemplateVO getHighSchoolWithProgram(Long highSchoolId) {
        log.info("Inside getHighSchoolWithProgram of HighSchoolService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        HighSchool highSchool = highSchoolRepository.findByHighSchoolId(highSchoolId);
        Program program = restTemplate.getForObject("http://PROGRAM-SERVICE/programs/" + highSchool.getProgramId(), Program.class);

        vo.setHighSchool(highSchool);
        vo.setProgram(program);

        return vo;
    }
}
