package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurgeryRepository extends JpaRepository<Surgery, Long> {
}
