//João Victor de Jesus Augusto
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {
    @Test
    public void testArtigoPublicado() {
        Autor autor = new Autor("Alan Turing", 41, false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testArtigoNaoPublicado() {
        Autor autor = new Autor("Alan Turing", 41, false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", false);
        assertFalse(artigo.isPublicado());
    }

    @Test
    public void testGetTitulo() {
        Autor autor = new Autor("Alan Turing", 41, false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        Autor autor = new Autor("Alan Turing", 41, false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);
        artigo.setTitulo("Compiladores Avançados");
        assertEquals("Compiladores Avançados", artigo.getTitulo());
    }
}

