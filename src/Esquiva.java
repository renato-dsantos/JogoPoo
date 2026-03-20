import java.util.Random;

public class Esquiva extends Defesa{
    private int chance;

    public Esquiva(int chance) {
        if(chance <0 ){
            chance = 0;
        }

        if(chance > 100){
            chance = 100;
        }
        this.chance = chance;
    }

    @Override
    public int danoReduzido(int danoOriginal) {
        Random rd = new Random();

        int sorteio = rd.nextInt(0,100);
        if( sorteio < chance ){
            return 0;
        }
        return danoOriginal;
    }
}
