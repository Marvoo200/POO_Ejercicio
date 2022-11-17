package Ejercicio1;

import java.util.Arrays;


public class Ordenar {

    public int[] ordenar(String numero1, String numero2, String numero3, String numero4) throws Exception{
        
        int n[] ={0, 0, 0, 0};
        int g[] = {10, 10, 10, 10 };
        int f = 0;
        
        String a[] ={numero1, numero2, numero3, numero4};
        
            try {
                
                
                for(int i=0; i<4; i++){
                    if(Integer.parseInt(a[i]) != 0){
                        n[f] =Integer.parseInt(a[i]);
                        f++;
                    }else{
                        g[i] = 1;
                    }
                }
                Arrays.sort(n);
    
            }  catch (NumberFormatException e) {
    
                System.out.println("\nUno de los números ingresados no es valido.\n");
    
            }
            finally{
                // f = 0;
                // for(int i=0; i<4; i++){
                    
                //     if(g[i] != 1){
                //         n[f] =Integer.parseInt(a[i]);
                //         f++;
                //     }else{

                //     }
                    
                // }
                Arrays.sort(n);
                
                System.out.println("Los numeros ordenados son: ");
                for(int i=0; i< f; i++){
                    
                    System.out.print(" "+n[i]);
                   
                       
                }
            }
        
        

        
             
    
                   
        return n;
    }
    
}

