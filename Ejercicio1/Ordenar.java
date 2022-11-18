package Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;


public class Ordenar {


    public double[] ingresar_numeros() {
        Scanner leer = new Scanner(System.in);
        String n[] = {"0", "0", "0", "0"};
        double numeros[] = {0,0,0,0};
        boolean salida = true;
        int i = 0;
        try {
            //leer datos de entrada
            while(salida){
                System.out.printf("\nIngresa un número(%d): ", i+1);
                n[i] = leer.nextLine();
                if(isNumeric(n[i]) == true){
                    i = i+1; //si es un numero continuar para ingresar el otro
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
            for(i = 0; i<4; i++){
                numeros[i] = Double.parseDouble(n[i]);
            }
            
        }

        leer.close();
        return numeros;

    }



    public void ordenar(double[] numeros){
        Arrays.sort(numeros);
        System.out.println("Los numeros ordenados son: ");
        for(int i=0; i< 4; i++){           
            System.out.print(" "+numeros[i]);      
        }
    }

    private boolean isNumeric(String cadena){
        try {
            Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }
    
}
