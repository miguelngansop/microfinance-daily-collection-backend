package com.sarki.micro.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarki.micro.model.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
	public List<?> findByOperationsCreatedAtEquals(Date aujourdui);
	public List<?> findByOperationsAgentAgenceId(Long idAgence);
	
}
