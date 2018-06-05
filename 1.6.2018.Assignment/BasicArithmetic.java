/*This Java program performs  basic arithmetic operations
 *addition, subtraction, multiplication and division
 */
 import java.util.*;
public class BasicArithmetic
{ 
    public static void main(String[] args)
    {
		Scanner input = new Scanner(System.in);		 
        int number1,number2;
		System.out.println("Enter number1 :");        
		number1 = input.nextInt();
		System.out.println("Enter number2 :");
		number2 = input.nextInt(); 
        //calculating number1 + number2;
        int sum = number1 + number2; 
        //calculating number1 - number2;
        int difference = number1 - number2;
        //calculating number1 * number2;
        int product = number1 * number2;
        //calculating number1 / number2;
        int quot = number1 / number2; 
        //calculating number1 % number2;
        int rem = number1 % number2;
        //Displaying the values     
        System.out.println("Sum : "+sum);
        System.out.println("Difference : "+difference);
        System.out.println("Product : "+product);
        System.out.println("Quot : "+quot);
        System.out.println("Reminder : "+rem);
    }
}