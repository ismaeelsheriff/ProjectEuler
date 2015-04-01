
public class Euler5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int product = 2520;
		
	while (true) {
		int i = 0;
		
		for (int j = 2; j < 21; j++) {
			if (product % j != 0) {
				product++;
				break;
			}
			i++;
		}
		
		if (i == 19) {
			System.out.println(product);
			break;
		}
	}	 
		
	}
}