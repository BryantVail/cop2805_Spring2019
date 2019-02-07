package week05;

public class PrimeNumbers {

	public static void main(String[] args) {
	
		int foundPrimes = 0;
		for(int i = 2; i<10000000; i++) {
			if(isPrime(i)) {
				System.out.printf("%7d",  i);
				foundPrimes++;
				if(foundPrimes % 10 == 0) {
					System.out.print("\n");
				}
			}//end if(isPrime(i)){
		}//end for
	}
	
	
	
	public static boolean isPrime(int number) {
		for(int i  = 2; i<number; i++) {
			if(number % i == 0) {
				return false;
			}
			
		}//end for
		return true;
	}
}
