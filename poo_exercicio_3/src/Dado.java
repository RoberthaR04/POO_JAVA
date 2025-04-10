import java.util.Random;

public class Dado {

    Random random = new Random();

    public int rolar(){
        //0 até 5
        return random.nextInt(6)+1;
    }

}