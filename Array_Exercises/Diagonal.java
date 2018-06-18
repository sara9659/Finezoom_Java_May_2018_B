import java.util.*;
public class Diagonal
{
	public static void main(String[] args)
	 {
		 int[2][2] array_nums = {{5,7, 2},{4,6,7},{3,5,1}};
		 int numberOfArray =3;

		for(int initialValue =0;initialValue <= numberOfArray ;initialValue++)
		{
			for(int newinitialValue =0;newinitialValue <= numberOfArray ;newinitialValue++)
			{
				System.out.println(array_nums[initialValue][newinitialValue]);
				if(initialValue !=0)
				{
				initialValue--;
				}
			}
		}
	 }
}