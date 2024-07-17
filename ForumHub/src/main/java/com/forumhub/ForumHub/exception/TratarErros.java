package com.forumhub.ForumHub.exception;

import com.forumhub.ForumHub.domain.topico.validacoes.ValidadorNaoHaDuplicidade;
import com.forumhub.ForumHub.domain.usuario.ValidacaoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class TratarDeErros {
    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity<String> tratarErroRegraDeNegocio(ValidacaoException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
