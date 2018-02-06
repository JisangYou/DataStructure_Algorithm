package Algorithm_Training;

import java.util.Scanner;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {

		int second = 1;
		boolean check = false;

		while (second < 10000) {

			if (x1 + (v1 * second) == x2 + (v2 * second)) {
				return "YES";
			} else
				second++;
		}
		return "NO";

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}

}
