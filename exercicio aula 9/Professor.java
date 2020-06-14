public class Professor extends Pessoa {
    public int numeroDeRegistro;
    public int horasTrabalhadas;
    public double valorHora;
    
    public int getNumeroDeRegistro() {
        return this.numeroDeRegistro;
    }
    
    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }
    
    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double getValorHora() {
        return this.valorHora;
    }
        
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    public double calcularSalarioBruto() {
        return this.valorHora * this.horasTrabalhadas;
    }
    
    public double calcularFGTS() {
        return this.calcularSalarioBruto() * 0.14;
    }
    
}