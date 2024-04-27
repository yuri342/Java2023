package GAME;
import java.util.Scanner;
public class maig {
    public static void main(String[] args) throws InterruptedException {
      Menus menuS = new Menus();
      Player Jogador = new Player();
      Scanner input = new Scanner(System.in);
      Monters Monstros = new Monters();
      menuS.limparW();
      System.out.println("RPG-Solo_Leveling");
      System.out.println("-=-==-=-=--=--=-=-=-=-=-=-=-=-==--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--=");
      System.out.println(menuS.getMenu1());
      Thread.sleep(2000);
      menuS.limparW();
      System.out.println(menuS.getMenu2());
      System.out.println("----------------------------------------------------------------------------------------------");
      System.out.println(menuS.getMenu3());
      System.out.print("Digite uma opção:");
      int M = input.nextInt();
      while ((M > 2 ) | (M < 1)) {
        menuS.limparW();
        System.out.println(menuS.getMenu2());
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(menuS.getMenu3());
        System.out.println("DIGITE UM VALOR VALIDO!!");
        System.out.print("Digite uma opção:");
        M = input.nextInt();
      }
      switch(M){
        case 1 :
          System.out.println("-----------------------------------------------------------------------------------------------------");
          System.out.println("Em um mundo envolto em sombras e mist\u00E9rios, nosso her\u00F3i solit\u00E1rio encontra-se ");
          System.out.println("aprisionado em um calabou\u00E7o infinito. Armado com coragem e determina\u00E7\u00E3o, ele enfrenta ");
          System.out.println("hordas intermin\u00E1veis de criaturas sombrias e desafios amea\u00E7adores. A cada queda, ele ");
          System.out.println("renasce do come\u00E7o, um eterno prel\u00FAdio, buscando respostas para o enigma que o liga a ");
          System.out.println("essa pris\u00E3o sem fim, enquanto sua for\u00E7a e vontade s\u00E3o testadas at\u00E9 o limite.");
          M = 2;
          Thread.sleep(5000);
        case 2:
            menuS.limparW();
            System.out.println(menuS.getMenu2());
            System.out.println("----CRIADOR DE PERSONAGEM----");
            Jogador.setPoints(100);
            Jogador.setVida(1500);
            Jogador.setLevel(1);
            Jogador.setForça(200);
            Jogador.setDefesa(100);
            Jogador.setvM(true);
            Jogador.editarStatus();
            Jogador.setMaxVida(Jogador.getVida());
            Monstros.setAlive(true);
            menuS.limparW();
            break;
      }
      Monstros.MontersSet(Jogador);
      while ((Jogador.getvM() == true) || (Monstros.getAlive() == true)) {
        Jogador.VidaMaxVerifcador();
        menuS.limparW();
        System.out.print(Monstros.getSprite());
        System.out.println("");
        System.out.printf("%s |HP|%d|\n",Monstros.getNome(),Monstros.getMaxVida());
        Jogador.Upar(0);
        System.out.println("\n________________________________________________________________________________");
        System.out.printf("| [1]-ATACAR | [2]-DEFENDER-SE | VIDA = %.1f | EXP = %.2f/%.2f | LV = %d |\n", Jogador.getMaxVida(),Jogador.getExp(),Jogador.getMaxExp(),Jogador.getLevel());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.print("OPÇÂO = ");
        M = input.nextInt();
        switch (M) {
          case 1:
              Jogador.Atacar(Monstros); 
              Monstros.UA1(Jogador,false);
              Thread.sleep(2000); 
          break;
          case 2:
            Monstros.UA1(Jogador,true);
            Jogador.DEFENDER();
            Thread.sleep(2000);
          break;   
          default:
            Monstros.UA1(Jogador,false); 
            Thread.sleep(2000);
          break;
        }
        Jogador.Morrer();
        Monstros.Morrer();
        if (Jogador.getvM() == false){
          menuS.limparW();
          System.out.println(menuS.getMenus4());
          System.out.println("\nVoce Morreu!!");
          break;
        }
        if (Monstros.getAlive() == false){
          menuS.limparW();
          Jogador.VidaMaxVerifcador();
          System.out.println(menuS.getMenus5());
          System.out.println("-----------------------------------------------------------------------------------------------");
          System.out.printf("Voce matou o monstro %.2f de Exp para você!!\n", Monstros.getExp());
          System.out.println("\nVoce descansa antes da proxima batalha, voce ganha mais vida.");
          Jogador.setMaxVida(Jogador.getMaxVida() + Jogador.getVida());
          Jogador.Upar(Monstros.getExp());
          System.out.printf("\n[1]-Editar Status(Seus Pontos = %d)  [2]-Proximo monstro | Opção =",Jogador.getPoints());
          M = input.nextInt();
          if (M == 1){
            menuS.limparW();
            Jogador.editarStatus();
          }else if (M == 2){
            Monstros.MontersSet(Jogador);
            Monstros.setAlive(true);
          }
      }
    }
      input.close();
  }
}