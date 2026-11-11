package com.agrupa.tat_3ds.controller;

import com.agrupa.tat_3ds.dto.UsuarioCadastroDTO;
import com.agrupa.tat_3ds.models.Usuario;
import com.agrupa.tat_3ds.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public ResponseEntity<Object> cadastrarUsuario(@Valid @RequestBody UsuarioCadastroDTO dto) {
        try {
            Usuario UsuarioSalvo = usuarioService.cadastrar(dto);

            return ResponseEntity.status(HttpStatus.CREATED).body(UsuarioSalvo);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
