/*
Ejercicio 1:

Crear una clase Libro que contenga los siguientes atributos:

    - ISBN
    - Titulo
    - Autor
    - Número de Páginas

Crear sus respectivos métodos get y set correspondientes para cada atributo.
Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:
    "El libro <su_titulo> con ISBN <su_ISBN> escrito por el autor <su_autor> tiene <num_Paginas> páginas."

En la clase main, crear 2 objetos Libro (Valores que se quieran) y mostrarlos por pantalla.

 Por último, indicar cual de los 2 libros creados tiene más páginas.
 */

public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;


    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }

    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }

    public int getNumPaginas(){
        return numPaginas;
    }
    public void setNumPaginas(int numPaginas){
        this.numPaginas=numPaginas;
    }

    public Libro(String ISBN,String titulo,String autor,int numPaginas){
        this.ISBN= ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String toString(){
        return "El libro " + titulo + " con ISBN " + ISBN + " escrito por el autor " + autor +
                " tiene " + numPaginas + " páginas.";
    }
    
}
