public class Cachorro extends Animal {
    public float peso;
    public float altura;
    public String cor;
    
    public float getPeso() {
        return this.peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getAltura() {
        return this.altura;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String brincar() {
        return "Dante buscou a bolinha!";
    }
    
    public String rolar() {
        return "Dante Rolou na grama!";
    }
    
}