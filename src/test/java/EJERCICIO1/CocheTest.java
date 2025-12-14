apackage EJERCICIO1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CocheTest {

    @Test
    public void testCreacionCoche() {
        Coche c = new Coche();
        c.setMarca("Ferrari");
        assertEquals("Audi", c.getMarca());
    }

    @Test
    public void testClonacion() throws CloneNotSupportedException {
        Coche c1 = new Coche();
        c1.setMatricula("1234BBB");
        
        Coche c2 = (Coche) c1.clone();
        
        // Verificamos que sean objetos distintos pero con mismo contenido
        assertNotSame(c1, c2); 
        assertEquals(c1.getMatricula(), c2.getMatricula());
    }

    @Test
    public void testIgualdad() {
        Coche c1 = new Coche();
        c1.setMarca("Seat");
        c1.setModelo("Ibiza");
        c1.setMatricula("1111AAA");

        Coche c2 = new Coche();
        c2.setMarca("Seat");
        c2.setModelo("Ibiza");
        c2.setMatricula("1111AAA");

        // Deben ser iguales según tu método equals
        assertTrue(c1.equals(c2));
    }
}
