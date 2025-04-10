import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class buscarTest {
    @Test
    public void testBuscar() {
        int [] vetor = {1,2,3,4,5};
        int numNaoExiste = 6;
        int total = Main.buscar(vetor, numNaoExiste);
        Assertions.assertEquals(-1, total);
    }

}

