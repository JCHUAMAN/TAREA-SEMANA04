package Programa;
import java.util.Scanner;
public class Tarea01 {

    public static void main(String[] args)  {
        // Declarar variables
        Scanner scanner = new Scanner(System.in);

        // Solicitar la entrada del usuario
        System.out.print("Ingresa un número entero entre 1 y 5: ");
        int numero = scanner.nextInt();

        // Proceso de datos
        String palabra=" ";

        
        switch (numero) {
            case 1:palabra = "uno";      break;
            case 2: palabra = "dos";     break;
            case 3: palabra = "tres";     break;
            case 4: palabra = "cuatro"; break;
            case 5: palabra = "cinco";   break;
                }

        // Mostrar el resultado
        System.out.println("El número ingresado en letras es: " + palabra);
    
    }
}