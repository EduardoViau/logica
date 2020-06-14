public class Calculadora {
    private double numero1;
    private double numero2;
    public double getNumero1() {
        return this.numero1;
    }
    
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    
    public double getNumero2() {
        return this.numero2;
    }
    
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double somar() {
        return this.numero1 + this.numero2;
    }
    
    public double subtrair() {
        return this.numero1 - this.numero2;
    }
    
    public double multiplicar() { 
        return this.numero1 * this.numero2;
    }
    
    public double dividir() {
        return this.numero1 / this.numero2;
    }
    
    @Override
    public String toString(){
      return ("numero 1: " + this.getNumero1()
           + "\nNumero 2: " + this.getNumero2()
           + "\nSoma: " + this.somar()
           + "\nSubtracao: " + this.subtrair()
           + "\nMultiplicacao: " + this.multiplicar()
           + "\nDivisao: " + this.dividir());
    }
}