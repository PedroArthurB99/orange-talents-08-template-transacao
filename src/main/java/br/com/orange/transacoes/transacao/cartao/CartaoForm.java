package br.com.orange.transacoes.transacao.cartao;

public class CartaoForm {

    private String id;
    private String email;

    public Cartao toModel() {
        return new Cartao(this.id, this.email);
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
