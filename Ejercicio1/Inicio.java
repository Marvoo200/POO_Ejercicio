//colo
//Armando Lopez Silva
//Brandon Omar Ortiz Gutierrez
//Omar Pedraza Diaz
//Toribio Cortes Marvin Nahum



package Ejercicio1;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) 
    {
        Scanner leer = new Scanner(System.in);
        String numero[] = {"0", "0", "0", "0"};
        
        for(int i=0; i<4; i++){
            System.out.println("Ingresa un numero: ");
            numero[i] = leer.nextLine();
            
        }
        
        try{

            Ordenar num = new Ordenar();

            System.out.println("Los numeros ordenados son: "+ num.ordenar(numero)); 
            
            
            
       
        } catch (Exception e){
            System.out.println("Ocurrió un error: ");
            e.printStackTrace(System.out);

        }  
      leer.close();
    }       
}
