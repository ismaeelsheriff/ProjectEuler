
public class Euler5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startnum = 1;
		long divisor = 1;
		long end = 0;
		
		for (long i = 1; i <= 20; i++) {		
			startnum = i*startnum;				//startnum = 20!
		}	
		
		System.out.println(startnum);
		end = startnum/(2*4*6*8*9*10*12*14*15*16*18*20);
		System.out.println(end);
	}
}

//YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY