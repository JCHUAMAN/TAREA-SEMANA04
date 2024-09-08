package Programa;

import java.util.Scanner;

public class Tarea03 {
      public static void main(String[] args) {

        int numero;
        String ingles="";
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
                System.out.print("Ingresar un numero del 1 al 6 : ");
                numero=lectura.nextInt();
                // Proceso de datos
                switch (numero){
                    case 1:ingles="One";break;
                    case 2: ingles="Two";break;
                    case 3:ingles="Three";break;
                    case 4: ingles="Four";break;
                    case 5: ingles="Five";break;
                    case 6:ingles="Six";break;
                
                }
                // Salida de datos
                System.out.println("El numero "+numero+" en ingles es:  "+ingles);
}
        }