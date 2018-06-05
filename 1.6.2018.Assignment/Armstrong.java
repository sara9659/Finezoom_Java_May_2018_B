/*This Java program for check the given nuber is Armstrong or not
 *Example: If the use gives 153 then it will show the given number is arstrong number
 */
import java.util.*;
class Armstrong{  
  public static void main(String[] args)  {  
  Scanner input = new Scanner(System.in);
    int givenNum,c=0,a,temp;  
	System.out.println("Enter your number:");
	givenNum = input.nextInt();
	temp=givenNum;  
    while(givenNum>0)  
    {  
    a=givenNum%10;  
    givenNum=givenNum/10;  
    c=c+(a*a*a);  
    }  
	//Checking is the user given value is armstrong or not
    if(temp==c) 		
    System.out.println(temp +"is armstrong number");   
    else  
        System.out.println(temp +"is not armstrong number");   
   }  
} 