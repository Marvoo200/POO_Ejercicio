package Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;


public class Ordenar {


    public int[] ingresar_numeros() {
        Scanner leer = new Scanner(System.in);
        String n[] = new String[5];
        int numeros[] = new int[5];
        boolean salida = true;
        int i = 0;
        try {
            //leer datos de entrada
            while(salida){
                System.out.printf("\nIngresa un número(%d): ", i+1);
                n[i] = leer.nextLine();
                if(isNumeric(n[i]) == true){
                    i++; //si es un numero continuar para ingresar el otro
                }else{
                    System.out.printf("\tNo se está ingresando un numero");
                }
                
                if(i == 4){
                    salida = false;
                }
            }

        }  catch (NumberFormatException e) {
            System.out.println("\nUno de los números ingresados no es valido.\n");

        }finally{
            //cambiamos el texto a numeros
            for(i = 0; i<4; i++){
                numeros[i] = Integer.parseInt(n[i]);
            }
            
        }

        leer.close(); //cerramos Scann
        return numeros; //enviamos los numeros ordenados en formato entero

    }



    public void ordenar(int[] numeros){
        
        
        Arrays.sort(numeros);//ordenamos los numeros de menor a mayor
        System.out.println("Los numeros ordenados son: ");
        for(int i=1; i<= 4; i++){           
            System.out.print(" "+numeros[i]);      
        }
    }

    private boolean isNumeric(String cadena){ //validamos que se ingresen números
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    
}
