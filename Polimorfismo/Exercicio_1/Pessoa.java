package Exercicio_1;
public class Pessoa {
    private String Nome;
    private String SobreNome;
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getSobreNome() {
        return SobreNome;
    }
    public void setSobreNome(String sobreNome) {
        SobreNome = sobreNome;
    }

    public String NomeCompleto(){
        String NomeCompleto = this.Nome + " " +this.SobreNome;
        return NomeCompleto;
    }

    public Pessoa(){
        this.Nome = "Nome Padrão";
        this.SobreNome = "Sobrenome Padrão";
    }

    public Pessoa(String Nome,String SobreNome){
        this.Nome = Nome;
        this.SobreNome = SobreNome;
    }
}
