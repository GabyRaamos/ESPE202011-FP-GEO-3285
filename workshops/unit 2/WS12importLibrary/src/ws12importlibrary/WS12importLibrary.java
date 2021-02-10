package ws12importlibrary;

/**
 *
 * @author Gaby Ramos
 */
public class WS12importLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Math Library 
        // we import and use it
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float absoluteValue = 0.0F;

        number = 9; // squareRoot =? --> 3
        squareRoot = (float) Math.sqrt(number);
        System.out.println("the square root of " + number + " is " + squareRoot);
        number = 49; // 7
        squareRoot = (float) Math.sqrt(number);
        System.out.println("the square root of " + number + " is " + squareRoot);
        number = 5; // 2.23
        squareRoot = (float) Math.sqrt(number);
        System.out.println("the square root of " + number + " is " + squareRoot);

        base = 3;
        exponent = 2;
        // power = 9
        power = (float) Math.pow(base, exponent);
        System.out.println("The power of " + base + " with exponent " + exponent + " is " + power);

        base = 2;
        exponent = 4;
        power = (float) Math.pow(base, exponent);
        System.out.println("The power of " + base + " with exponent " + exponent + " is " + power);
        //power = 16
        base = 78;
        exponent = 5;
        //2.887.174.3688
        power = (float) Math.pow(base, exponent);
        System.out.println("The power of " + base + " with exponent " + exponent + " is " + power);
        // if we don't have the library,what would we do?
        //create the feature, the library
        //our own algorithm to compute the square root 
        power = computePower(base, exponent);
        System.out.println("The power of " + base + " with exponent " + exponent + " is " + power);

        absoluteValue = getAbsoluteValue(number);
        number = -5;
        absoluteValue = getAbsoluteValue(number);
        System.out.println("absolut Value of " + number + " is " + absoluteValue);

        number = 5;
        absoluteValue = getAbsoluteValue(number);
        System.out.println("absolut Value of " + number + " is " + absoluteValue);
    }

    public static float computePower(float base, float exponent) {
        float power;
        power = 0.0F;

        for (int i = 1; i <= (int) exponent; i++) {
            power = power * base;
        }
        return power;
    }

    private static float getAbsoluteValue(float number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
//        if (number < 0) {
//            number = number * -1;
//            return number;
//        }
//
//        return number;
    }
}
