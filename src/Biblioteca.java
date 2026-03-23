import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
