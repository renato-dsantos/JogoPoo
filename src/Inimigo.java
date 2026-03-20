public abstract class Inimigo extends Criatura {

    private int ataque;
    private Defesa defesa;

    public Inimigo(String nome, int vida, int ataque) {
        super(nome, vida);
        this.ataque = ataque;
        this.defesa = new Defesa();
    }

    public Inimigo(String nome, int vida, int ataque, Defesa defesa) {
        super(nome, vida);
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void fazAtaque(Criatura criaturaAtacada){
        System.out.println( "Inimigo faz ataque!");
        criaturaAtacada.tomaDano(ataque);
    }

    @Override
    public void tomaDano( int dano ){
        int danoReduzido = defesa.danoReduzido(dano);
        super.tomaDano(danoReduzido);
    }


}//fim inimigo
