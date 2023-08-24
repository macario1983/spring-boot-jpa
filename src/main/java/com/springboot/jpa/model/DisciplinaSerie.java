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
public class DisciplinaSerie {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_disciplina", referencedColumnName = "ID")
    @NotNull(message = "{error.validation.field.required}")
    private Disciplina disciplina;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_serie", referencedColumnName = "ID")
    @NotNull(message = "{error.validation.field.required}")
    private Serie serie;

    private LocalDateTime dataInsercao;

    private LocalDateTime dataAlteracao;

}
