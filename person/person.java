package person;

public class person {
    private String name;
    private int age;
    private String adress;
    private double salario;
     //nome
    public void setNome(String name){
        this.name = name;
    }
    public String getNome(){
        return this.name;
    }
    //idade
    public void setIdade(int age){
        this.age = age;
    }

    public int getIdade(){
        return this.age;
    }
    //salario
    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }
     //endereço
     public void setAdress(String adress){
        this.adress = adress;
    }

    public String getAdress(){
        return this.adress;
    }
    //mostrar DADOS
    public void showData(){
        System.out.printf("NOME = %s\n" ,this.getNome());
        System.out.printf("IDADE = %s\n" ,this.getIdade());
        System.out.printf("SALARIO = %s\n", this.getSalario());
        System.out.printf("ENDEREÇO = %s\n", this.getAdress());
    }
    //methods
    //primeiro
    public void falar(String nomeCliente, String nomePet){
        System.out.printf("%s : Venha buscar seu(a) %s",nomeCliente,nomePet);
    }   
    //segundo
    public boolean verificar(){
        if (this.getIdade() >= 18){
            return true;
        }else{
            return false;
        }
    }
    //terceiro
    public double gratificar(){
        if (this.getSalario() <= 1000){
            this.setSalario(getSalario() + 100);
        }
        return salario;
    }
}
