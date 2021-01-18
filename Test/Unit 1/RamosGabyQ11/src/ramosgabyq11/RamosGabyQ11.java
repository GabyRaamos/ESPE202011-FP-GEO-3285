/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ramosgabyq11;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class RamosGabyQ11 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
                
            do{
                System.out.println("========= Multiplication Tables ========= ");
                System.out.println("1.--> The Multiplicate tables ");
                System.out.println("0.--> Exit");
                System.out.println("Enter your menu option -->");
           
                option = input.nextInt();
           
                switch (option) {
              
                case 1:
                    int top=12;
                    int product=0; 
                    int table;
                    System.out.println("Enter the multiplication table that you want to study  -> ");
                    table = input.nextInt();
                    for (int g = 1; g <= top ; g++) {
                    product = table * g ;
                    System.out.println(table+ " * " + g + " = " + product);
                    product++;
                            }
                   break;
            
                case 0:
            
                    System.out.println(" == Good Bye Friend == ");
                    System.exit(0);
            
                    break;
                    default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                }
        } while (option !=0 );
     
    }
    
}


