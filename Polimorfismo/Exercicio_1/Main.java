package Exercicio_1;

public class Main {
    public static void main(String args[]) {
        UsaPessoa Pessoas = new UsaPessoa();
        System.out.println("Exibir os NomesCompletos() dos 3 objetos");
        System.out.println("------------------------------------------");
        System.out.println("1-" + Pessoas.pessoa1.NomeCompleto());
        System.out.println("2-" + Pessoas.pessoa2.NomeCompleto());
        System.out.println("3-" + Pessoas.pessoa3.NomeCompleto());
        System.out.println("------------------------------------------");
        System.out.println("Exibir as parcelas do salario da 2 e 3 pessoa");
        System.out.println("------------------------------------------");
        System.out.println("1-Funcionario");
        System.out.println("1ºParecela = " + Pessoas.pessoa2.salarioPrimeiraParcela());
        System.out.println("1ºParecela = " + Pessoas.pessoa2.salarioSegundaParcela());
        System.out.println("2-Professor");
        System.out.println("1ºParecela = " + Pessoas.pessoa3.salarioPrimeiraParcela());
        System.out.println("1ºParecela = " + Pessoas.pessoa3.salarioSegundaParcela());
    }
}
