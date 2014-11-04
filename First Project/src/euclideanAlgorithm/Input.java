package euclideanAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
	public static int get_input() {
		int input = 0;
		InputStreamReader stdin = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(stdin);
		String str1;
		try {
			str1 = console.readLine();
			input = Integer.parseInt(str1);
		} catch (IOException e) {
			System.out.println("Input error");
			System.exit(1);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage() + " is not numeric");
			System.exit(1);
		}
		return input;
	}
}
