public abstract class Publicacion implements Prestable {

    protected String titulo;
    protected String autor;

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract void mostrarInfo();

}
