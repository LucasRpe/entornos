/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication34;
import java.util.*;
/**
 *
 * @author admin
 */
public class JavaApplication34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int num,tamaño=0;
        do{
            System.out.println("dime el tamaño del array maximo 10");
            tamaño=sc.nextInt();
        }while(tamaño<=10);
        int[] numeros=new int[tamaño];
        for (int i=0;i<numeros.length;i++){
            System.out.println("dime un numero");
            num=sc.nextInt();
            if (repetidos(numeros,num)==true){
                numeros[i]=num;
            }else{
                System.out.println("numero repetido");
            }
        }
        Arrays.sort(numeros);
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        
    }
    public static boolean repetidos(int[] numeros,int num){
        boolean repetido=false;
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]==num)
                repetido=true;
        }
        return repetido;
    }
}
