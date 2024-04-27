import java.util.Scanner;

public  class Exercicio1{
	public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("-Conversor de C° para K°,F°,Re°,Ra°-");
            System.out.println("-------------------------------------------------------------");
            System.out.print("Digite o Valor da temperatura em C°:");
            float C = input.nextInt();
            input.close();  
            float K = (float) (C + 273.15);
            float F = (float) (C * 1.8 + 32);
            float Re = (float) ( C * 0.8);
            float Ra = (float) (C * 1.8 + 32 + 459.67);
            System.out.println("-----------------------------------------------------------");
            System.out.printf("%.1f°C em °F = %.1f \n", C, F);
            System.out.printf("%.1f°C em °K = %.1f \n", C, K);
            System.out.printf("%.1f°C em °Re = %.1f \n", C, Re);
            System.out.printf("%.1f°C em °Ra = %.1f \n", C, Ra);
         }
}