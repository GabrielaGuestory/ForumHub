package com.forumhub.ForumHub.domain.topico.validacoes;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastrotopico(
        @NotBlank
        String titulo,
        @NotBlank
        String curso,
        @NotBlank
        String mensagem) {
}
