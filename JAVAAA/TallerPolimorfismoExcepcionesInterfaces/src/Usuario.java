import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String id;

    private ArrayList <Libro> publisPrestadasList;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        publisPrestadasList=new ArrayList<Libro>();
    }

    public Usuario() {
    }


    public void prestarPublicacion(Biblioteca biblio, Publicacion publi)
    {

    }

    public void devolverPublicacion(Biblioteca biblio, Publicacion publi){

    }

    public void mostrarPublicacionesPrestadas(){
        for (Libro libro: publisPrestadasList){
            libro.mostrarInfo();
        }
    }
}
