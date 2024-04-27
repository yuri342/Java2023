package Estoque;

public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void repor(int qtd) {
        qtdAtual += qtd;
    }

    public void darBaixa(int qtd) {
        qtdAtual -= qtd;
    }

    public void mostrar() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Quantidade mínima: " + qtdMinima);
        System.out.println("Quantidade atual: " + qtdAtual);
    }

    public boolean precisaRepor() {
        return qtdAtual <= qtdMinima;
    }
}