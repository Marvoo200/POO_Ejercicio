package Ejercicio1;

import java.util.Arrays;
import java.util.Scanner;


public class Ordenar {

    public double[] ordenar(String numero[]) throws Excepciones{
        Scanner leer = new Scanner(System.in);
        double a[] = {0, 0, 0, 0};

        for(int i=0; i<4; i++){
           
            
            a[i] = Double.parseDouble(numero[i]);
            
            // if(a[i] == 0){
            //     throw new Excepciones("Se debe de ingresar un número");
            // }
            

        }
        Arrays.sort(a);       
    
                   
        leer.close();
        return a;
    }
}

