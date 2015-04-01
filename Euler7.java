public class Euler7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int end = TextIO.getlnInt();
		int count = 1;
		int comp = 0;
		
		for (int i = 3; count < end; i++) { //starts at 2 and stops when end# of primes
			for (int j = 2; j <= (int)Math.sqrt(i); j++) { //checks divisors from 2 to sqrt of i
				if (i%j==0) {
					comp++;
				}
			}
			
			if (comp == 0) {
				count++;
				System.out.println(i);
			}
			comp = 0;
		}
	}		
}