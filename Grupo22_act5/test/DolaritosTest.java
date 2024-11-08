import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DolaritosTest {

    private final double monto;
    private final double tasaConversion;
    private final double resultadoEsperado;
    private Conversor conversor = new Conversor();

    public DolaritosTest(double monto, double tasaConversion, double resultadoEsperado) {
        this.monto = monto;
        this.tasaConversion = tasaConversion;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
                { 180000, 1500, 270000000 },
                { 120, 1000, 120000 },
                { 100000, -900, -90000000 }
        });
    }

    @Test
    public void testConversor() {
        assertEquals(resultadoEsperado, conversor.convertirMoneda(monto, tasaConversion), 0.001);
    }
}
