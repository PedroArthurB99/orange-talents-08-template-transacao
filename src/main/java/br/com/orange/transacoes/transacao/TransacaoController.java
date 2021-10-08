package br.com.orange.transacoes.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoRepository repository;

    @GetMapping
    @RequestMapping("/{id}")
    public List<TransacaoDTO> listarDez(@PathVariable("id") String numeroCartao) {
        List<Transacao> transacoes = this.repository.findTop10ByCartaoNumeroOrderByEfetivadaEmAsc(numeroCartao);
        return TransacaoDTO.toList(transacoes);
    }

}
