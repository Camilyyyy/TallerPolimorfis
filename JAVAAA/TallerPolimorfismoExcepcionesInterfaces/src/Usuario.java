import javax.sound.sampled.Line;
import javax.swing.*;
import java.util.ArrayList;

public class Usuario implements Prestable {
    private String nombre;
    private String id;

    private ArrayList <Publicacion> publisPrestadasList;

    public Usuario(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        publisPrestadasList=new ArrayList<Publicacion>();
    }

    @Override
    public void prestar(Biblioteca biblio,Publicacion libro) {//Se interpreata que prestar es como ir a pedri un libro dentro de la biblio
        if (libro instanceof Libro){
            Libro l1=(Libro) libro;
            if (!biblio.pertenece(libro)){
                JOptionPane.showMessageDialog(null,"El libro no pertenece a esta biblio");
                return;
            }
            if (l1.isPrestado()){
                JOptionPane.showMessageDialog(null,"El libro ya fue prestado");
            }
            if(!l1.isPrestado()){
                JOptionPane.showMessageDialog(null,"Libro prestado correctamente");
                publisPrestadasList.add(libro);
                biblio.getListaLibros().remove(libro);
                l1.setPrestado(true);
            }
        }

        if (libro instanceof Revista){
            JOptionPane.showMessageDialog(null,"Las revistas no se pueden prestar ");
        }
    }

    @Override
    public void devolver(Biblioteca biblio,Publicacion libro) {
        if (libro instanceof Libro){
            Libro l1=(Libro) libro;
            if (!biblio.pertenece(libro)){
                JOptionPane.showMessageDialog(null,"El libro no pertenece a esta biblio");
                return;
            }
            if (l1.isPrestado() && publisPrestadasList.contains(libro)){
                l1.setPrestado(false);
                publisPrestadasList.remove(libro);
                biblio.getListaLibros().add(libro);
                JOptionPane.showMessageDialog(null,"El libro se devolvio de manera correcta");
            }
            else{
                JOptionPane.showMessageDialog(null,"El Libro no se puede devolver pues nunca fue prestado");
            }
        }

        if (libro instanceof Revista){
            JOptionPane.showMessageDialog(null,"Las revistas no se pueden devolper pues no se pueden prestar inicialmente ");
        }
    }

    @Override
    public boolean estaPrestado (Publicacion libro) {
        if (libro instanceof Libro){
           return ((Libro) libro).isPrestado();
        }
        return false;
    }

    public void mostrarPublicacionesPrestadas(){
        for (Publicacion libro: publisPrestadasList){
            libro.mostrarInfo();
        }
    }
}
