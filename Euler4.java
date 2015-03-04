
public class Euler4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long product = 0;
		long first = 0;
		long nextFirst = 0;
		long last = 0;
		long nextLast = 0;
		long hold = 0;
		
		for (long i = 100; i < 999; i++) {
			for (int j = 100; j < 999; j++) {
				product = i*j;

				first = (product%1000000-product%100000)/100000;
				last = (product%10);
				
				if (first == last) { // if a9999a
					first = (product%100000-product%10000)/10000;
					last = (product%100)/10;
					
					if (first == last) { //if ab99ba
						first = (product%10000-product%1000)/1000;
						last = (product%1000)/100;
						
						if (first == last) { //if abccba
							if (product > hold) {
								hold = product;
								
							}
						}
					}
				}
			}
		}
		System.out.println(hold); 
	}
}