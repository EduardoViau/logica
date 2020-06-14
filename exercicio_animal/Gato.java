public class Gato extends Animal {
    public String cor;
    public String corDoOlho;
    public float peso;
    
    public String getCor() {
        return this.cor;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public String getCorDoOlho() {
        return this.corDoOlho;
    }
    
    public void setCorDoOlho(String corDoOlho) {
        this.corDoOlho = corDoOlho;
    }
    
    public float getPeso() {
        return this.peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public String escalar() {
        return "O Bartolomeu Subiu o muro!";
    }
    
    public String presa() {
        return "Bartolomeu trouxe um rato morto!";
    }
    
}