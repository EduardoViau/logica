public class Aluno extends Pessoa {
    public double nota1;
    public double nota2;
    
    
    public double getNota1() {
        return this.nota1;
    }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    
    public double getNota2() {
        return this.nota2;
    }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double calcularMedia() {
        return (this.nota1 + this.nota2) / 2;
    }
    
    
    
}
