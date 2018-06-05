import java.util.*;
 
public class Employee_Salary {
    public static void main(String[] args) {
    Double smallest = 0.00;
    Double large = 0.00;
    Double num;
    Double added_salary=0.00;
	Double sum=0.00;
	Double a=0.00;
	Double added_salary_final=0.00;
	Double average=0.00;
    System.out.println("Enter the number employees");//how many number you want to enter
    Scanner input = new Scanner(System.in);
    Double n = input.nextDouble();
	System.out.println("Enter the Salary of employees");
    num = input.nextDouble();	
    smallest = num; //assume first entered number as small one
    // i starts from 2 because we already took one num value
    for (Double i = 2.00; i <= n; i++) {
        num = input.nextDouble();
        //comparing each time entered number with large one
		
		if(a<=n)
		{	
			 
			System.out.println("Enter the Amount need to add with Salary");
			added_salary = input.nextDouble();
				
			
			added_salary_final =num+added_salary;
			System.out.println("Increment salary is:" + added_salary_final);
			
		}
		
        if (num > large) {
            large = num;
        }
        //comparing each time entered number with smallest one
        if (num < smallest) {
            smallest = num;
        }
		 if (i <= n) {               
                sum = num + num;
            }
		
    }
	average = sum / n;
    System.out.println("largest no is:" + large);
    System.out.println("Smallest no is : " + smallest);
    System.out.println("Sum of no is : " + sum);
    System.out.println("Average of no is : " + average); 
}
}