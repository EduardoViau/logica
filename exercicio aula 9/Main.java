public class Main {
    public static void main(String args[]) {
        
        System.out.println("\f");
        
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        
        aluno.setNome("Dudis");
        aluno.setSobrenome("Viau");
        aluno.setEmail("edumax34@gmail.com");
        aluno.setDataDeNascimento("23/02/2002");
        aluno.setNota1(9);
        aluno.setNota2(8);
        
        
        
        System.out.println(aluno + "\nNota: " + aluno.getNota1()
                         + "\nNota2: " + aluno.getNota2()
                         + "\nMedia Final: " + aluno.calcularMedia());
                         
                         
                         
        professor.setNome("Thiago");
        professor.setSobrenome("Cury");
        professor.setEmail("omaisbrabodaQI@gmail.com");
        professor.setDataDeNascimento("1000 a.C (asdasdfas meme) 10/11/1983");
        professor.setNumeroDeRegistro(52378430);
        professor.setHorasTrabalhadas(160);
        professor.setValorHora(40.0);
        
        
        System.out.println("\n" + professor
                         + "\nNumero de Registro: "
                         + professor.getNumeroDeRegistro()
                         + "\nHoras trabalhadas: "
                         + professor.getHorasTrabalhadas()
                         + "\nValorHora: " +professor.getValorHora()
                         + "\nSalario Bruto: "
                         + professor.calcularSalarioBruto()
                         + "\nFGTS: " + professor.calcularFGTS());
        
                         
        
        funcionario.setNome("Karmen");
        funcionario.setSobrenome("Santos");
        funcionario.setEmail("karmasantos@gmail.com");
        funcionario.setDataDeNascimento("12/10/1984");
        funcionario.setNumeroDeRegistro(52378550);
        funcionario.setSalarioFixo(2350.0);
        
        System.out.println("\n" + funcionario
                         + "\nNumero de Registro: "
                         + funcionario.getNumeroDeRegistro()
                         + "\nSalario fixo: "
                         + funcionario.getSalarioFixo()
                         + "\nFGTS: "
                         + funcionario.calcularFGTS());
        
        
        
        
        
        
        
    }
    
}