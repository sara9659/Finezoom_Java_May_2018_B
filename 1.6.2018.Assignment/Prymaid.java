import java.util.*;
 
// Java code to demonstrate star pattern
public class Prymaid
{
	 // Driver Function
    public static void main(String args[])
    {
		Scanner input = new Scanner(System.in);      
        int numberOfLines;
		char charToPrint;
		System.out.print("Enter a number of lines to print :");
		numberOfLines = input.nextInt();
		System.out.print("Enter a charater to print :");
		charToPrint = input.next().charAt(0);
        // number of spaces
        int k = 2*numberOfLines - 2;  
        // outer loop to handle number of rows
        //  numberOfLines in this case
        for (int i=0; i<numberOfLines; i++)
        { 
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j=0; j<k; j++)
            {
                // printing spaces
                System.out.print(" ");
            }  
            // decrementing k after each loop
            k = k - 1;  
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (int j=0; j<=i; j++ )
            {
                // printing stars
                System.out.print(charToPrint+" ");
            }  
            // ending line after each row
            System.out.println();
        }
    }
	   
}