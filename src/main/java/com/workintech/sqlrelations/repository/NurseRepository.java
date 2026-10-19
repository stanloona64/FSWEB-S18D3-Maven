package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Nurse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NurseRepository extends JpaRepository<Nurse, Long> {
}
