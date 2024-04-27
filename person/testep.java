package person;

public class testep {
    public static void main(String[] args) {
        
        // Criar um objeto da classe 'person'
        person pessoa1 = new person();
         
        // Configurar os atributos usando os métodos de configuração (setters)
        pessoa1.setNome("João");
        pessoa1.setIdade(25);
        pessoa1.setSalario(900.0);
        pessoa1.setAdress("Rua A, 123");

        // Acessar os atributos usando os métodos de acesso (getters)
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Salário: " + pessoa1.getSalario());
        System.out.println("Endereço: " + pessoa1.getAdress());

        // Chamar o método showData para mostrar todos os dados
        pessoa1.showData();
        
        // Chamar o método falar
        pessoa1.falar("evaristo","cachorro");
             
        // Verificar se a pessoa é maior de 18 anos
        if (pessoa1.verificar()) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("É menor de idade.");
        }
        // Chamar o método gratificar
        System.out.println("Salário antes da gratificação: " + pessoa1.getSalario());
        pessoa1.gratificar();
        System.out.println("Salário depois da gratificação: " + pessoa1.getSalario());
    
    }
}