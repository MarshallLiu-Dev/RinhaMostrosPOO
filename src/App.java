

public class App {
    public static void main(String[] args) throws Exception {
    
    Monstro m1 = new Monstro();
    m1.nome = "Orc";
    m1.ataque = 20;
    m1.defesa = 10;
    m1.vida = 50;

    Monstro m2 = new Monstro();
    m2.nome = "Vampiro";
    m2.ataque = 10;
    m2.defesa = 12;
    m2.vida = 60;

    Monstro m3 = new Monstro();
    m3.nome = "Lobisomem";
    m3.ataque = 15;
    m3.defesa = 15;
    m3.vida = 50;

    Arena a = new Arena();
    
    a.addMonstro(m1);
    a.addMonstro(m2);
    a.addMonstro(m3);
    a.iniciarBatalha();
  
    }
}
