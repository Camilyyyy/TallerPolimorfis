import javax.swing.*;
import java.util.ArrayList;

public class Biblioteca  {

    private ArrayList <Publicacion> listaPubli;
    private ArrayList <Publicacion> listaLibros;



    public ArrayList<Publicacion> getListaLibros() {
        return listaLibros;
    }

    public Biblioteca() {
        listaPubli = new ArrayList<Publicacion>();
        listaLibros = new ArrayList<Publicacion>();

    }
    public boolean pertenece(Publicacion publicacion) {
        return listaPubli.contains(publicacion);
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

    public void mostrarLibros(){//Permite saber que libros de toda la coleccion con la que cuenta la bilbioteca sigue estando disponible
        for(Publicacion publicacion: listaLibros)
        {
            publicacion.mostrarInfo();
        }
    }
}
