package com.springboot.jpa.dto;


import jakarta.validation.constraints.NotBlank;

public record TipoAtividadeDTO(
        String id,
        @NotBlank(message = "{error.validation.field.required}")
        String nome) {
}
