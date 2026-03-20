import java.util.Scanner;
import java.util.Random;

public class Jogador extends Criatura {

    private Arma[] armas = {
            new Faca(),
            new Pistola(),
            new Espada(),
            new ArcoEFlecha(),
            new Metralhadora(),
            new Machado()
    };

    public Jogador(String nome) {
        super(nome, 900);
    }


    @Override
    public void fazAtaque(Criatura criaturaAtacada) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha sua arma: ");

        int n = 0;
        for(Arma arma : armas){
            n++;
            System.out.print(n + ")");
            arma.descricao();
        }
        int escolha = sc.nextInt();
        while( escolha < 1 || escolha > n ){
            System.out.println("Número inválido, digite novamente:");
            escolha = sc.nextInt();
        }

        armas[escolha-1].acao(criaturaAtacada);

    }

    @Override
    public void fraseApresentacao() {

        System.out.println("Não contava com minha astúcia");

    }

    @Override
    public void fraseMorte() {
        System.out.println("Eu voltarei para defender o bem!");

    }
}
