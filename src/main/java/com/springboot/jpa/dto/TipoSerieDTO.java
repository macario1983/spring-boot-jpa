package com.springboot.jpa.dto;


import jakarta.validation.constraints.NotBlank;

public record TipoSerieDTO(
        String id,
        @NotBlank(message = "{error.validation.field.required}")
        String nome) {
}
