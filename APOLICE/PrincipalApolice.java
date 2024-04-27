package APOLICE;
public class PrincipalApolice {
    public static void main(String[] args) {
        // Criar um objeto da classe Apolice e atribuir valores coerentes aos atributos
        Apolice apolice = new Apolice("João", 30, 1000.0);
        
        // Executar o método imprimir() e analisar o que será impresso na tela
        apolice.imprimir();
        // Executar o método calcularPremioApolice()
        apolice.calcularPremioApolice();
        
        // Executar o método imprimir() novamente e analisar o que será exibido na tela
        apolice.imprimir();
        
        // Executar o método oferecerDesconto() passando como parâmetro a cidade de Curitiba
        apolice.oferecerDesconto("Curitiba");
        
        // Executar o método imprimir() novamente e analisar o que será exibido na tela
        apolice.imprimir();
        
        // Altere o parâmetro para outras cidades e analise o resultado
        apolice.oferecerDesconto("Rio de Janeiro");
        apolice.imprimir();
    }
}