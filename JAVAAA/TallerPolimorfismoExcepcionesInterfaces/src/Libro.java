public class Libro extends Publicacion{

    private boolean prestado;

    public Libro(String titulo, String autor) {
        super(titulo, autor);
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public void mostrarInfo() {
        if(prestado){
            System.out.println("---------------------" +"\n");
            System.out.println("Libros" +"\n");
            System.out.println("---------------------" +"\n");
            System.out.println("Titulo Libro: " +titulo+"\n" +"Autor:"+autor+"\n" +"Esta prestado");
        }
        else {
            System.out.println("---------------------" +"\n");
            System.out.println("Libros" +"\n");
            System.out.println("---------------------" +"\n");
            System.out.println("Titulo Libri: " +titulo+"\n" +"Autor:"+autor+"\n" +"No esta prestado");

        }
    }

}
