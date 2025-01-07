// João Victor de Jesus Augusto
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Autor autor = new Autor("Jessica Felix", 35, true);

        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", true);

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();

        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        System.out.println("O livro não está disponível");
        System.out.println(emprestimo);

        System.out.println("\nArtigo: " + artigo.getTitulo());
        System.out.println("Autor: " + artigo.getAutor().getNome());
        System.out.println("Genero: " + artigo.getGenero());
        System.out.println("Publicado: " + (artigo.isPublicado() ? "Sim" : "Não"));
    }
}
