/*
Ejercicio 2

Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de
segundo grado. Tenremos los 3 coeficientes como atributos, llamémosles a, b y c.

Hay que insertar estos 3 valores para construir el objeto.

Las operaciones que se podrán realizar son las siguientes:

    - obtenerRaices(): imprime las 2 posibles soluciones.
    - obtenerRaiz(): imprime única raíz, que será cuando solo tenga una solución.
    - getDiscriminante(): devuelve el valor del discriminante, b^2-4ac
    - tieneRaices(): devuelve boolean indicando si tiene 2 soluciones.
    - tieneRaiz(): devuelve boolean inidicando si tiene solución única.
    - calcular(): mostrará por consola las posibles soluciones que tiene nuestra ecuación.
        en caso de no existir, deberá mostrarlo también.
 */

import static java.lang.Math.sqrt;

public class Raices {

    private int a;
    private int b;
    private int c;

    public Raices (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void obtenerRaices(){
        double discriminante = sqrt(b*b-4*a*c);
        if(discriminante>=0) {
            System.out.println("Solución 1: " + (-b + discriminante) / (2 * a));
            System.out.println("Solución 2: " + (-b - discriminante) / (2 * a));
        } else System.out.println("No hay raíces reales.");
    }
    public void obtenerRaiz(){
        double discriminante = b*b-4*a*c;
        if (discriminante==0){
            System.out.println("Solución única: " + (-b/(2*a)));
        } else System.out.println("No hay solución única.");

    }
    public double getDiscriminante(){
        double discriminante = b*b-4*a*c;
        return discriminante;
    }
    public boolean tieneRaices(){
        //El discriminante tiene que ser > 0 para que tenga 2 soluciones
        double discriminante = b*b-4*a*c;
        return (discriminante>0);
    }
    public boolean tieneRaiz(){
        //El discriminante tiene que ser = 0 para que tenga una única solución doble.
        double discriminante = b*b-4*a*c;
        return (discriminante==0);
    }
    public void calcular(){
        double discriminante = b*b-4*a*c;
        if(discriminante>0){
            System.out.println ("Solución 1: " + (-b + discriminante)/(2*a));
            System.out.println("Solución 2: " + (-b - discriminante)/(2*a));
        } else {
            if (discriminante == 0){
                System.out.println("Solución única: " + (-b/(2*a)) + " (solución doble)");
            } else System.out.println("La ecuación no tiene solución.");
        }

    }

}
