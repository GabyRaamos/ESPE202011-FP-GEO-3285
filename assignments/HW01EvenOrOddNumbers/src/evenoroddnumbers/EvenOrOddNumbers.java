package evenoroddnumbers;

import java.util.Scanner;
/**
 * @author Gaby Ramos
 */
public class EvenOrOddNumbers {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
    System.out.println("Welcome user");
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter a whole number >>");
    int num = scanner.nextInt();
    
    if (num%2==0){
        System.out.println("= The number entered is even" );
    }
    else{
        System.out.println( "= The number entered is odd ");    
    }
    
    
         }
}

 