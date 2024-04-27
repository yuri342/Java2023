package GAME;
import java.util.Scanner;
public class Player {
    //caracteristicas/stats//
    private String nome;
    private int level;
    private int points;
    private double exp;
    private int força;
    private int stamina;
    private int  mana;
    private int magia;
    private int vida;
    private int defesa;
    private boolean vM;
    private double MaxVida;
    private double MaxExp;
    Scanner input = new Scanner(System.in);
    Menus menuS = new Menus();

    public void setMaxExp(double MaxExp){
        this.MaxExp = MaxExp;
    }


     
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setvM(boolean vM){
        this.vM = vM;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setPoints(int points){
        this.points = points;
    }
    //gets
    public double getMaxExp(){
        return MaxExp;
    }

    public String getNome() {
        return nome;
    }

    public int getLevel() {
        return level;
    }

    public double getExp() {
        return exp;
    }

    public int getForça() {
        return força;
    }

    public int getStamina() {
        return stamina;
    }

    public int getMana() {
        return mana;
    }

    public int getMagia() {
        return magia;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa() {
        return defesa;
    }
    
    public int getPoints() {
        return points;
    }

    public boolean getvM(){
        return vM;
    }

    public double getMaxVida(){
        return MaxVida;
    }

    public void setMaxVida(double d){
        this.MaxVida = d;
    }

    //methods
    public void VidaMaxVerifcador(){
        if (getMaxVida() > getVida()){
           double c = (getMaxVida() - getVida());
           setMaxVida(getMaxVida() - c);
        }
    }

    public void editarStatus() throws InterruptedException{
        while (getPoints() > 0) {
            menuS.limparW();
            System.out.println("Escolha qual status deseja editar:");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("1. Força = " + getForça());
            System.out.println("2. Stamina = " + getStamina());
            System.out.println("3. Mana = " + getMana());
            System.out.println("4. Magia = " + getMagia());
            System.out.println("5. Vida = " + getVida());
            System.out.println("6. Defesa = " + getDefesa());
            System.out.println("-----------------------------------------------------------------------\n");
            System.out.printf("Seus Pontos = %d%n", getPoints());
            System.out.print("Digite o Numero referente ao status desejado:");
            int opcao = input.nextInt();
            System.out.println("-----------------------------------------------------------------------\n");
            System.out.print("Digite quantos pontos quer adicionar:");
            int novoValor = input.nextInt();
    
            if (novoValor <= getPoints()) {
                setPoints(getPoints() - novoValor);
                switch (opcao) {
                    case 1:
                        setForça(getForça() + novoValor);
                        break;
                    case 2:
                        setStamina(getStamina() + novoValor);
                        break;
                    case 3:
                        setMana(getMana() + novoValor);
                        break;
                    case 4:
                        setMagia(getMagia() + novoValor);
                        break;
                    case 5:
                        setVida(getVida() + novoValor);
                        setMaxVida(getVida()*10);
                        break;
                    case 6:
                        setDefesa(getDefesa() + novoValor);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        setPoints(getPoints() + novoValor);
                }
            } else {
                System.out.println("Você não tem pontos suficientes para adicionar esse valor.");
                Thread.sleep(1000);
            }
        }
        System.out.println("Você não tem mais pontos para gastar.");
        Thread.sleep(1000);
    }

    public void Upar(double exp){
        setExp(getExp() + exp);
        int Lp;
        Lp = getLevel() * 500 ;
        setMaxExp(Lp);
        if (getExp() >= Lp){
            setLevel(getLevel() + 1);
            setPoints(getPoints() + Lp/10);
            System.out.println("\nLEVEL UP = "+ getLevel());
        }
    }

    public void Atacar(Monters Monstros){
        Monstros.setMaxVida(Monstros.getMaxVida() - getForça()*getLevel());
        System.out.printf("Voce atacou -%d De Dano Fisico ",getForça()*getLevel());
    }

    public void DEFENDER(){
        if (getDefesa() >= 100){
            System.out.printf("\nVocê se defedendeu, recuperou %.0f de vida!!", (getDefesa()*0.25));
            setMaxVida(getMaxVida()+(getDefesa()*0.25)); 
        }else{
            System.out.printf("\nVocê se defedendeu, recuperou %.0f vida!!", (getDefesa()*0.50));
            setMaxVida(getMaxVida()+(getDefesa()*0.50));   
        }
    }

    public void Morrer(){
        if (getMaxVida() <= 0){
            setvM(false);
        }
    }
}
