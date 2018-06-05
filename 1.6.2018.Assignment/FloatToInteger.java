public class FloatToInteger{ 
	public static void main(String args[]) 
	{	
		// converting a float to int by casting 
		 System.out.println("converting float to int using downcasting"); 
		 int value = (int) 3.14f; // 3
		 int score = (int) 3.99f; // 3
		 System.out.printf("float : %f, int : %d %n", 3.14f, value); System.out.printf("float : %f, int : %d %n", 3.99f, score);
		 // converting float to integer value by rounding 
		 System.out.println("converting float to int using rounding"); 
		 int a = Math.round(3.14f); // 3 
		 int b = Math.round(3.99f); // 4 
		 int c = Math.round(3.5f); // 4 
		 System.out.printf("float : %f, int : %d %n", 3.14f, a);
		 System.out.printf("float : %f, int : %d %n", 3.99f, b);
		 System.out.printf("float : %f, int : %d %n", 3.5f, c); 
	 }
 }

 