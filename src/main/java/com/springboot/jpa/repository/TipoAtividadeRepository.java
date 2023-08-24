package com.springboot.jpa.repository;

import com.springboot.jpa.model.TipoAtividade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TipoAtividadeRepository extends JpaRepository<TipoAtividade, UUID> {
}
