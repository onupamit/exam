package number.java;

public class PrintNumber {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
		
		/* use a for loop to print 1 to 100 and then store into an array.
		 *then use another for loop to print only odd numbers.Then add the 
		 *total numbers from the array.
		 */
		int array[]= new int [101];
		System.out.println("\n ------ Print 1 to 100 --------");
		for(int i=0;i<100;i++){
			System.out.print(" "+ (i+1)+ " ");
			array[i]=i+1;
			
		}
		System.out.println("\n ------Only Odd Numbers --------");
		int counter = 0;
		for(int i=0;i<100;i++){
			int test = array[i];
			counter =  array[i] + counter; 
			if((test % 2)  != 0){
				System.out.print(" "+array[i]+" ");	
				
			}
			
		}
		System.out.print("\n Print Total :  "+counter+" ");	
	}

}
