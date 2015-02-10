
public class Euler7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int prime = 0;
		int counter = 0;
		boolean flag = true;
		
		for (int i = 2; flag == true; i++) {
			for (int j = 2; j < i; j++) {
				if (i%j == 0) {
					continue;
				}
				else {
					prime = i;
					counter++;
				}
			}
			
			if (counter >= 15) {
				flag = false;
			}
			System.out.println(counter);

			
		}
			
		System.out.println(prime);
		
		
	}

}
