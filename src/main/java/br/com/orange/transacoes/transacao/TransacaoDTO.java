package br.com.orange.transacoes.transacao;

import br.com.orange.transacoes.transacao.cartao.Cartao;
import br.com.orange.transacoes.transacao.estabelecimento.Estabelecimento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TransacaoDTO {

    private Long id;
    private Double valor;
    private Estabelecimento estabelecimento;
    private Cartao cartao;
    private LocalDateTime efetivadaEm;

    public TransacaoDTO(Transacao transacao) {
        this.id = transacao.getId();
        this.valor = transacao.getValor();
        this.estabelecimento = transacao.getEstabelecimento();
        this.cartao = transacao.getCartao();
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public Long getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }

    public static List<TransacaoDTO> toList(List<Transacao> transacoes) {
        List<TransacaoDTO> transacoesDto = new ArrayList<>();
        transacoes.forEach(transacao -> {
            transacoesDto.add(new TransacaoDTO(transacao));
        });
        return transacoesDto;
    }
}
