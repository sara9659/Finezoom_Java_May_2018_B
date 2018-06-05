import java.util.*;
class ReverseGivenNumber 
{
	 public static void main(String[] args)
  {
	 int givenNumber, reverse = 0;
 
      System.out.println("Enter a number to reverse");
      Scanner input = new Scanner(System.in);
      givenNumber = input.nextInt();
 
      while(givenNumber != 0)
      {
          reverse = reverse * 10;
          reverse = reverse + givenNumber%10;
          givenNumber = givenNumber/10;
      }
 
      System.out.println("Reverse of the number is " + reverse);
  }
}