public class Main {

    public static void main(String[] args) {
        //Bibliotecas
        Biblioteca b1=new Biblioteca();
        Biblioteca b2=new Biblioteca();
        //Usuario
        Usuario u1=new Usuario("Camily","A00123");
        //Publicaciones b1
        Publicacion p1=new Revista("NY","Lola",3);
        b1.agregarPublicacion(p1);
        Publicacion p2=new Libro("100 Años de Soledad","Wachiturro random");
        b1.agregarPublicacion(p2);
        Publicacion p3=new Libro("Vagabond","Dios");
        b1.agregarPublicacion(p3);

        //Publicaciones b2
        Publicacion q1=new Revista("Shonen Jump","Oda",32);
        b2.agregarPublicacion(q1);
        Publicacion q2=new Libro("Meditaciones","Marco Aurelio");
        b2.agregarPublicacion(q2);
        Publicacion q3=new Libro("Mas alla del bien y el mal","Friedrich Nietzsche");
        b2.agregarPublicacion(q3);

        //Intercambio
        b1.mostrarLibros();//Se muestran todos los libros disponibles para pedir
        u1.prestar(b1, q1);//Mensaje donde se explique que las revistas no se pueden devolver ni pedir prestadas
        u1.prestar(b1, q2);//Mensaje donde se avisa que el libro que se busca no existe en dicha biblio
        u1.prestar(b1, p3);
        b1.mostrarLibros();//Se muestran todos los libros disponibles para pedir despues de los pedidos


        System.out.println("Publicaciones Prestadas para u1");
        u1.mostrarPublicacionesPrestadas();

        u1.devolver(b1, p2);
        System.out.println("Publicaciones Prestadas para u1 despues de devolver 100 años");
        u1.mostrarPublicacionesPrestadas();


        System.out.println("Publicaciones en b1");
        b1.mostrarPublicacion();
        u1.prestar(b1, p3);

        System.out.println("Publicaciones en b2");
        b2.mostrarPublicacion();
        b2.mostrarLibros();

    }

}