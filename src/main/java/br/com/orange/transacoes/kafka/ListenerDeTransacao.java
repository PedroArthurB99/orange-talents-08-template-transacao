package br.com.orange.transacoes.kafka;

import br.com.orange.transacoes.transacao.Transacao;
import br.com.orange.transacoes.transacao.TransacaoRepository;
import br.com.orange.transacoes.transacao.TransacaoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerDeTransacao {

    @Autowired
    private TransacaoRepository repository;

    @KafkaListener(topics = "${spring.kafka.topic.transactions}")
    public void ouvir(TransacaoForm transacaoForm) {
        Transacao transacao = transacaoForm.toModel(this.repository);
        this.repository.save(transacao);
    }
}
