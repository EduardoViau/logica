public class Funcionario extends Pessoa {
    public int numeroDeRegistro;
    public double salarioFixo;
    
    public int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public double getSalarioFixo() {
        return this.salarioFixo;
    }
    
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public double calcularFGTS() {
        return this.salarioFixo * 0.12;
    }
}