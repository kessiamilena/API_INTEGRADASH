package com.integradash.apiintegradash.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(
        @NotBlank String nome_usuario,
        @NotBlank int telefone,
        @NotBlank @Email(message = "O email deve estar em um formato válido") String email,
        @NotBlank String senha

//        String url_img
) {
}