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
public class Complex //class complex for performing arithmetic w/ complex number
{
    //Variables
    private double realPart;
    private double imaginaryPart;
    private double a, b, c, d;

    //Contructor
    public Complex() //no arguments
    {
        Scanner input = new Scanner(System.in);
        //Initialization
        realPart = 0.0;
        imaginaryPart = 0.0;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }
    public Complex(double a, double b) //with arguments
    {
        //Initialization
        realPart = a;
        imaginaryPart = b;
    }
    public void add(double a, double b, double c, double d)
    {
        realPart = a + c;
        imaginaryPart = b + d;
        System.out.printf("\n= %.2f + %.2fi", realPart, imaginaryPart);
    }
    public void subtract(double a, double b, double c, double d)
    {
        realPart = a - c;
        imaginaryPart = b - d;
        System.out.printf("\n= %.2f + %.2fi", realPart, imaginaryPart);
    }
    public void multiply(double a, double b, double c, double d)
    {
        realPart = a * c - b * d;
        imaginaryPart = a * d + b * c;
        System.out.printf("\n= %.2f + %.2fi", realPart, imaginaryPart);
    }
}
