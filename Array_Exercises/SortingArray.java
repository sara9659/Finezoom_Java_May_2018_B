import java.util.*; 
public class SortingArray {
	public static void main(String[] args)
	{       
		int[] numberArray = {1789, 2035, 1899, 1456, 2013,1458, 2458, 1254};           
		String[] stringArray = {"Java","Python","PHP","C#","C Programming","C++"};  		
		System.out.println("Original numeric array : "+Arrays.toString(numberArray));
		Arrays.sort(numberArray);
		System.out.println("Sorted numeric array : "+Arrays.toString(numberArray));    
		System.out.println("Original string array : "+Arrays.toString(stringArray));
		Arrays.sort(stringArray);
		System.out.println("Sorted string array : "+Arrays.toString(stringArray));
    }
}
