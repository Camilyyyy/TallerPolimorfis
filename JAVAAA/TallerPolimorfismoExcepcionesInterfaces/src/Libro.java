public class Libro extends Publicacion{

    private boolean prestado;
//Sobrecarga de metodos
    //




    public Libro(String titulo, String autor, boolean prestado) {
        super(titulo, autor);
        this.prestado = prestado;
    }

    @Override
    public void mostrarInfo() {
        if(prestado){
            System.out.println("titulo: " +titulo +"autor:"+autor +"Esta prestado");
        }
        else {
            System.out.println("titulo: " +titulo +"autor:"+autor +"No esta prestado");

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
