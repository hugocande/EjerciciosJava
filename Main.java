public class Main {
    public static void main (String [] args){
        
        //Ejercicio 1
        Libro libro1 = new Libro("ISBN1","Titulo Libro 1", "Autor 1", 240);
        Libro libro2 = new Libro("ISBN2", "Título Libro 2", "Autor 2", 240);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        if (libro1.getNumPaginas()>libro2.getNumPaginas()) {
            System.out.println("El libro 1 tiene más páginas.");
        } else if (libro1.getNumPaginas()<libro2.getNumPaginas()){
                System.out.println("El libro 2 tiene más pagínas.");
            } else System.out.println("Los dos libros tienen las mismas páginas.");
        }
    }

