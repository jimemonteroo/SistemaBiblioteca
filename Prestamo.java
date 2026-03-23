public class Prestamo {
    private Libro libro;
    private Usuario usuario;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
    }

    public void registrarPrestamo() {
        if (libro.isDisponible()) {
            libro.prestar();
            System.out.println("Préstamo realizado a " + usuario.getNombre());
        } else {
            System.out.println("Libro no disponible");
        }
    }
}

