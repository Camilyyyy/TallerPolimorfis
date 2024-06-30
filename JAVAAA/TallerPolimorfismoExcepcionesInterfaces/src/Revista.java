public class Revista extends Publicacion{

private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion) {
        super(titulo, autor);
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("---------------------" +"\n");
        System.out.println("Revista" +"\n");
        System.out.println("---------------------" +"\n");
        System.out.println("\n" +"Titulo Revista: " +titulo+"\n" +"Autor:"+autor+"\n" +"Numero de edicion:"+numeroEdicion);
    }


}
