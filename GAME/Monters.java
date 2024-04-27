package GAME;
import java.util.Random;
public class Monters {
    private String nome;
    private String Sprite;
    private int level;
    private int points;
    private int exp;
    private int força;
    private int stamina;
    private int  mana;
    private int magia;
    private int vida;
    private int MaxVida;
    private int defesa;
    private boolean Alive;
    private Random random = new Random();
    //battle
    public void setAlive(boolean Alive){
        this.Alive = Alive;
    }    

    public void setMaxVida(int MaxVida){
        this.MaxVida = MaxVida;
    }
    public void setSprite(String Sprite){
        this.Sprite = Sprite;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
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
    //seters
    public boolean getAlive(){
        return Alive;
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
    public String getSprite(){
        return Sprite;
    }
    public int getMaxVida(){
        return MaxVida;
    }
    //funções
    public void MontersSet(Player Jogador){
        int R = random.nextInt(5);
        switch(R){
            case 0:
                setSprite("     (()__(()\n" +
                "     /       \\\n" +
                "    ( /    \\  \\\n" +
                "     \\ o o    /\n" +
                "     (_()_)__/ \\\n" +
                "    / _,==.____ \\\n" +
                "   (   |--|      )\n" +
                "   /\\_.|__|'-.__/\\_\n" +
                "  / (        /     \\\n" +
                "  \\  \\      (      / \n" +
                "   )  '._____)    /  \n" +
                "(((____.--(((____");
                setNome("Urso");
                setLevel(Jogador.getLevel() + 1);
                setExp(Jogador.getLevel()*25);
                setForça(Jogador.getForça()*2);
                setDefesa(Jogador.getDefesa()/3);
                setVida(Jogador.getVida()/3);
                setMaxVida(getVida());
        break;
            case 1:
                setSprite( "       /`.----.\\   /.----.`\\\n" +
                "      } /      :} {:      \\ {\n" +
                "     / {        } {        } \\\n" +
                "     } }      ) } { (      { {\n" +
                "    / {      /|\\}!{/|\\      } \\\n" +
                "    } }     ( (.\"^\".\") )     { {\n" +
                "   / {       (d\\   /b)       } \\\n" +
                "   } }       |\\~   ~/|       { {\n" +
                "  / /        | )   ( |        \\ \\\n" +
                " { {        _)(,   ,)(_        } }\n" +
                "  } }      //  `\";\"`  \\\\      { {\n" +
                " / /      //     (     \\\\      \\ \\\n" +
                "{ {      {(     -=)     )}      } }\n" +
                " \\ \\     /)    -=(=-     (\\    / /\n" +
                "  `\\\\  /'/    /-=|\\-\\    \\`\\  //'\n" +
                "    `\\{  |   ( -===- )   |  }/'\n" +
                "      `  _\\   \\-===-/   /_  '\n" +
                "         (_(_(_)'-=-'(_)_)_)\n" +
                "        `\"`\"`\"       \"\"\"`\"");
                setNome("Dragão");
                setLevel(Jogador.getLevel() + 5);
                setExp(Jogador.getLevel()*25);
                setForça(Jogador.getForça() *2);
                setDefesa(Jogador.getDefesa() + 20);
                setVida(Jogador.getVida()/2);
                setMagia(100);
                setMaxVida(getVida());
            break;
            case 2:
                setSprite("         .            )        )\n" +
                "                  (  (|              .\n" +
                "              )   )\\/ ( ( (\n" +
                "      *  (   ((  /     ))\\))  (  )    )\n" +
                "    (     \\   )\\(          |  ))( )  (|\n" +
                "    >)     ))/   |          )/  \\((  ) \\\n" +
                "    (     (      .        -.     V )/   )(    (\n" +
                "     \\   /     .   \\            .       \\))   ))\n" +
                "       )(      (  | |   )            .    (  /\n" +
                "      )(    ,'))     \\ /          \\( `.    )\n" +
                "      (\\>  ,'/__      ))            __`.  /\n" +
                "     ( \\   | /  ___   ( \\/     ___   \\ | ( (\n" +
                "      \\.)  |/  /   \\__      __/   \\   \\|  ))\n" +
                "     .  \\. |>  \\      | __ |      /   <|  /\n" +
                "          )/    \\____/ :..: \\____/     \\ <\n" +
                "   )   \\ (|__  .      / ;: \\          __| )  (\n" +
                "  ((    )\\)  ~--_     --  --      _--~    /  ))\n" +
                "   \\    (    |  ||               ||  |   (  /\n" +
                "         \\.  |  ||_             _||  |  /\n" +
                "           > :  |  ~V+-I_I_I-+V~  |  : (.\n" +
                "          (  \\:  T\\   _     _   /T  : ./\n" +
                "           \\  :    T^T T-+-T T^T    ;<\n" +
                "            \\..`_       -+-       _'  )\n" +
                "                . `--=.._____..=--'. ./");
                setNome("Caveira-Flamejante");
                setLevel(Jogador.getLevel() + 5);
                setExp(Jogador.getLevel()*25);
                setForça(Jogador.getForça()*2);
                setDefesa((Jogador.getDefesa()+15));
                setVida(Jogador.getVida()/2);
                setMagia(100);
                setMaxVida(getVida());
            break;
                case 3:
                    setSprite(                    "        /(     )\\               A\n" +
                    "   .--.( `.___.' ).--.         /_\\\n" +
                    "   `._ `%_&%#%$_ ' _.'     /| <___> |\\\n" +
                    "      `|(@\\*%%/@)|'       / (  |L|  ) \\\n" +
                    "       |  |%%#|  |       J d8bo|=|od8b L\n" +
                    "        \\ $%#% /        | 8888|=|8888 |\n" +
                    "        |\\|%%#|/|        J Y8P\"|=|\"Y8P F\n" +
                    "        | (\".\")%|         \\ (  |L|  ) /\n" +
                    "    ___.'  `-'  `.___      \\|  |L|  |/\n" +
                    "  .'#*#`-       -'$#*`.       / )|\n" +
                    " /#%^#%*_ *%^%_  #  %$%\\    .J (__)\n" +
                    " #&  . %%%#% ###%*.   *%\\.-'&# (__)\n" +
                    " %*  J %.%#_|_#$.\\J* \\ %'#%*^  (__)\n" +
                    " |%  J\\ `%%#|#%%' / `.   _.'   |L|\n" +
                    " |#$%||` %%%$### '|   `-\'      |L|\n" +
                    " (#%%||` #$#$%%% '|            |L|\n" +
                    " | ##||  $%%.%$%  |            |L|");
                    setNome("Misterious-Ox");
                    setLevel(Jogador.getLevel() + 5);
                    setExp(Jogador.getLevel()*25);
                    setForça((Jogador.getForça()*2));
                    setDefesa((Jogador.getDefesa())/2);
                    setVida(Jogador.getVida()/2);
                    setMaxVida(getVida());
            break;
                case 4:
                    setSprite("                                          .\"\"--..__\n" +
                    "                     _                     []       ``-.._\n" +
                    "                  .'` `'.                  ||__           `-.\n" +
                    "                 /    ,-.\\                 ||_ ```---..__     `-.\n" +
                    "                /    /:::\\               /|//}          ``--._  `.\n" +
                    "                |    |:::||              |////}                `-. \\\n" +
                    "                |    |:::||             //'///                    `.\\\n" +
                    "                |    |:::||            //  ||'                      `|\n" +
                    "                /    |:::|/        _,-//\\  ||\n" +
                    "               /`    |:::|`-,__,-'`  |/  \\ ||\n" +
                    "             /`  |   |'' ||           \\   |||\n" +
                    "           /`    \\   |   ||            |  /||\n" +
                    "         |`       |  |   |)            \\ | ||\n" +
                    "        |          \\ |   /      ,.__    \\| ||\n" +
                    "        /           `         /`    `\\   | ||\n" +
                    "       |                     /        \\  / ||\n" +
                    "       |                     |        | /  ||\n" +
                    "       /         /           |        `(   ||\n" +
                    "      /          .           /          )  ||\n" +
                    "     |            \\          |     ________||\n" +
                    "    /             |          /     `-------.|\n" +
                    "   |\\            /          |              ||");
                    setNome("!!MORTE!!");
                    setLevel(Jogador.getLevel() + 15);
                    setExp(Jogador.getLevel()*25);
                    setForça(Jogador.getForça()*3);
                    setDefesa(Jogador.getDefesa()*2);
                    setVida(Jogador.getVida()/3);
                    setMagia(500);
                    setMaxVida(getVida());
            break;
        } 
    }
   
    //urso moveset//
    public void UA1(Player Jogador,boolean D){
        Jogador.setMaxVida(Jogador.getMaxVida() - getForça());
        System.out.printf("\nO %s Atacou Você!!! \n", getNome());
        System.out.printf("- %d De Dano Fisico", getForça());
        if (D == true){
            Jogador.setMaxVida(Jogador.getMaxVida() - getForça()/2);
        }
    }

    public void Morrer(){
        if (getMaxVida() <= 0){
            setAlive(false);
        }
    }
}

