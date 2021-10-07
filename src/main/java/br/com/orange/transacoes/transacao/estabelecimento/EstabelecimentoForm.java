package br.com.orange.transacoes.transacao.estabelecimento;

public class EstabelecimentoForm {

    private String nome;
    private String cidade;
    private String endereco;

    public Estabelecimento toModel() {
        return new Estabelecimento(this.nome, this.cidade, this.endereco);
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
}
