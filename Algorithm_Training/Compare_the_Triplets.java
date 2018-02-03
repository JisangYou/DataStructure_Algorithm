package Algorithm_Training;

import java.util.Scanner;

public class Compare_the_Triplets {

	static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
		int total_a = 0;
		int total_b = 0;

		if (a0 > b0) {
			total_a += 1;
		}
		if (a1 > b1) {
			total_a += 1;
		}
		if (a2 > b2) {
			total_a += 1;
		}
		if (a0 < b0) {
			total_b += 1;
		}
		if (a1 < b1) {
			total_b += 1;
		}
		if (a2 < b2) {
			total_b += 1;
		}

		int output[] = new int[] { total_a, total_b };

		return output;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int[] result = solve(a0, a1, a2, b0, b1, b2);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
		}
		System.out.println("");

	}

}

// if,else if와 그냥 if, if, if,의 차이가 있다!!
