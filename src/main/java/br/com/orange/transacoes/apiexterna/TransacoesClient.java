package br.com.orange.transacoes.apiexterna;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "sistema-transacoes", url = "${feign.client.api-externa-transacoes}")
public interface TransacoesClient {

    @PostMapping
    public void gerarEstimulo();

}
