public class PessoaJuridica extends Cliente {
    public String razaoSocial;
    public String CNPJ;
    public String inscricaoEstadual;
    public int capitalInicial;
    
    
    public String getRazaoSocial() {
        return this.razaoSocial;
    }
    
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public String getCNPJ() {
        return this.CNPJ;
    }
    
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public String getInscricaoEstadual() {
        return this.inscricaoEstadual;
    }
    
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    public int getCapitalInicial() {
        return this.capitalInicial;
    }
    
    public void setCapitalInicial(int capitalInicial) {
        this.capitalInicial = capitalInicial;
    }
    
    
}