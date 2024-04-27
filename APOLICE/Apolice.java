package APOLICE;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private double valorPremio;
    
    public int getIdade() {
        return idade;
    }
    public String getNomeSegurado() {
        return nomeSegurado;
    }
    public double getValorPremio() {
        return valorPremio;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }
    public void setValorPremio(double valorPremio) {
        this.valorPremio = valorPremio;
    }
    public Apolice(String nomeSegurado, int idade, double valorPremio) {
        this.nomeSegurado = nomeSegurado;
        this.idade = idade;
        this.valorPremio = valorPremio;
    }


    // Método para imprimir os atributos da Apolice
    public void imprimir() {
        System.out.println("Nome do Segurado: " + nomeSegurado);
        System.out.println("Idade: " + idade);
        System.out.println("Valor do Prêmio: R$" + valorPremio);
    }

    // Método para calcular o prêmio da Apolice com base na idade
    public void calcularPremioApolice() {
        if (idade >= 18 && idade <= 25) {
            valorPremio += valorPremio * 0.20; // Acrescenta 20% ao prêmio
        } else if (idade > 25 && idade <= 36) {
            valorPremio += valorPremio * 0.15; // Acrescenta 15% ao prêmio
        } else if (idade > 36) {
            valorPremio += valorPremio * 0.10; // Acrescenta 10% ao prêmio
        }
    }

    // Método para oferecer desconto com base na cidade
    public void oferecerDesconto(String cidade) {
        switch (cidade) {
            case "Curitiba":
                valorPremio -= valorPremio * 0.20; // Desconto de 20%
                break;
            case "Rio de Janeiro":
                valorPremio -= valorPremio * 0.15; // Desconto de 15%
                break;
            case "São Paulo":
                valorPremio -= valorPremio * 0.10; // Desconto de 10%
                break;
            case "Belo Horizonte":
                valorPremio -= valorPremio * 0.05; // Desconto de 5%
                break;
            default:
                System.out.println("Cidade não elegível para desconto.");
        }
    }
}
