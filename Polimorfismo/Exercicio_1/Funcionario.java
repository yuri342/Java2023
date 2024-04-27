package Exercicio_1;
public class Funcionario extends Pessoa {
    private int matricula;
    private double salario;
    
    public Funcionario(String Nome, String SobreNome, double salario){
        super(Nome, SobreNome);
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }
    public double getSalário() {
        return salario;
    }
    

    public void setSalário(double salario) {
        this.salario = salario;
        if (this.salario < 0){
            setSalário(0);
        }
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    //metodos//

    public double salarioPrimeiraParcela(){
        return (this.salario * 60)/100;
    }

    public double salarioSegundaParcela(){
        return (this.salario * 40)/100;
    }
}


/*b) Uma subclasse de Pessoa, chamada Funcionario. A classe Funcionário deve ter os atributos
matricula (tipo int) e salário (tipo double), com seus respectivos métodos para leitura e alteração
(getters e setters). O salário de um funcionário jamais poderá ser negativo. Todo funcionário recebe
seu salário em duas parcelas, sendo 60% na primeira parcela e 40% na segunda parcela. Assim,
escreva os métodos salarioPrimeiraParcela que retorna o valor da primeira parcela do salário (60%)
e salarioSegundaParcela que retorna o valor da segunda parcela do salário (40%).*/

