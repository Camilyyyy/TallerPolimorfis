public interface Prestable {

    void prestar(Biblioteca biblio,Publicacion libro);
    void devolver(Biblioteca biblio,Publicacion libro);
    boolean estaPrestado(Publicacion libro);



}
