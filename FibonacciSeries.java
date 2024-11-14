package HomeAssignments;

public class FibonacciSeries 
{
	    public static void main(String[] args) 
	    {
	    	int range = 8;
	    	int num1 = 0, num2 = 1, next;

	    	System.out.println("Fibonacci series up to : " + range);

	    	for (int i = 1; i <= range; i++) 
	    	{
	    		System.out.print(num1 + " ");
            	next = num1 + num2;
            	num1 = num2;
            	num2 = next;
	    	}
	    }
}