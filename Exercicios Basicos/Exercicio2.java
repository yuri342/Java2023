
import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args){
        System.out.println("-Grade Salarial-");
        System.out.println("-------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o 1°salario =");
        float s1 = input.nextInt();
        System.out.print("Digite o 2°salario =");
        float s2 = input.nextInt();
        System.out.print("Digite o 3°salario =");
        float s3 = input.nextInt();
        System.out.print("Digite o 4°salario =");
        float s4 = input.nextInt();
        float m = (s1+s2+s3+s4)/4;
        input.close();
        System.out.println("-------------------");
        System.out.println("Os salarios digitados foram:");
        System.out.println("1°salario =" + s1);
        System.out.println("2°salario =" + s2);
        System.out.println("3°salario =" + s3);
        System.out.println("4°salario =" + s4);
        System.out.println("-------------------");
        System.out.printf("A media dos salarios é = %.2f R$", m);
    }
}
