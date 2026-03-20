//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Criatura jogador = new Jogador("Renato");
        Criatura inimigo = new Malignus();

        System.out.println("###################################");
        jogador.fraseApresentacao();
        inimigo.fraseApresentacao();


        int cont = 0;

        while (true) {
            cont++;
            System.out.println("----------");
            System.out.println("Rodado " + cont);
            jogador.mostraVida();
            inimigo.mostraVida();

            jogador.fazAtaque(inimigo);
            if (inimigo.estaVivo()) {
                inimigo.fazAtaque(jogador);
            }

            if(!jogador.estaVivo()){
                jogador.fraseMorte();
                System.out.println(inimigo.getNome() + " venceu!");
                break;
            }

            if(!inimigo.estaVivo()){
                inimigo.fraseMorte();
                System.out.println(jogador.getNome() + " venceu!");
                break;
            }

        }//fim while


    }//fim método main

}// fim class