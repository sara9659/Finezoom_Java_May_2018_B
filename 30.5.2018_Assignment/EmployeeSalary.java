import java.util.*;
public class EmployeeSalary {
    public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double smallest = 0.00;
		double large = 0.00;
		double sum=0.00;
		double average=0.00;
		double salaryOfEmployees;		
		System.out.println("Enter the number of employees :");//how many salaryOfEmployeesber of Employees want to enter  
		double noOfEmployees = input.nextDouble();
		System.out.println("Enter the Salaries of employees :");//Enter salaries of employees
		salaryOfEmployees = input.nextDouble();	
		smallest = salaryOfEmployees; //assume first entered salaryOfEmployeesber as small one
		// initialValue starts from 2 because we already took one salaryOfEmployees value
		for (double initialValue = 2.00; initialValue <= noOfEmployees; initialValue++) 
		{
			
			//comparing each time entered salaryOfEmployeesber with large one		
			if (salaryOfEmployees > large) 
				large = salaryOfEmployees;
			//comparing each time entered salaryOfEmployeesber  with smallest one
			if (salaryOfEmployees < smallest) 
				smallest = salaryOfEmployees;
			// Sum of employees salaries
			if (initialValue <= noOfEmployees) 
				sum = sum + salaryOfEmployees;	
		}
		average = sum/noOfEmployees;
		System.out.println("largest salary is:" + large);
		System.out.println("Smallest salary is : " + smallest);
		System.out.println("Sum of salary is : " + sum);
		System.out.println("Average of salary is : " + average); 
	}
}