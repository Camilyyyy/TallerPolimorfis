import java.util.ArrayList;

public class Biblioteca implements Prestable {

    private ArrayList <Publicacion> listaPubli;
    private ArrayList <Libro> listaLibros;



    public Biblioteca() {
        listaPubli = new ArrayList<Publicacion>();
        listaLibros = new ArrayList<Libro>();

    }

    public void agregarPublicacion(Publicacion publicacion){

        listaPubli.add(publicacion);
        if(publicacion instanceof Libro)
        {
            listaLibros.add(publicacion);
        }
    }

    public void mostrarPublicacion(){
        for(Publicacion publicacion: listaPubli)
        {
          publicacion.mostrarInfo();
        }
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
