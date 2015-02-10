
public class Euler3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factor = 0;
		long num = 600851475143L;
		for (long i = 2; i < num; i++) {			
			if (num%i == 0) {						//finds factors
				num = num/i;						//divides big number by factor
				i--;
			}
		}
		System.out.println("The result is:" + num);
		
	}

}
