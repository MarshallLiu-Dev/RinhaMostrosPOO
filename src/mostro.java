import java.util.Random;

public class Monstro{
  String nome;
  int ataque;
  int defesa;
  int vida;

   Monstro(){
   }

  Monstro(String nome, int ataque, int defesa, int vida){
    this.nome = nome;
    this.ataque = ataque;
    this.defesa = defesa;
    this.vida = vida;
  }
  
  // Calcular o ataque do monstro
  // e retorna o valor do dano causado
  
  int atacar(){
   Random rd = new Random();
    // Formula: MIN + rdInt%(MAX-MIN+1);
    //  gerar um numero entre 1 e 8;
    
    int dadoAleatorio = 1 + rd.nextInt(8);
    System.out.println("Dado: " + dadoAleatorio);
    int dano = this.ataque + dadoAleatorio;
    return dano; 
  }
    
  // Receber o dano causado por outro
  // monstro e descontar o dano 
  // nos pontos de vida.
  
  void defender(int dano){
   int danoDefendido = dano - defesa;
    vida = vida - danoDefendido;
    
  }
}