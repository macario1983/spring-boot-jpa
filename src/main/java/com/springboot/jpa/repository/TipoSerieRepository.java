package com.springboot.jpa.repository;

import com.springboot.jpa.model.TipoSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipoSerieRepository extends JpaRepository<TipoSerie, UUID> {
}
