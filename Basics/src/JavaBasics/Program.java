package JavaBasics;



	public class Program {
		public static void main(String[] args) {
			int[] ARR = new int[] {1,2,3,4,5,7,8,9,10};
			BasicJava basics = new BasicJava();
 			basics.oneto255();
			basics.odd();
			basics.sum();
			basics.iteratingArray(ARR);
			basics.findMax(ARR);
			basics.findAvg(ARR);
			basics.arrayOddNumber();
			System.out.println(basics.greaterThanY(ARR, 5));
			basics.squareValue(ARR);
			basics.eliminateNegative(new int[] {-1,-2,-3,-4,-5,7,8,9,10});
			System.out.println(basics.maxMinAvg(ARR));
			basics.shiftingValue(ARR);
		}

	}


