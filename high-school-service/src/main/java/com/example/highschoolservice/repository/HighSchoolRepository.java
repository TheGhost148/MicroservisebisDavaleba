package com.example.highschoolservice.repository;

import com.example.highschoolservice.entity.HighSchool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighSchoolRepository extends JpaRepository<HighSchool,Long> {
    HighSchool findByHighSchoolId(Long highSchoolId);
}
