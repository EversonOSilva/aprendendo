import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AluguelTest {
    Alugavel camisa = new Alugavel("Camisa","Preta", 2544, 48, 12.50);
    Aluguel a1 = new Aluguel("22/10/2022",10,"833.000.542-12","Fernando",camisa);
    @Test
    void calculaValorTotal() {
        double test = a1.calculaValorTotal();
        assertEquals(112.5,test);
    }


}