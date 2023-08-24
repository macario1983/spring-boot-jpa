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
public class Serie {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank(message = "{error.validation.field.required}")
    private String nome;

    @Positive
    @Min(value = 3, message = "{error.validation.field.min}")
    @Max(value = 17, message = "{error.validation.field.max}")
    @NotNull(message = "{error.validation.field.required}")
    private int idade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipo_serie", referencedColumnName = "ID")
    @NotNull(message = "{error.validation.field.required}")
    private TipoSerie tipoSerie;

    private LocalDateTime dataInsercao;

    private LocalDateTime dataAlteracao;

}

