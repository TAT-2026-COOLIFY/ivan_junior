package com.agrupa.tat_3ds.form;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Digits;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;
import org.aspectj.lang.annotation.DeclareAnnotation;

import java.util.List;

@Getter
public class RegistroForm {

    public String descricaoAtividade;

    @Digits(integer = 10, fraction = 0, message = "O valor deve ser número inteiro")
    public Integer quantidadeTotalAlunosSala;

    public List<GrupoForm> grupoForm;
}
