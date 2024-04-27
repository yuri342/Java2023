
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a altura da parede (em unidades): ");
        double hp = scanner.nextDouble();

        System.out.print("Informe a largura da parede (em unidades): ");
        double lp = scanner.nextDouble();

        System.out.print("Informe a altura do azulejo (em unidades): ");
        double ha = scanner.nextDouble();

        System.out.print("Informe a largura do azulejo (em unidades): ");
        double la = scanner.nextDouble();

        // Calculando a quantidade de azulejos
        double areaParede = hp * lp;
        double areaAzulejo = ha * la;

        int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

        // Exibindo o resultado
        System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);

        scanner.close();
    }
}