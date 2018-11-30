/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clave2;

import java.io.IOException;
import java.util.Scanner;
import static javafx.application.Platform.exit;


/**
 *
 * @author Donna
 */
public class Menu {
    //atributos
    Scanner sc = new Scanner(System.in);
    
    int opp;
    
    //Instancia singleton
     private static Menu instance;
    //Constructor
    private Menu(){
    }
    public static Menu getInstance(){
        
        
        if(instance==null){
            
            instance=new Menu();
            
        }
        return instance;
    }
    
    public int getopp(){
        return opp;
    }
    
    public void setopp(int opp) throws IOException{
        
        this.opp=opp;
        
        switch(opp){
            //Opcion 1
            case 1:{
                //Llamar al objeto de la clase RungeKutta
                RungeKutta rk=new RungeKutta();
                rk.Kutta();
                break;
            }
            //Opcion 2
            case 2:{
                //Crear un objeto de la clase NewtonR
                  Scanner lee=new Scanner(System.in);
                   System.out.println("Introduce un valor para la aproximación=>");
                   double x=lee.nextDouble();
                   NewtonR n1=new NewtonR(x);
                   double r=n1.calcRaiz();
                   System.out.println("Raiz="+r);
    }
            
            case 3:{
                //Salir
                exit();
                break;
            }
            default:{
                System.out.println("La opcion ingresada es incorrecta!");
            }
        }
    }
}
