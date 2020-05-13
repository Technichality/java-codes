/**
 * Create a class called Complex for performing arithmetic with
 * complex number. Write a program to test your class. Use floating-point
 * variables to represent the private data of the class. Provide a
 * constructor that enables an object of this class to be
 * initialized when it’s declared. Provide a no-argument
 * constructor with default values in case no initializers are
 * provided
 *
 * @Nichalia Wilson
 * 
 */
import java.util.Scanner;

public class ComplexTest
{
    public static void main(String args[])
    {
     Scanner input = new Scanner(System.in);
     //create object
     Complex complex1 = new Complex();
     
     //Variables
     double a, b, c, d;
     
     //INPUT
     System.out.printf("Enter the real number 'a': ");
     a = input.nextDouble();
     System.out.printf("\nEnter the imaginary number 'b': ");
     b = input.nextDouble();
     System.out.printf("\nEnter the real number 'c': ");
     c = input.nextDouble();
     System.out.printf("\nEnter the imaginary number 'd': ");
     d = input.nextDouble();
     
     //OUTPUT
     System.out.printf("\nResults:\n");
     System.out.printf("\nAddition:\n(%.2f + %.2fi) + (%.2f + %.2fi)",a,b,c,d );
     complex1.add(a,b,c,d);
     System.out.printf("\nSubtraction:\n(%.2f + %.2fi) - (%.2f + %.2fi)",a,b,c,d);
     complex1.subtract(a,b,c,d);
     System.out.printf("\nMultiplication:\n(%.2f + %.2fi)(%.2f + %.2fi)",a,b,c,d);
     complex1.multiply(a,b,c,d);
     
    }

}
