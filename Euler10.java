public class Euler10 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long end = TextIO.getlnInt();
		int comp = 0;
		long sum = 2;
		
		for (long i = 3; i < end; i++) { //starts at 2 and stops when end# of primes
			for (int j = 2; j <= (long)Math.sqrt(i); j++) { //checks divisors from 2 to sqrt of i
				if (i%j==0) {
					comp++;
				}
			}
			
			if (comp == 0) {
				//System.out.println(i);
				sum+=i;
			}
			comp = 0;
		}
		System.out.println(sum);
	}
}