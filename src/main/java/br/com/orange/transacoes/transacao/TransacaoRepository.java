package br.com.orange.transacoes.transacao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TransacaoRepository extends JpaRepository<Transacao, UUID> {

    Boolean existsByNumero(String numero);

    List<Transacao> findTop10ByCartaoNumeroOrderByEfetivadaEmAsc(String numero);

}
