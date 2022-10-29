/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_byron.lemuz;

import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class Lab3P1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        boolean centinela = true;
        do {
            System.out.println("--------MENU---------");
            System.out.println("1)Ejercicio 1");
            System.out.println("2)Ejercicio 2");
            System.out.println("3)Ejercicio 3");
            System.out.println("4)Salir");
            System.out.println("-----------------------");
            System.out.println("Ingrese la opcion que desea; ");
            int OpcionMenu = lea.nextInt();
            switch (OpcionMenu) {

                case 1: {

                    break;
                }
                case 2: {

                    int k = lea.nextInt();
                    while (k <= 0) {
                        System.out.println("Ingrese el valor de k:");
                        k = lea.nextInt();
                    }
                    double numerador, denominador, potencia, resultado=0, n2, NK = 0;

                    for (int i = 1; i <= k; i++) {
                        n2 = 1;
                        NK = 1;

                        numerador = 2 * i + 1;
                        for (int j = 1; j <= 2; j++) {
                            n2 *= i;

                        }
                        double num = n2 + 3;
                        int factorial = 1;
                        for (int j = 1; j <= num; j++) {
                            factorial *= j;
                        }
                        for (int j = 1; j <= k; j++) {
                            NK *= i;
                        }
                        resultado += (numerador * NK) / factorial;
                    }
                    System.out.println("RESULTADO FINAL:" + resultado);
                }

            }
        
            break;
        
          case 3:{
            int N = lea.nextInt();
            System.out.print("ingrese un numero:");
            for( int x =0; x<= N; x++ ){
                for(int a= N; a< a+1;x++)
                System.out.print(" ");
            }
            int a = 0;
            for(int x = N-2-a; x>=0; x--){
                System.out.print("* ");
                
                System.out.println("");               
             }
            for(int x =0; x<N; x++){
                for(int b = N-1-x; b>=0; x--){
                System.out.print(" ");
                }
                for(int b = 0;b<=x;x++){
                System.out.println("* ");
            
                
              System.out.println("");
            
            }    
            
            }
 
            break;
        }


        case 4:{
        centinela=false;
        
        }
        default:
        
            System.out.println("La opcion que ingreso no es valida");
    }

        
        
    while (centinela  = true);
    }}
   
