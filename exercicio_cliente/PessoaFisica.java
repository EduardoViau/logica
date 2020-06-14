public class PessoaFisica extends Cliente {
    public String estadoCivil;
    public String CPF;
    public String dataDeNascimento;
    
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    public String getCPF() {
        return this.CPF;
    }
    
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }
    
    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}