package Fatura;

public class Fatura {
    private int numeroFatura;
    private String descricao;
    private int quantidadeComprada;
    private double precoPorItem;

    public Fatura(int numeroFatura, String descricao, int quantidadeComprada, double precoPorItem) {
        this.numeroFatura = numeroFatura;
        this.descricao = descricao;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }

    public int getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(int numeroFatura) {
        this.numeroFatura = numeroFatura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double totalFatura() {
        return quantidadeComprada * precoPorItem;
    }
}

