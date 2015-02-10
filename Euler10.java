
public class Euler10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long prime = 1;
		long max = 10;
		
		for (long i = 3; i <= max; i++) {			//goes through all numbers to 2mil
			for (long j = 2; j< i; j++) {			//sees if each is prime
				if (j%i == 0) {
					continue;
				}
				else {
					prime = i + prime;
				}
				System.out.println("i is " + i);
				System.out.println("j is " + j);
			}
		}
		System.out.println(prime);
	}
}