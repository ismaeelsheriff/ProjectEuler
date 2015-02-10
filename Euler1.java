
public class Euler1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0, addend  = 0;
		for (int i = 0; i < 1000; i++) {
			if ((i%3 == 0) || (i%5 == 0)) {
				addend = i;
			}
			else {
				continue;
			}
			sum = sum + addend;
		}
		
		System.out.println("The sum is: " + sum);
	}

}