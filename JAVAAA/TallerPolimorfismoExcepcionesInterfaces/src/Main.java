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
        u1.prestar(b2, p2);
        u1.prestar(b1, p3);
        u1.mostrarPublicacionesPrestadas();
        u1.devolver(b1, p2);
        u1.mostrarPublicacionesPrestadas();
        b1.mostrarPublicacion();
        u1.prestar(b1, p3);
        u1.prestar(b1, q1);
    }



}