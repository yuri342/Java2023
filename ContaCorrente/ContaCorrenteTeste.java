package ContaCorrente;
import java.util.Scanner;
public class ContaCorrenteTeste{
    public static void main(String[] args) throws InterruptedException {
        int A = 1;
        boolean contacriada = false;
        Scanner input = new Scanner(System.in);
        ContaCorrente contaCorrente = new ContaCorrente();
        while (A < 4) {
            contaCorrente.limparW();
            System.out.println("CONTA_CORRENTE_TESTE");
            System.out.println("----------------------");
            System.out.println(contaCorrente.getMenu());
            System.out.print("Digite uma opção = ");
            int op = input.nextInt();
            switch (op) {
                case 1:
                    if (contacriada == false){
                        contaCorrente.limparW(); //caso nao estiver funcionando é pq voce esta usando linux so mudar o limparW() por limparL()
                        System.out.println("Crie a conta primeiro!!");
                        Thread.sleep(2000);
                        break;
                    }
                    contaCorrente.limparW();
                    System.out.println("SAQUE");
                    System.out.printf("Seu Saldo = R$.%.2f\n",contaCorrente.getSaldo());
                    System.out.println("---------------------");
                    System.out.print("Digite a quantiade a ser sacada = ");
                    contaCorrente.sacar(input.nextInt());
                    Thread.sleep(1000);
                break;
                case 2:
                    if (contacriada == false){
                        contaCorrente.limparW();
                        System.out.println("Crie a conta primeiro!!");
                        Thread.sleep(2000);
                        break;
                    }
                    contaCorrente.limparW();
                    System.out.println("DEPOSITAR");
                    System.out.println("---------------------");
                    System.out.printf("Seu Saldo = R$.%.2f\n",contaCorrente.getSaldo());
                    System.out.print("Digite a quantiade a ser depositada = ");
                    contaCorrente.Depositar(input.nextDouble());
                    Thread.sleep(2000);
                break;
                case 3:
                    contaCorrente.limparW();
                    if (contacriada == false){
                        contaCorrente.limparW();
                        System.out.println("Crie a conta primeiro!!");
                        Thread.sleep(2000);
                        break;
                    }
                    contaCorrente.imprimir();
                    Thread.sleep(3000);
                break;
                case 4:
                    System.out.println("Criar-Conta");
                    System.out.println("---------------------");
                    System.out.printf("Nome = ");
                    input.nextLine();
                    contaCorrente.setNomeCliente(input.nextLine());
                    System.out.print("Conta Id = ");
                    contaCorrente.setConta(input.nextLine());
                    System.out.print("Agencia = ");
                    contaCorrente.setAgencia(input.nextLine());
                    contacriada = true;
                break;
                case 5:
                    A = 5;
                    System.out.println("PROGRAMA FECHADO");
                    input.close();
                break;
            } 
        }
    }  
}
