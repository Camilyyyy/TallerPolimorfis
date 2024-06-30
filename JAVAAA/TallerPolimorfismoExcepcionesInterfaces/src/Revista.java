public class Revista extends Publicacion{

private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion) {
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("titulo: " +titulo +"autor:"+autor +"Numero de edicion:"+numeroEdicion);
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {
    }

    @Override
    public boolean estaPrestado() {
        return false;
    }
}
