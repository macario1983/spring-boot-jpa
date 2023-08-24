package com.springboot.jpa.repository;

import com.springboot.jpa.model.DisciplinaSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DisciplinaSerieRepository extends JpaRepository<DisciplinaSerie, UUID> {
}
