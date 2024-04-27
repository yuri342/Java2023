package Estoque;

public class MainEstoque {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque("Produto A", 20, 10);
        Estoque estoque2 = new Estoque("Produto B", 5, 15);
        Estoque estoque3 = new Estoque("Produto C", 12, 8);

        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(4);

        boolean precisaRepor1 = estoque1.precisaRepor();
        boolean precisaRepor2 = estoque2.precisaRepor();
        boolean precisaRepor3 = estoque3.precisaRepor();

        System.out.println("Precisa repor estoque1: " + precisaRepor1);
        System.out.println("Precisa repor estoque2: " + precisaRepor2);
        System.out.println("Precisa repor estoque3: " + precisaRepor3);

        System.out.println("\nInformações dos estoques:");
        estoque1.mostrar();
        estoque2.mostrar();
        estoque3.mostrar();
    }
}