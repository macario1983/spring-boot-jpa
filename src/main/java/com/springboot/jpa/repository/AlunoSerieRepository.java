package com.springboot.jpa.repository;

import com.springboot.jpa.model.AlunoSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AlunoSerieRepository extends JpaRepository<AlunoSerie, UUID> {

}
