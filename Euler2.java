
public class Euler2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int newt = 0; //the new first term
		int prev1 = 1; //the second added term
		int prev2 = 0; //the first added term
		int sum = 0; //the new second term
		int addend = 0; //holds the current even number
		int total = 0; //total of added even numbers
		
		while (sum < 4000000) {
			sum = prev1 + prev2;
			newt = sum + prev1;
			prev2 = prev1;
			prev1 = sum;
			
			if (sum%2 == 0) {
				addend = sum;
			}
			else {
				continue;
			}
			
			total = addend + total;
		}
		
		System.out.println(total);
			
		/*	
		sum = prev1 + prev2;   //1
		newt = sum + prev1;    //1 
		prev2 = prev1;         //1
		prev1 = sum;		   //1
		
		sum = prev1 + prev2;   //2
		newt = sum + prev1;    //3 
		prev2 = prev1;         //1
		prev1 = sum;		   //2
		
		sum = prev1 + prev2;   //3
		newt = sum + prev1;    //5 
		prev2 = prev1;         //2
		prev1 = sum;		   //3
		
		sum = prev1 + prev2;   //5
		newt = sum + prev1;    //8
		prev2 = prev1;         //3
		prev1 = sum;		   //5
		*/
	
	}

}
