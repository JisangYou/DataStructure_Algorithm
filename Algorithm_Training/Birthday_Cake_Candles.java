package Algorithm_Training;

import java.util.Arrays;
import java.util.Scanner;

public class Birthday_Cake_Candles {

	static int birthdayCakeCandles(int n, int[] ar) {

		int count = 0;

		Arrays.sort(ar);

		for (int i = 0; i < n; i++) {
			if (ar[n - 1] == ar[i]) {
				count++;
				
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = birthdayCakeCandles(n, ar);
		System.out.println(result);
	}

}
