public class Cliente {
    protected int codigoDoCliente;
    protected String nome;
    protected String profissao;
    
    public Cliente() {
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getProfissao() {
        return this.profissao;
    }
    
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public int getCodigoDoCliente() {
        return this.codigoDoCliente;
    }
    
    public void setCodigoDoCliente(int codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }
    
    @Override
    public String toString() {
        return "Codigo do Cliente: " + this.codigoDoCliente
             + "\nNome: " + this.nome;
    }
}