package com.forumhub.ForumHub.domain.topico.validacoes;

public record DadosAtualizacaoTopico import jakarta.validation.constraints.NotBlank;
        import jakarta.validation.constraints.NotNull;

        public record DadosAtualizacaoTopico(@NotNull String titulo, @NotNull, String mensagem) {
}
