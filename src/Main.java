public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("Java Básico", "Autor X");
        Usuario usuario1 = new Usuario("Juan", 1);

        biblioteca.agregarLibro(libro1);
        biblioteca.registrarUsuario(usuario1);

        Prestamo prestamo = new Prestamo(libro1, usuario1);
        prestamo.registrarPrestamo();
    }
}
