
package Ejemplo;

import java.util.Scanner;


public class Arreglo_1 {
    

    public static void main(String[] args) {
        System.out.println("cambios");
        
        //Defino el el arreglo
        int[] numeros = new int[5];
        //
        System.out.println("Ingrese 5 datos enteros: "); 
        Scanner entrada = new Scanner(System.in);
               
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un valor para el vector: ");
            numeros[i]=entrada.nextInt();
                   
        }
        System.out.println("");   
        
        int cont=0;
        
        for (int i = 0; i < 5; i++) {
            if(numeros[i]==3){
               cont=cont+1; 
            }
        }
        System.out.println("La cantidad de 3 es: "+ cont);
    }
}
