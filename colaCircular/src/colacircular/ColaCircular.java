/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colacircular;

import java.util.Scanner;

/**
 *
 * @author erika
 */
public class ColaCircular {
static int frente=-1, Final=-1, max,colaC[], Dato;
static Scanner sc = new Scanner(System.in);


static void crear(){
    System.out.println("");
    Dato=sc.nextInt();
    colaC = new int [Dato];
    
}
static void insertar(int dato){
    
    if((Final==max-1)&&(frente==0)||(Final+1==frente)){
    System.out.println("cola llena");
}else{
        System.out.println(Final);
    if(Final==max-1){
            Final=0;
            }else{
        
            Final++;
            }
        System.out.println(Final);
    colaC[Final]=dato;
        System.out.println(colaC[Final]);
    if(frente==-1){
        frente=0;
    }
}
}
 static void mostrar(){
     if(Final==-1&&frente==Dato){
         System.out.println("cola vacia");
     }else{
         if(Final>frente){
             for(int i=frente;i<=Final;i++){
                 System.out.println(colaC[i]+",");
             }
             
         }else if(frente>=Final){
             System.out.println("");
         }
     }
    
 }
 static void borrar(){
     if(frente==Final){//solo hay un elemento
         frente=0;
     Final=0;
    }else {
    if(frente==max){
        frente=0;
        
    }
    else{
        frente=frente+1;
    }
}
 }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       insertar(4);
       insertar(8);
       borrar();
       insertar(10);
       insertar(6);
       insertar(22);
       borrar();
       mostrar();
    }
    
}
