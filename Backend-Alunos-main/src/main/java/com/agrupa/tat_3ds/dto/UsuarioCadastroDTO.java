package com.agrupa.tat_3ds.dto;

import lombok.Data;

@Data
public class UsuarioCadastroDTO {

    private String nome;
    //MUDAMOS O TIPO DO SOBRENOME PARA STRING (ANTES ESTAVA INTERGER)
    private String sobrenome;
    private String hash;
}
