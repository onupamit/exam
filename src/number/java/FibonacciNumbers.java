package number.java;

public class FibonacciNumbers {

	public static void main(String[] args) {
		
		/* 
		 * Fibonacci numbers are 0,1,1,2,3,5,8,13,21
		 *                     
		 * Write java code to find fibonacci sequences up to 100 numbers. 
		 * 
		 */
		int fibonacci_0 = 0 ;
		int fibonacci_1 = 1;
		int fibonacci = 0;
		 for(int i=0; (fibonacci_0 + fibonacci_1)<100; i++){
			 if(i==0){
				 fibonacci_0 = i;
				 System.out.println(fibonacci_0);
			 }
			 else if(i==1){
				 fibonacci_1 = i;
				 System.out.println(fibonacci_1);
			 }
			 else {
				  fibonacci = fibonacci_0 + fibonacci_1;
				
				 System.out.println(fibonacci);
				 fibonacci_0 = fibonacci_1;
				 fibonacci_1 = fibonacci;
				 
				 
			 }
			  
		 }
	}

}
