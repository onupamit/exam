package number.java;

public class FindPrimeNumbers {

	/**
	 * Please do the flowing problem.
	 */
	public static void main(String[] args) {
	
		/* Find the prime numbers from 1 to 1000 then print to console.
	(prime numbers are only divisible by number 1 and the number itself.)
	(for example numbers like 2,3,5,7,9,11,13.....n are prime numbers. 
		*/
		for (int i =2; i<1000; i++){
			boolean prime = true;
			for(int j=2; j<= i/2 ; j++){
				if((i%2) == 0){
					j=i;
					prime = false;
				}
			}
			if(prime){
				System.out.println(i);
				
			}
		}
		

	}

}
