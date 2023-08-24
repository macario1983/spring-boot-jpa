package com.springboot.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Aluno {

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

    @Email(message = "{error.validation.field.email}")
    private String email;

    @NotBlank(message = "{error.validation.field.required}")
    @Pattern(regexp = "^[MF]$", message = "{error.validation.field.sexo}")
    private String sexo;

    private LocalDateTime dataInsercao;

    private LocalDateTime dataAlteracao;

}
