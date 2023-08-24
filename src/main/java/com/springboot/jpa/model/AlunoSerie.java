package com.springboot.jpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class AlunoSerie {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_aluno", nullable = false)
    @NotNull(message = "{error.validation.field.required}")
    private Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_serie", nullable = false)
    @NotNull(message = "{error.validation.field.required}")
    private Serie serie;

    private LocalDateTime dataInsercao;

    private LocalDateTime dataAlteracao;

}
