package Exercicio_1;
public class Professor extends Funcionario{
    public Professor(String Nome, String SobreNome, double Salario) {
        super(Nome, SobreNome, Salario);
    }

    public double salarioPrimeiraParcela(){
        return getSalário();
    }

    public double salarioSegundaParcela(){
        return 0;
    }
}

/*Uma subclasse de Funcionário, chamada Professor. Todo professor recebe seu salário em uma
única parcela. Assim, deve-se sobrescrever os métodos salarioPrimeiraParcela e
salarioSegundaParcela. O método salarioPrimeiraParcela da classe Professor deve retornar o valor
integral do salário do professor e o método salarioSegundaParcela do professor deve retornar o
valor zero */