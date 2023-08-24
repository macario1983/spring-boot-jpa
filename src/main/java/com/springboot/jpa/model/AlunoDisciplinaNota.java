package com.springboot.jpa.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class AlunoDisciplinaNota {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull(message = "{error.validation.field.required}")
    private AlunoSerie alunoSerie;

    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull(message = "{error.validation.field.required}")
    private DisciplinaSerie disciplinaSerie;

    @NotNull(message = "{error.validation.field.required}")
    @DecimalMin(value = "0.0", inclusive = true, message = "{error.validation.field.min}")
    @DecimalMax(value = "10.0", inclusive = true, message = "{error.validation.field.max}")
    private Double nota;

    @Positive
    @NotNull(message = "{error.validation.field.required}")
    @Min(value = 1, message = "{error.validation.field.min}")
    @Max(value = 4, message = "{error.validation.field.max}")
    private int periodo;

    @NotBlank(message = "{error.validation.field.required}")
    private String descricao;

    private LocalDateTime dataInsercao;

    private LocalDateTime dataAlteracao;

}
