import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Potencia_Test {

    //o nome deve ser o mais claro possível
    @Test
    public void potenciaPorZero(){
        long esperado = 1;
        long resposta = Main.potencia(2, 0);
        Assertions.assertEquals(esperado
        ,resposta
        ,"Todo número elevado a zero deve ser 1");
    }

    @Test
    public void potenciaPorUm(){
        long esperado = 3;
        long resposta = Main.potencia(3, 1);
        Assertions.assertEquals(esperado
        ,resposta
        ,"Todo número elevado a zero deve ser ele mesmo");
    }
    @Test
    public void potenciaPorTres(){
        long esperado = 8;
        long resposta = Main.potencia(2, 3);
        Assertions.assertEquals(esperado
        ,resposta
        ,"2^3 deve ser 8.");
    }

}
