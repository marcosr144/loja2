package loja;

public class Telefone extends Cliente {
    private String ddd;
    private String numero;

    public Telefone(int id) {
        super(id);
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}
