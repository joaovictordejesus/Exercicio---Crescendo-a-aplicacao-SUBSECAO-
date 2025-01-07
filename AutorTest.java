// João Victor de Jesus Augusto
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {
    @Test
    public void testIsUsuario() {
        Autor autor = new Autor("Jess", 30, true);
        assertTrue(autor.isUsuario());
    }
    @Test
    public void testSetUsuario() {
        Autor autor = new Autor("Jess", 30, false);
        autor.setUsuario(true);
        assertTrue(autor.isUsuario());
    }
}
