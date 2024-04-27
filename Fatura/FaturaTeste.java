package Fatura;

public class FaturaTeste {
    public static void main(String[] args) {
        // Criando uma instância de Fatura
        Fatura fatura1 = new Fatura(1001, "Teclado USB", 3, 25.99);

        // Acessando e exibindo informações da fatura
        System.out.println("Número da Fatura: " + fatura1.getNumeroFatura());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade Comprada: " + fatura1.getQuantidadeComprada());
        System.out.println("Preço por Item: $" + fatura1.getPrecoPorItem());

        // Calculando e exibindo o valor total da fatura
        double total = fatura1.totalFatura();
        System.out.println("Total da Fatura: $" + total);

        // Alterando a quantidade comprada
        fatura1.setQuantidadeComprada(5);

        // Calculando e exibindo o novo valor total da fatura
        total = fatura1.totalFatura();
        System.out.println("Novo Total da Fatura: $" + total);
    }
}