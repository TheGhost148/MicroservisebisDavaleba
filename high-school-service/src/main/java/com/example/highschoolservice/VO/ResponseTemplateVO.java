package com.example.highschoolservice.VO;

import com.example.highschoolservice.entity.HighSchool;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private HighSchool highSchool;
    private Program program;
}
