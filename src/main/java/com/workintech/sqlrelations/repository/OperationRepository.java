package com.workintech.sqlrelations.repository;

import com.workintech.sqlrelations.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}
