public class Main {
    public static void main(String args[]) {
        System.out.println("\f");
        
        Animal animal = new Animal();
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        
        gato.setNome("Bartolomeu");
        gato.setIdade(4);
        gato.setCor("Cinza");
        gato.setCorDoOlho("Castanho");
        gato.setPeso(4);
        
        System.out.println(gato + "\nCor do Gato: " + gato.getCor()
                         + "\nCor dos olhos: " + gato.getCorDoOlho()
                         + "\nPeso: " + gato.getPeso()
                         + "\n" + gato.escalar()
                         + "\n" + gato.presa());
        
        cachorro.setNome("Dante");
        cachorro.setIdade(13);
        cachorro.setPeso(8);
        cachorro.setCor("Preto");
        cachorro.setAltura(54);
        
        System.out.println("\n" + cachorro + "\nCor do Cachorro: " + cachorro.getCor()
                         + "\nAltura: " + cachorro.getAltura() + "cm"
                         + "\nPeso: " + cachorro.getPeso()
                         + "\n" + cachorro.brincar()
                         + "\n" + cachorro.rolar());
       
    }
}