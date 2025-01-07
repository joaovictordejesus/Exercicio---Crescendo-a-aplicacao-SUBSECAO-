//João Victor de Jesus Augusto
public class Autor extends Pessoa {
    private boolean isUsuario;

    public Autor(String nome, int idade, boolean isUsuario) {
        super(nome, idade);
        this.isUsuario = isUsuario;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean isUsuario) {
        this.isUsuario = isUsuario;
    }
}

