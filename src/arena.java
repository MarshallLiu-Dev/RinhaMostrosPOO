import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Arena{
  List<Monstro> competidores;

  // Construtor da classe Arena
  Arena(){
    System.out.println("Uma nova arena foi criada");
    inicializarLista();
  }

  void inicializarLista(){
    competidores = new ArrayList<Monstro>();
  }

  void addMonstro(Monstro m){
    competidores.add(m);
  }

  int jogarDado(int min, int max){
    Random rd = new Random();
    // Formula: MIN + rdInt(MAX-MIN+1);
    int dado = min + rd.nextInt(max - min + 1);
    return dado;
  }

  void iniciarBatalha(){
    while(true){
      // c=c+1 ==> c++
      for(int c = 0; c < competidores.size(); c++){
        // Verifica se resta apenas UM
        if(competidores.size() == 1){
          System.out.println("Batalha finalizada.");
          Monstro mV = competidores.get(0);
          System.out.println(mV.nome + " venceu.");
          return;
        }
        
        // Seleciona o mosntro atacante
        Monstro mA = competidores.get(c); 
        
        // vai lançar o dado.
        int dado = jogarDado(0, competidores.size()-1);
        // Enquanto o dado for c (mesmo monstro) 
        // precisa lançar novamento
        while(dado == c){
          dado = jogarDado(0, competidores.size()-1);
        }

        //Seleciona o monstro defensor:
        Monstro mD = competidores.get(dado);

        // Monstro atacante ataca monstro defensor.
        System.out.println(mA.nome + " ataca " 
                                   + mD.nome);
        int dano = mA.atacar();
        System.out.println(mA.nome + 
                          " atacou com " + dano);

        mD.defender(dano);
        System.out.println(mD.nome + " ficou com " +
                   mD.vida + " pontos de vida");
        if(mD.vida <= 0){
          System.out.println(mD.nome + " desmaiou.");
          competidores.remove(dado);
        } 
        System.out.println("==========");
        
        try{
          Thread.sleep(1000);
        } catch (Exception e) {
          e.printStackTrace();
        }
        
      }
    }
  }
}