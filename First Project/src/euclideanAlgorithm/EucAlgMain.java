package euclideanAlgorithm;

public class EucAlgMain {

	public static void main(String[] args) {
		//
		// Initializing
		//
		int a = 0, b = 0, ggt = 0;
		//
		// Get Input
		//
		System.out.println("Format: a/b a>=b");
		System.out.println("Enter a: ");
		a = Input.get_input();
		System.out.println("Enter b: ");
		b = Input.get_input();
		System.out.println("A: " + a + "; B: " + b + ";");
		//
		// Calculation
		//
		ggt = Calculation.get_calculation(a, b);
		//
		// Output
		//
		System.out.println("ggT = " + ggt);
	}

}
