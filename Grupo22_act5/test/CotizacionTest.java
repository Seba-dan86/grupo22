import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CotizacionTest {
    
    private Conversor conversor = new Conversor();
    
    public CotizacionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test (expected = ArithmeticException.class)
    public void testCotizarCero() {
        conversor.calcularCotizacion(1000, 0);
    }
    
}
