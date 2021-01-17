/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04;

import java.util.Scanner;

/**
 *
 * @author Gaby Ramos
 */
public class HW04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
            
        do{
            System.out.println(" ========= Calculator =======");
            //Let A, B, C be the vertices of the right triangle 
            //
            System.out.println("1. -> Hypotenuse of a right triangle given its cathetus'");
            System.out.println("2. -> Hypotenuse of a right triangle given a AdjacentCathetus and an angle");
            System.out.println("3. -> Hypotenuse of a right triangle given a OppositeCathetus and an angle");
            System.out.println("4. -> Internal angles of a right triangle");
            System.out.println("5. -> Area of ​​a right triangle");
            System.out.println("6. -> Perimeter of a right triangle");
            System.out.println("7. -> Exit");
           
           System.out.println("Enter your menu option -->");
           
           option = input.nextInt();
           
           switch (option) {
                case 1:
                    double hypotenuse;
                    double CathetusA;
                    double CathetusB;
                     
                    System.out.println("enter CathetusA -> ");
                    CathetusA = input.nextDouble();
                     
                    System.out.println("enter CathetusB -> ");
                    CathetusB = input.nextDouble();
                    
                    hypotenuse = Math.hypot(CathetusA, CathetusB);
                    System.out.println("The hypotenuse of the right triangle is " + hypotenuse);
      
                    break;
                    
                case 2:
                    double AdjacentCathetus;
                    double angle;
                    
                    System.out.println("enter angle -> ");
                    angle = input.nextDouble();
                  
                    System.out.println("enter adjacent cathetus -> ");
                    AdjacentCathetus = input.nextDouble();
                    hypotenuse = AdjacentCathetus * Math.cos(angle);
                  
                    System.out.println("The hypotenuse of the right triangle is " + hypotenuse);
                    
                    break;
                    
                 case 3:
                    double OppositeCathetus;
                    System.out.println("enter angle -> ");
                    angle = input.nextDouble();
                  
                    System.out.println("enter Opposite cathetus -> ");
                    OppositeCathetus = input.nextDouble();
                    hypotenuse = OppositeCathetus * Math.sin(angle);
                  
                    System.out.println("The hypotenuse of the right triangle is " + hypotenuse);   
                    
                    break;
                    
                case 4:
                     final int angle_sum = 180;
                     final int angleB = 90;
                     double angleA; 
                     double angleC;
                     System.out.println("The angle sum is " + angle_sum);
                     System.out.println("The angle B is -> " + angleB);
                     System.out.println("enter angle A -> ");
                     angleA = input.nextDouble();
                    
                     angleC = (double)angle_sum - (angleA + angleB);
                     System.out.println("The angle C is " + angleC);
                    
                    break;
                    
                case 5:
                
                    float Area;
                    float base;
                    float height;
                    
                    System.out.println("enter value of the base of the right triangle -> ");
                    base = input.nextFloat();
                   
                    System.out.println("enter value of the height of the right triangle -> ");
                    height = input.nextFloat();
                     
                    Area = (base + height)/2;
                    System.out.println("The area of the right triangle is " + Area);
                     
                    break;
                    
                case 6:
                    
                    float Perimeter;
                    float  side_a;
                    float  side_b;
                    float  side_c;
                    
                    System.out.println("enter side a -> ");
                    side_a = input.nextFloat();
                   
                    System.out.println("enter side b -> ");
                    side_b = input.nextFloat();
                     
                    System.out.println("enter side c -> ");
                    side_c = input.nextFloat();
                     
                    Perimeter =(side_a + side_b + side_c);
                    System.out.println("The perimeter of rigth triangle is " + Perimeter);
                     
                     
                    break;
                   
                case 7:
                    System.out.println("Good Bye User ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                }
                      
        } while (option !=7 );
     
    }
    
}
 
