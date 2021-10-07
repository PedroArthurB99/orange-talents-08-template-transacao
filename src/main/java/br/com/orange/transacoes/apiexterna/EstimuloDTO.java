package br.com.orange.transacoes.apiexterna;

public class EstimuloDTO {

    private String id;
    private String email;

    @Deprecated
    public EstimuloDTO() {
    }

    public EstimuloDTO(String id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
