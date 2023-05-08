package loja;

public class Cliente extends Pessoa{
    private int id;
    private Pessoa pessoa;
    private Endereco endereco;
    private Telefone telefone;

    public Cliente(String nome, String dataDeNascimento) {
        super(nome, dataDeNascimento);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
    
    
}
