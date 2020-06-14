public class Pessoa{
    private String nome;
    private double PI = 3.14;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        if(nome.length >= 2) {
        this.nome = nome;
    } else {
        this.nome = "Nome nao informado";
    }
}
}