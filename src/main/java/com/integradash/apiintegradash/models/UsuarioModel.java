package com.integradash.apiintegradash.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "tb_usuario")
public class UsuarioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    private UUID id_estrategia;

    private String nome_usuario;
    private int telefone;
    private String email;
    private String senha;

    // private String url_img;

    // Provisóriamente String, será alterado para TipoModel enum

    
}
