/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import static java.awt.PageAttributes.MediaType.A;
import static java.lang.Double.sum;
import static java.time.Clock.system;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.X;

/**
 *
 * @author GabyRamos
 */
public class HOMEWORK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
    //Let A, B, C be the vertices of the right triangle 
    //
    short Perimeter;
    short  side_a;
    short  side_b;
    short  side_c;
    
    int angle_sum;
    int angleCAB;
    int angleABC;
    int angleBCA;
   
    float Area;
    float base;
    float height;
    
    base = (float) 15.9;
    height = (float) 8.7;
    
    side_a = 4;
    side_b = 6;
    side_c = 6;
    
    angleCAB = 32;
    angleABC = 90;
    angle_sum = 180;
    
    angleBCA = angle_sum - angleCAB - angleABC;
         System.out.println(" The the value of the angleBCA is >> " + angleBCA);
 
    Perimeter = (short) (side_a + side_b + side_c);    
         System.out.println(" The Perimeter of the right triangle is >> " + Perimeter );
         
    Area = (base + height)/2;
         System.out.println(" The area of ​​the right triangle >> " + Area );
    }
}
 

   
           
    