import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;

public class ConversorTest {
    private static Conversor conversor;
   
    /*
        BeforeClass --> Se ejecuta una sola vez por clase
        Before      --> Se ejecuta al iniciar cualquier test de la clase
    */
    @BeforeClass
    public static void beforeClass() {
        conversor = new Conversor();
        System.out.println("Bienvenido al sistema de conversión de moneda");
    }
    
    @Before
    public void before() {
        System.out.println("Ejecutando prueba: " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    /*
        AferClass --> Se ejecuta una sola vez por clase
        After     --> Se ejecuta al terminar cualquier test de la clase
    */
    @After
    public void after() {
        System.out.println("Pueba finalizada, campos en 0");
    }
        
    @AfterClass
    public static void afterClass() {
        System.out.println("La operacion a finalizado");
    }

    @Test
    public void testAumentarSaldo() {
        assertEquals(1700.0, conversor.aumentarSaldo(500, 1200), 0.001);
    }
    
    @Test
    public void testRetirarDolaresFisicos() {
        assertEquals(1200.0, conversor.retirarDolaresFisicos(1700, 500), 0.001);
    }
    
}
