import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testZero() throws Exception {
        var calc = new Calculadora();
        var res = calc.somatoriaLimitada(0, 500);
        assertEquals(0, res);
    }

    @Test
    void testException(){
        var calc = new Calculadora();
        assertThrows(Exception.class, () -> {
            var res = calc.somatoriaLimitada(10, 10);
        });
    }

    @Test
    void testNegNumber() throws Exception {
        var calc = new Calculadora();
        var res = calc.somatoriaLimitada(-1, 500);
        assertEquals(1, res);
    }

}