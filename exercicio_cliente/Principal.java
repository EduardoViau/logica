public class Principal {
    public static void main(String args[]) {
        System.out.println("\f");
        
        Cliente cliente = new Cliente();
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        
        
        pessoaJuridica.setNome("Car House Toyota Matriz");
        pessoaJuridica.setCodigoDoCliente(21504);
        pessoaJuridica.setCNPJ("94.673.480/0001-03");
        pessoaJuridica.setRazaoSocial("CAR HOUSE VEICULOS LTDA");
        pessoaJuridica.setInscricaoEstadual("096/2286508");
        pessoaJuridica.setCapitalInicial(25000);
        
        System.out.println(pessoaJuridica
                         + "\nRazao Social: "
                         + pessoaJuridica.getRazaoSocial()
                         + "\nCNPJ: " + pessoaJuridica.getCNPJ()
                         + "\nInscricao Estadual: "
                         + pessoaJuridica.getInscricaoEstadual()
                         + "\nCapital Inicial: "
                         + pessoaJuridica.getCapitalInicial());
                         
        pessoaFisica.setNome("Eduardo");
        pessoaFisica.setCodigoDoCliente(22000);
        pessoaFisica.setEstadoCivil("Solteiro");
        pessoaFisica.setCPF("051.349.450-20");
        pessoaFisica.setDataDeNascimento("23/05/2002");
        
        System.out.println("\n" + pessoaFisica
                         + "\nEstado Civil: "
                         + pessoaFisica.getEstadoCivil()
                         + "\nCPF: " + pessoaFisica.getCPF()
                         + "\nData de nascimento: "
                         + pessoaFisica.getDataDeNascimento());
        
    }
}
    