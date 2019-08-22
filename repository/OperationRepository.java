package com.sarki.micro.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import com.sarki.micro.model.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
}
