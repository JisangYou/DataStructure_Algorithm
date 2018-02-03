package Algorithm_Training;

import java.util.Scanner;

public class Simple_Array_sum {

	static int simpleArraySum(int n, int[] ar) {

		int total = 0;
		for (int i = 0; i < n; i++) {
			total += ar[i];

		}
		return total;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = simpleArraySum(n, ar);
		System.out.println(result);
	}
}
