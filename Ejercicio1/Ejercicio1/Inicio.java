//colo
//Armando Lopez Silva
//Brandon Omar Ortiz Gutierrez
//Omar Pedraza Diaz
//Toribio Cortes Marvin Nahum

//Este es el link de github: https://github.com/Marvoo200/POO_Ejercicio.git

package Ejercicio1;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) throws Exception{
        Scanner leer = new Scanner(System.in);
        String n1, n2, n3, n4;
        
        System.out.println("Ingresa el primer numero: ");
        n1 = leer.nextLine();
        System.out.println("Ingresa el segundo numero: ");
        n2 = leer.nextLine();
        System.out.println("Ingresa el tercer numero: ");
        n3 = leer.nextLine();
        System.out.println("Ingresa el cuarto numero: ");
        n4 = leer.nextLine();

        Ordenar num = new Ordenar();
        

       num.ordenar(n1, n2, n3, n4);
        
        

         
        

            
            
       
      leer.close();
            
    }
}
