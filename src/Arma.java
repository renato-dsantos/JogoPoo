import java.util.Random;

public abstract class Arma {
     private String nome;
     private int dano;
     private int chance;

    public Arma(String nome, int dano, int chance) {
        this.nome = nome;
        this.dano = dano;
        this.chance = chance;
    }

    public void descricao(){
        System.out.println(this.nome +
                " - dano: " + this.dano +
                " - chance: " + this.chance + "%");
    }

    public void acao(Criatura c){
            Random rd = new Random();
        int sorteio = rd.nextInt(100);
        if( sorteio < chance ){
            c.tomaDano( this.dano );
        } else {
            System.out.println("Ataque falhou.");
        }

    }

}
