package com.example.highschoolservice.entity;

import com.example.highschoolservice.VO.Program;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HighSchool {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long highSchoolId;

    private Long programId;
}
