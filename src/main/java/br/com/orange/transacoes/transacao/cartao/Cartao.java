package br.com.orange.transacoes.transacao.cartao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID codigo;

    private String numero;

    private String email;

    @Deprecated
    public Cartao() {}

    public Cartao(String numero, String email) {
        this.numero = numero;
        this.email = email;
    }

    public UUID getCodigo() {
        return codigo;
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }
}
