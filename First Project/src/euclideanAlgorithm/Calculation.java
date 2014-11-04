package euclideanAlgorithm;

public class Calculation {
	public static int get_calculation(int a, int b) {
		int one = 0, two = 0, four = 0;
		int ggt = 0;
		// one = two * three + four
		one = a;
		two = b;
		four = one % two;
		while (four != 0) {
			one = two;
			two = four;
			four = one % two;
		}
		ggt = two;
		return ggt;
	}
}
