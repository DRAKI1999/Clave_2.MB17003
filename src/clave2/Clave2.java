/*
realizar un programa que contenga el siguiente mnu:
1-Resolver un ejercicio por el méetodo de RungaKuta
2-Newton Rapso
3-Bitacora de ejercicios
4-Salir>
 */
package clave2;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import static javafx.application.Platform.exit;
/**
 *
 * @author Donna
 */
public class Clave2 {

    public static void main(String[] args) throws IOException {
        //Atributos
        int Captura = 0;
        int men;
        //Objeto del paquete Scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\t~~~~~~~Donna Nicole Martínez Blanche - MB17007~~~~~~~\n\t\t ~~~~~~~-Clave 1-programacion III~~~~~~~\n\n\n");
        
        do{
            // Opciones de menu...
        System.out.println("\t\t\t\t**********MENU**********\n"
                + "\t\t1-Ejemplo de un ejercicio resuelto mediante el método de Runge-Kutta.\n"
                + "\t\t2-Ejemplo de un ejercicio resuelto mediante el método Newton Raptso\n"
                + "\t\t3-Salir\n");
        
        Menu menu=Menu.getInstance();
            men=sc.nextInt();
        
            menu.setopp(men);
        
             //
             
            if(men==4){
                exit();
            }
            else{
                System.out.println("Desea Salir??? *0*...\nPecione 1 sidesea continuar");
            Captura=sc.nextInt();
            System.out.println("\n\n\n");
            }
            
        }while(Captura==1);
    }
    
}
