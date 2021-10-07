package br.com.orange.transacoes.transacao;

import br.com.orange.transacoes.exception.ObjetoErroDTO;
import br.com.orange.transacoes.exception.RegraNegocioException;
import br.com.orange.transacoes.transacao.Transacao;
import br.com.orange.transacoes.transacao.TransacaoRepository;
import br.com.orange.transacoes.transacao.cartao.Cartao;
import br.com.orange.transacoes.transacao.cartao.CartaoForm;
import br.com.orange.transacoes.transacao.estabelecimento.Estabelecimento;
import br.com.orange.transacoes.transacao.estabelecimento.EstabelecimentoForm;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public class TransacaoForm {

    private UUID id;
    private Double valor;
    private EstabelecimentoForm estabelecimento;
    private CartaoForm cartao;
    private LocalDateTime efetivadaEm;

    public Transacao toModel(TransacaoRepository repository) {
        if (repository.existsById(this.id)) {
            throw new RegraNegocioException(new ObjetoErroDTO("id", "Já existe uma transação com esse id."));
        }
        Estabelecimento estabelecimentoEntity = estabelecimento.toModel();
        Cartao cartaoEntity = cartao.toModel();
        return new Transacao(this.id, this.valor, estabelecimentoEntity, cartaoEntity, this.efetivadaEm);
    }

    public UUID getId() {
        return id;
    }

    public Double getValor() {
        return valor;
    }

    public EstabelecimentoForm getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoForm getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
