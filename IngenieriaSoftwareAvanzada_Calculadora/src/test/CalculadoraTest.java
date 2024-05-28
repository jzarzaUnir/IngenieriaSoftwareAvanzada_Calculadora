import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5.0, calc.sumar(2.0, 3.0), 1e-3);
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1.0, calc.restar(3.0, 2.0), 1e-3);
    }

}
