package com.agrupa.tat_3ds.form;

import jakarta.validation.constraints.Digits;
import lombok.Getter;

@Getter
public class GrupoForm {

    @Digits(integer = 10, fraction = 0, message = "O valor deve ser número inteiro")
    public Integer quantidadeMaximaAluno;

    public String nomeGrupo;

    public String atividade;

    public String descricao;

}
