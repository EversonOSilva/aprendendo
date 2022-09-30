import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlugavelTest {
    Aluguel aluguel2 = new Aluguel();
    Alugavel al = new Alugavel();


    @Test
    void adicionaAluguel() {
        boolean actual  = al.adicionaAluguel(aluguel2);
        assertTrue(actual);

    }




}