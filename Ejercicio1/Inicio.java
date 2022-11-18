
//Armando Lopez Silva
//Brandon Omar Ortiz Gutierrez
//Omar Pedraza Diaz
//Toribio Cortes Marvin Nahum

//Este es el link de github: https://github.com/Marvoo200/POO_Ejercicio.git
package Ejercicio1;

public class Inicio {

    public static void main(String[] args) throws Excepcion {
        
        double numeros[] = {0, 0, 0, 0};
        Ordenar num = new Ordenar();
        numeros = num.ingresar_numeros(); //ingresamos numeros
        num.ordenar(numeros);
    }
}
