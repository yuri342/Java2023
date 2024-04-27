package ContaCorrente;

public class ContaCorrente{
    private String nomeCliente;
    private String agencia;
    private double saldo;
    private String conta;
    private String menu = "1-Sacar\n"+ //Alexandre neugbauer me copiou
                          "2-Depositar\n"+
                          "3-Consultar\n"+
                          "4-Cadastrar\n"+
                          "5-SAIR\n";

    public String getMenu() {
        return menu;
    }

    public String getConta() {
        return conta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodos

    public int sacar(int saque){
       if (saque <= saldo){
            System.out.printf("SALDO = R$ %.2f\n", getSaldo());
            System.out.println("SAQUE");
            System.out.println("-------------");
            System.out.println("O saque Foi realizado");
            System.out.printf("\nSaldo antes = %.2f",getSaldo());
            setSaldo(getSaldo() - saque);
            System.out.printf("\nSaldo depois = %.2f",getSaldo());
            return 1;
       }else{
            System.out.println("Saldo insuficiente!!");
            return 0;
       }
    }

    public void Depositar(double A){
        setSaldo(getSaldo() + A);
    }

    public void imprimir(){
        System.out.println("DADOS DA CONTA");
        System.out.println("-----------------------");
        System.out.printf("NOME = %s\n",getNomeCliente());
        System.out.printf("SALDO = %.2f\n",getSaldo());
        System.out.printf("AGENCIA = %s\n",getAgencia());
        System.out.printf("CONTA ID = %s\n",getConta());
        System.out.println("-----------------------");
    }

    //meotod de limpar a tela
    public void limparW(){ //para windows
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void limparL(){ // para linux
        try {
            new ProcessBuilder("bash", "-c", "clear").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}