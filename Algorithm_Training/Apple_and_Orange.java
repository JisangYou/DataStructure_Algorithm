package Algorithm_Training;

import java.util.Scanner;

public class Apple_and_Orange {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int count = 0;
		int count2 = 0;

		for (int i = 0; i < apples.length; i++) {
			if (apples[i] + a >= s && apples[i] + a <= t) {
				count++;
			}

		}

		for (int j = 0; j < oranges.length; j++) {
			if (oranges[j] + b >= s && oranges[j] + b <= t) {
				count2++;
			}
		}

		System.out.println(count);
		System.out.println(count2);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int[] apple = new int[m];
		for (int apple_i = 0; apple_i < m; apple_i++) {
			apple[apple_i] = in.nextInt();
		}
		int[] orange = new int[n];
		for (int orange_i = 0; orange_i < n; orange_i++) {
			orange[orange_i] = in.nextInt();
		}
		countApplesAndOranges(s, t, a, b, apple, orange);
		in.close();
	}

}
