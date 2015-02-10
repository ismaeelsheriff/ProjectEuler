
public class Euler6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumthensquare = 0;
		int squareofsumthensquare = 0;
		int squarethensum = 0;
		int dif = 0;
		
		for (int i = 1; i <= 100; i++) {
			sumthensquare = i + sumthensquare;
			squarethensum = i*i + squarethensum;
		}
		
		squareofsumthensquare = sumthensquare*sumthensquare;
		dif = squareofsumthensquare - squarethensum;
		
		System.out.println("The square of the sums is: " + squareofsumthensquare);
		System.out.println("The sum of the squares is: " + squarethensum);
		System.out.println("The difference between the square of the sums and the sum of the squares is: "+ dif);
	}

}
